package com.qa.cinema;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestScoped
public class AddressService {
	
	@Inject
	private EntityManager em;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Address> getAllAddresses(){
		final List<Address> tmp = em.createQuery("SELECT a FROM a ORDER BY a.county").getResultList();
		return tmp;
	}
}
