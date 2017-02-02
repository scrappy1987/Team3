package com.qa.cinema;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestScoped
public class AddressService {
	
	@Inject
	private EntityManager em;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void addAddress(Address newAddress){
		em.createQuery("INSERT INTO Address(address_line1, address_line2, address_county, address_country, address_postCode) VALUES(newAddress.line1, newAddress.line2, newAddress.county, newAddress.country, newAddress.postCode);");
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateAddress(Address newAddress, Address oldAddress){
		Address tmp = (Address)em.createQuery("SELECT * FROM Address WHERE address_line1 = '" + oldAddress.getLine1() + "' AND address_postcode ='" + oldAddress.getPostCode() + "';").getSingleResult();
		em.createQuery("UPDATE Address SET address_line1 ='" +
						newAddress.getLine1() +
						"', address_line2 = '" +
						newAddress.getLine2() +
						"', address_county = '" + 
						newAddress.getCounty() +
						"', address_country ='" +
						newAddress.getCountry() +
						"', address_postCode = '"+
						newAddress.getPostCode() +
						"' WHERE address_line1 ='" + 
						tmp.getLine1() +
						"' AND address_postcode ='" +
						tmp.getPostCode() +"';"
					);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteAddress(Address address){
		em.createQuery("DELETE FROM Address WHERE address_line1 = '" + address.getLine1() + "' AND address_postcode ='" + address.getPostCode() + "';");
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Address> getAddress(String AddressLine1, String PostCode){
		@SuppressWarnings("unchecked")
		final List<Address>tmp = em.createQuery("SELECT * FROM Address WHERE Address_line1 = '" + AddressLine1 + "' AND Address_postcode = '" + PostCode + "';").getResultList();
		return tmp;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Address> getAllAddresses(){
		@SuppressWarnings("unchecked")
		final List<Address> tmp = em.createQuery("SELECT * FROM Address ORDER BY address_county").getResultList();
		return tmp;
	}
}
