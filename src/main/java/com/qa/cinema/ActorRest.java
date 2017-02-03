package com.qa.cinema;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.qa.cinema.ActorService;

@Path("/actor")
public class ActorRest {

	@Inject
	ActorService actorService;
	
	@GET
	@Path("/json")
	@Produces({"application/json"})
	public String getActor() {
		return actorService.getActorAsJSon();
	}
	
	
	@POST
	@Path("/json")
	@Produces({"application/json"})
	public String addActor(String actor) {
		actorService.createActorFromJson(actor);
		return "Actor added";
	}
	
/*	@POST
	@Path("/json")
	@Produces({"application/json"})
	public String updateActor(String actorupdatebyclient,int actorID) {
		actorService.updateActorfromJSon(actorupdatebyclient,actorID);
		return "actor updated";
	}*/
	
	@POST
	@Path("/json")
	@Produces({"application/json"})
	public String deleteActor(String deletedActorFromClient) {
		actorService.removeActor(deletedActorFromClient);
		return "Actor deleted";
	}
}
