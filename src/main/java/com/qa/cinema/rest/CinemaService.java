package com.qa.cinema.rest;

import javax.persistence.EntityManager;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.ObjectNotFoundException;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import com.google.gson.Gson;
import com.qa.cinema.model.Cinema;

@RequestScoped
public class CinemaService {
	//Helper helper;
	
	@Inject
	private Gson gson;
	
	@Inject
	private EntityManager em;
	
	public CinemaService(EntityManager em) {
		this.em = em;
		//helper = new Helper();
		gson = new Gson();
	}
	
	public String getCinemaAsJsonByID(int cinema_id) throws ObjectNotFoundException, ClassCastException, ClassNotFoundException {
		Cinema cinema = em.find(Cinema.class, cinema_id);
		if (cinema != null) {
			return gson.toJson(cinema);
		}
		else {
			// Do logger stuff
			throw new ObjectNotFoundException("Cinema Object Not Found for ID: " + cinema_id);
		}
	}
	
	public Cinema getCinemaObjByID(int cinema_id) throws ObjectNotFoundException {
		Cinema cinema = em.find(Cinema.class, cinema_id);
		if (cinema != null) {
			return cinema;
		}
		else {
			// Do logger stuff
			throw new ObjectNotFoundException("Cinema Object Not Found for ID: " + cinema_id);
		}
	}
	
	@SuppressWarnings("unchecked")
	public String getCinemas() {
		List<Cinema> cinemas = new ArrayList<Cinema>();
		cinemas = em.createQuery("SELECT c FROM cin_cinema c").getResultList();
		if (cinemas != null)
			return gson.toJson(cinemas);
		else 
			return "";
	}
	
	public void addCinema(String cinemaToAddAsJson) {
		Cinema cinema = (Cinema) gson.fromJson(cinemaToAddAsJson, Cinema.class);
		addCinema(cinema);
	}
	
	public void addCinema(Cinema cinemaToAdd) { 
		Cinema cin;
		boolean exists = ((cin = em.find(Cinema.class, cinemaToAdd)) != null) ? true : false;
		if (!exists) {
			// Do Logger Stuff
		}
		else {
			// Do Logger Stuff
			em.persist(cin);
		}
			
	}
	
	public void updateCinemaFromJson(String updatedCinemaJson) {
		Cinema updatedCinema = (Cinema) gson.fromJson(updatedCinemaJson, Cinema.class);
		Cinema cinemaToUpdate = em.find(Cinema.class, updatedCinema.getId());
		em.persist(cinemaToUpdate);
	}
	
	
}
