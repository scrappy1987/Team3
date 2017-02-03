package com.qa.cinemaServices;

import java.awt.List;
import com.qa.cinema.Customer;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;

@Path("/customer")
@RequestScoped
public class CustomerServices {
	
	private static final Logger LOGGER = Logger.getLogger(Customer.class);
	
	@Inject
	private EntityManager em;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> listAll() {
		final List<Customer> customerResults = em.createQuery("SELECT * FROM customer ORDER BY cust_id;");
		return customerResults;
	}
	
	
	
	
	
}
