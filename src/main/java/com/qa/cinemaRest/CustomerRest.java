package com.qa.cinemaRest;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.qa.cinemaServices.CustomerServices;


public class CustomerRest {
	
	@Inject
	CustomerServices customerService;
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCustomers() {
		return "{\" results : \":\"" + customerService.listAllCustomers() + "\"}";
	}
	
	@GET
	@Path("/{title}")
	@Produces(MediaType.APPLICATION_JSON)
	public String addCustomer() {
		return "{\" results : \":\"" + customerService.createCustomer();
	}
	
	
}
