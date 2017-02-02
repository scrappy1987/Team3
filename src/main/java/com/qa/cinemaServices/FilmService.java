package com.qa.cinemaServices;

import javax.persistence.EntityManager;

import com.google.gson.Gson;
import com.qa.cinema.Film;

public class FilmService {

	// ======================================
	// = Attributes =
	// ======================================

	private EntityManager em;

	// ======================================
	// = Constructors =
	// ======================================

	public FilmService(EntityManager em) {
		this.em = em;
	}

	// ======================================
	// = Public Methods =
	// ======================================

	public String getFilmsAsJSon() {
		Gson gson = new Gson();
		String filmsString = gson.toJson(em
				.createQuery("SELECT * FROM cin_film ORDER BY Release_Date;"));
		return filmsString;

	}

	public String createFilmFromJSon(String filmPostedFromClient) {
		Gson gson = new Gson();
		Film newFilm = gson.fromJson(filmPostedFromClient, Film.class);
		em.persist(newFilm);
		return "New Movie added";
	}

	public String updateFilmFromJSon(long filmID) {
		Film filmToUpdate = em.find(Film.class, filmID);
		Gson gson = new Gson();
		Film updateFilm = gson.fromJson(filmUpdatedByClient, Film.class);
		em.persist(updateFilm);
		
		
		
		if (em != null) {
			
		}
		return "Film Successfully Updated";
	}

	public void removeFilm(String deletedFilmFromClient) {
		Gson gson = new Gson();
		Film filmToBeDeleted = gson.fromJson(deletedFilmFromClient, Film.class);
		filmToBeDeleted = em.find(Film.class, filmID);
		if (filmToBeDeleted != null)
			em.remove(filmToBeDeleted);
	}

	public Film findFilm(Long filmID) {
		return em.find(Film.class, filmID);
	}

	public Film findFilm(String filmTitle) {
		return em.find(Film.class, filmTitle);
	}

}