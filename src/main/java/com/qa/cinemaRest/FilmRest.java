package com.qa.cinemaRest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.cinema.Film;
import com.qa.cinemaServices.FilmService;

@Path("/Film")
public class FilmRest {

	@Inject
	FilmService filmService;

	@GET
	@Path("/Json")
	@Produces({ "application/json" })
	public List<Film> getAllFilms() {
		return filmService.getAllFilms();
	}
	
	@GET
	@Path("/Json")
	@Produces({ "application/json" })
	public Film getFilms(int ID) {
		return filmService.getFilm(ID);
	}

	@POST
	@Path("/Json")
	@Produces({ "application/json" })
	public void createFilm(String jsonString) {
		filmService.createFilm(jsonString);
	}
	
	@POST
	@Path("/Json")
	@Produces({ "application/json" })
	public void createFilm(Film film) {
		filmService.createFilm(film);
	}
	
	@POST
	@Path("/Json")
	@Produces({ "application/json" })
	public String updateFilm(String jsonString){
		filmService.updateFilm(jsonString);
		return "";
	}
	
	
	@POST
	@Path("/Json")
	@Produces({ "application/json" })
	public String removeFilm(Film film){
		filmService.removeFilm(film);
		return "";
	}
	
}
