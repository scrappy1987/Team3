package com.qa.cinema;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestScoped
public class FacilityService {
	@Inject
	private EntityManager em;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getTitle(int ID){
		String tmp = em.createQuery(
				"SELECT facility_title FROM facility WHERE facility_id = '" + ID + "';"
			).toString();
		return tmp;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getDescription(int ID){
		String tmp = em.createQuery(
				"SELECT facility_description FROM facility WHERE facility_id = '" + ID + "';"
			).toString();
		return tmp;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void addFacility(Facility facility){
		em.createQuery(
			"INSERT INTO facility(facility_title, facility_description) VALUES("+facility.getTitle()+", "+facility.getDescription()+");"
		);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void removeFacility(String title){
		em.createQuery(
			"DELETE FROM facility WHERE facility_title='" + title + "';"
		);
	}
}
