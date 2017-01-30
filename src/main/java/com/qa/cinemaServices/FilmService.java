package com.qa.cinemaServices;

import javax.persistence.EntityManager;

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

	public Film createFilm(Film film) {
		em.persist(film);
		return film;
	}

	public void removeFilm(Long id) {
		Film film = em.find(Film.class, id);
		if (film != null)
			em.remove(film);
	}

	public Film findFilm(Long id) {
		return em.find(Film.class, id);
	}
}