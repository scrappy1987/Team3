package com.qa.cinema;

import java.util.List;

import javax.inject.Inject;
import javax.management.Query;
import javax.persistence.EntityManager;
import org.apache.log4j.Logger;
import com.google.gson.Gson;

public class DirectorService {
	private static final Logger DIRECTORLOGGER = Logger.getLogger(Director.class);
			
	@Inject
	private EntityManager em;
	
	@Inject
	private Gson gsonParser;
	public void createDirector(String jsonString) {
		Director director = gsonParser.fromJson(jsonString, Director.class);
		this.createDirector(director);
	}
	
	public void createDirector(Director director) {
		Director checker = em.find(Director.class, director);
		if(checker != null) {
			DIRECTORLOGGER.info("Director not added, already exists");
		}
		else {
			em.persist(director);
			DIRECTORLOGGER.info("Director successfully added");
		}
	}
	
	public Director getDirector(long id) {
		Director director = em.find(Director.class, id);
		if (director == null) {
			DIRECTORLOGGER.info("Director of given id doesn't exist");
			return null;
		}
		else {
			return director;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Director> getDirectorAll() {
		Query query = (Query) em.createQuery("SLELECT d from showing d");
		if(query == null) {
			DIRECTORLOGGER.info("No Director exists");
			return null;
		}
		else {
			List<Director> resultList = ((javax.persistence.Query) query).getResultList();
			return resultList;
		}
	}
	
	public void removeDirector(String jsonString){
		Director director = gsonParser.fromJson(jsonString, Director.class);
		removeDirector(director);
	}
	
	public void removeDirector(Director director){
		Director checker = em.find(Director.class, director);
		if(checker == null){
			DIRECTORLOGGER.info("Director doesn't exist");
		} else {
			em.remove(director);
			DIRECTORLOGGER.info("Director removed successfully");
		}
	}
	
	public void updateDirector(String jsonString){
		Director director = gsonParser.fromJson(jsonString, Director.class);
		updateDirector(director);
	}
	
	public void updateDirector(Director director){
		Director checker = em.find(Director.class, director);
		if(checker == null){
			DIRECTORLOGGER.info("Director doesn't exist");
		} else {
			em.merge(director);
			DIRECTORLOGGER.info("Director updated successfully");
		}
	}
	
	
	
	
}