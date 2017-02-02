package com.qa.cinema.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qa.cinema.model.Cinema;

@Path("/Cinemas")
@RequestScoped
public class CinemaService {
	@Inject
	private EntityManager em;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cinema> getCinemas() {
		final List<Cinema> results = em.createQuery("select c from cin_cinema c").getResultList();
		return results;
	}
}
