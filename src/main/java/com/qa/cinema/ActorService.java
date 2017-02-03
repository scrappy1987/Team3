package com.qa.cinema;

//import java.util.HashMap;
import com.qa.cinema.Actor;
//import java.util.Map;
//import javax.persistence.*;
import javax.persistence.EntityManager;
import com.google.gson.Gson;

//import org.apache.log4j.Logger;

public class ActorService {
	
	//private static final Logger LOGGER = Logger.getLogger(ActorService.class);
	
	//private Map<Integer,Actor> actorMap;
	private EntityManager em;

	public ActorService(EntityManager em) {
		this.em = em;
	}
	
	public ActorService() {
		
	}
	
	public String getActorAsJSon() {
		Gson gson = new Gson();
		Actor obj = createDummyObject();
		String actorString = gson.toJson(obj);
		return actorString;
	}
	
	private static Actor createDummyObject() {
		Actor actor = new Actor();
		
		actor.setActor_id(1);
		actor.setActor_name("Daniel Craig");
		
		return actor;
	}
	
	public String createActorFromJson(String actorpostedbyclient) {
		Gson gson = new Gson();
		Actor newActor = gson.fromJson(actorpostedbyclient,Actor.class);
		em.persist(newActor);
		return "New Movie Added.";
}
}
/*	
	public String createActorFromJson(String actorpostedbyclient) {
		Gson gson = new Gson();
		Actor newActor = gson.fromJson(actorpostedbyclient,Actor.class);
		em.persist(newActor);
		return "New Movie Added.";
	}
	
public String updateActorfromJSon(long actor_id){
		Actor actortoupdate = em.find(Actor.class,actor_id);
		Gson gson = new Gson();
		Actor updateActor = gson.fromJson(actorupdatedbyClient,Actor.class);
		em.persist(updateActor);
		
		if(em != null) {
			
		}
		return "actor Successfully updated.";
	}
	
	public void removeActor(String deletedActorfromclient) {
		Gson gson = new Gson();
		Actor actortobeDeleted = gson.fromJson(deletedActorfromclient,Actor.class);
		actortobeDeleted = em.find(Actor.class, deletedActorfromclient);
		if(actortobeDeleted != null)
			em.remove(actortobeDeleted);
	}
	
	public Actor findActor(long actor_id) {
		return em.find(Actor.class,actor_id);
	}
	
	public Actor findActor(String actorName) {
		return em.find(Actor.class, actorName);
	}*/
	
	
/*	public ActorService() {
		actorMap = new HashMap<Integer,Actor>();
		populateActor();
		
	}*/

/*public Actor createActor(Actor actor) {
		em.persist(actor);
		return actor;
	}*/
	
	/*public void populateActor() {
		Actor a = new Actor(1,"Daniel Craig");
		Actor b = new Actor(2,"Pierce Bronson");
		
		em.persist(a);
		em.persist(b);
	}*/
	
	/*public void removeActor(long actor_id) {
		Actor actor = em.find(Actor.class, actor_id);
		if(actor != null)
			em.remove(actor);
	}*/
	
	
	
/*	public void addActortoDB(String actorName) {
		Gson gson = new Gson();
		Actor newactor  = gson.fromJson(actorName, Actor.class);
		actorMap.put(3, newactor);
		LOGGER.info("This is ome log example");
	}
	
	public String covertActortoJSon() {
		Gson gson = new Gson();
		String actorString =  gson.toJson(actorMap);
		LOGGER.info("This is a message " + actorString);
		return actorString;
	}*/
	
	/*public Actor findActor(long actor_id) {
		return em.find(Actor.class,actor_id);
	}*/

