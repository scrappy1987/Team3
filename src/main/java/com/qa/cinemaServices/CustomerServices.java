package com.qa.cinemaServices;

import java.util.*;
import com.google.gson.Gson;
import com.qa.cinema.Customer;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.jboss.logging.Logger;


public class CustomerServices {
	
	private static final Logger LOGGER = Logger.getLogger(Customer.class);
	
	@Inject
	private EntityManager em;
	
	Gson gson = new Gson();

	public List<Customer> returnCustomers() {
		List<Customer> custList = new ArrayList<Customer>();
		custList.add(new Customer(1, "Kimberley", "McGill", "test@test.com", 123456789));
		custList.add(new Customer(2, "Chris", "Doodson", "test2@test.com", 976543));
		return custList;
	}
	
	public List<Customer> listAllCustomers() {
		Query customerResults = em.createQuery("SELECT * FROM customer ORDER BY cust_id;");
		
		if(customerResults != null) {
			return null;
		} else {
			List<Customer> customers = customerResults.getResultList(); 
			return customers;
		}
	}
	

	public void createCustomer(String aCustomer) {
		Customer newCust = gson.fromJson(aCustomer, Customer.class);
		Customer checkCustExists = em.find(Customer.class, newCust);
		
		if (checkCustExists != null) {
			LOGGER.info("Customer already exists");
		} else {
			em.persist(newCust);
			LOGGER.info("New Customer has been created");
		}
	}
	
	
	public void removeCustomer(String aCustomer) {
		Customer removeCust = gson.fromJson(aCustomer, Customer.class);
		Customer validCust = em.find(Customer.class, removeCust);
		
		if (validCust == null) {
			LOGGER.info("Customer doesn't exist, or has already been deleted");
		} else {
			em.remove(removeCust);
			LOGGER.info("Customer has been removed");
		}
	}
	
	
	public void updateCustomer(String updateCustDetails) {
		Customer customer = gson.fromJson(updateCustDetails, Customer.class);
		Customer custCheck = em.find(Customer.class, customer);
		
		if (customer == null) {
			LOGGER.info("Customer doesn't exist");
		} else {
			em.merge(customer);
			LOGGER.info("Customer has been updated");
		}
	}
	
}
