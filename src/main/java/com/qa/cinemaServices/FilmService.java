package com.qa.cinemaServices;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.jboss.logging.Logger;

import com.google.gson.Gson;
import com.qa.cinema.Film;

public class FilmService {

	private static final Logger FILM_LOGGER = Logger.getLogger(Film.class);

	@Inject
	private EntityManager em;

	@Inject
	private Gson gsonParser;

	public void createFilm(String jsonString) {
		Film film = gsonParser.fromJson(jsonString, Film.class);
		this.createFilm(film);
	}

	public void createFilm(Film film) {
		Film checker = em.find(Film.class, film);
		if (checker != null) {
			FILM_LOGGER.info("Film already exists. Film not added");
		} else {
			em.persist(film);
			FILM_LOGGER.info("Film added successfully");
		}
	}

	public Film getFilm(int ID) {
		Film film = em.find(Film.class, ID);
		if (film == null) {
			FILM_LOGGER.info("ID doesn't macth existing Film");
			return null;
		} else {
			return film;
		}
	}

	public List<Film> getAllFilms() {
		@SuppressWarnings("unchecked")
		List<Film> filmList = em.createQuery("SELECT f FROM Film f")
				.getResultList();
		return filmList;
	}

	public void removeFilm(String jsonString) {
		Film film = gsonParser.fromJson(jsonString, Film.class);
		removeFilm(film);
	}

	public void removeFilm(Film film) {
		Film checker = em.find(Film.class, film);
		if (checker == null) {
			FILM_LOGGER.info("Film doesn't Exist");
		} else {
			em.remove(film);
			FILM_LOGGER.info("Film removed Successfully");
		}
	}

	public void updateFilm(String jsonString) {
		Film film = gsonParser.fromJson(jsonString, Film.class);
		updateScreen(film);
	}

	public void updateScreen(Film film) {
		Film checker = em.find(Film.class, film);
		if (checker == null) {
			FILM_LOGGER.info("Screen doesn't exist");
		} else {
			em.merge(film);
			FILM_LOGGER.info("Screen updated successfully");

		}
	}
}