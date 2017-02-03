package com.qa.cinemaRest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.cinemaServices.FilmService;

@Path("/Film")
public class FilmRest {

	@Inject
	FilmService filmService;

	@GET
	@Path("/Json")
	@Produces({ "application/json" })
	public String getFilms() {
		return filmService.getFilmsAsJSon();
	}

	@POST
	@Path("/Json")
	@Produces({ "application/json" })
	public String addFilm(String filmPostedFromClient) {
		filmService.createFilmFromJSon(filmPostedFromClient);
		return "";
	}
	
	@POST
	@Path("/Json")
	@Produces({ "application/json" })
	public String updateFilm(String filmUpdatedByClient, int filmID){
		filmService.updateFilmFromJSon(filmUpdatedByClient, filmID);
		return "";
	}
	
	
	@POST
	@Path("/Json")
	@Produces({ "application/json" })
	public String deleteFilm(String deletedFilmFromClient){
		filmService.removeFilm(deletedFilmFromClient);
		return "";
	}
	
}
