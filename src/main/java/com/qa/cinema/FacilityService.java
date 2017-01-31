package com.qa.cinema;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestScoped
public class FacilityService {
	@Inject
	private EntityManager em;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getTitle(){
		String tmp = em.createQuery("SELECT f FROM f WHERE id = f.ID").toString();
		return tmp;
	}
}
