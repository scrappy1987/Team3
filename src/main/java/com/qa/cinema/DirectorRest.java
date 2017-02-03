package com.qa.cinema;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;


@Path("/director")
public class DirectorRest {
	
	@Inject
	DirectorService directorService;
	
	@GET
	@Path("/json")
	@Produces({"application/json"})
	public String getDirector() {
		return directorService.getDirector();
	}
	
	@POST
	@Path("/json")
	@Produces({"application/json"})
	public String addDirector(String Director) {
		directorService.createDirectorToMap(Director);
	return "You have successfuly added a new director";
	}

	@POST
	@Path("/json")
	@Produces({"application/json"})
	public String deleteDirector(String deleteDirectorFromClient) {
		directorService.removeDirector(deleteDirectorFromClient);
		return "Director deleted"
	}
}
