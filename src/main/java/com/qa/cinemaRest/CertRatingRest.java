package com.qa.cinemaRest;

import javax.inject.Inject;
import javax.ws.rs.*;

import com.qa.cinema.CertRating;

@Path("/certifications")
public class CertRatingRest {

	@Inject
	CertRating certRating;
	
	@GET
	@Path("/certs")
	@Produces( { "application/json" })
	public String getCerts() {
		String full_desc = "Certification: " + certRating.getRatingTitle() + " - " + certRating.getRatingDescription();
		return full_desc;
	}
	
	@POST
	@Path("/certManage")
	@Produces({ "application/json" })
	public String addCerts(String title, String description) {
		
		return null;
	}
}
