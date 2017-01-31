package com.qa.services;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.persistence.EntityManager;

import com.qa.cinema.CertRating;
import com.qa.cinema.ListAll;


@Path("/certifications")
@RequestScoped

public class CertRatingServices {
	
	@Inject
	private EntityManager entitymanager;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<CertRating> listAll() {
		final List<CertRating> cert_results = entitymanager.createQuery("SELECT * FROM CERT_RATING ORDER BY RATING_TITLE").getResultList();
		return cert_results;
	}
}
