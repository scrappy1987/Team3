package com.qa.cinema;

import javax.persistence.EntityManager;


public class Director_service {

	private EntityManager em;
	
	public Director_service(EntityManager em){
		this.em=em;
	}
	
	public director createDirector(director d1) {
		em.persist(d1);
		return d1;
	}

	public void removeDirector(Long directorID) {
		director d1 = em.find(director.class, directorID);
		if (d1 != null)
			em.remove(d1);
	}

	public director findDirector(Long directorID) {
		return em.find(director.class, directorID);
	}
	
}