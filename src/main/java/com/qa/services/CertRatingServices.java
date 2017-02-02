package com.qa.services;

import java.util.List;
import com.sun.istack.internal.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.persistence.EntityManager;

import com.google.gson.Gson;
import com.qa.cinema.CertRating;
import com.qa.cinema.ListAll;


@Path("/certifications")
@RequestScoped

public class CertRatingServices {
	
	private static final Logger LOGGER = Logger.getLogger(CertRating.class);
	
	@Inject
	private EntityManager entitymanager;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<CertRating> listAll() {
		final List<CertRating> cert_results = entitymanager.createQuery("SELECT * FROM CERT_RATING ORDER BY RATING_TITLE;").getResultList();
		return cert_results;
	}
	
	public void createCert(String aCertRating) {
		Gson gson = new Gson();
		CertRating newCert = gson.fromJson(aCertRating, CertRating.class);
		entitymanager.persist(newCert);
		LOGGER.info("Certification has been added to the database");
	}
	
	public void deleteCert(String removeCert) {
		Gson gson = new Gson();
		CertRating removedCert = gson.fromJson(removeCert, CertRating.class);
		
		//String title = removedCert.getRatingTitle();
		//String removeCertString = gson.fromJson(entitymanager.createQuery("DELETE * FROM CERT_RATING WHERE RATING_TITLE = $
	}
	
}
