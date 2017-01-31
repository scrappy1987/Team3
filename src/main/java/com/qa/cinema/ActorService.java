package com.qa.cinema;

import javax.persistence.EntityManager;

public class ActorService {
	
	private EntityManager em;

	public ActorService(EntityManager em) {
		super();
		this.em = em;
	}

	public Actor createActor(Actor actor) {
		em.persist(actor);
		return actor;
	}
	
	public void removeActor(long actor_id) {
		Actor actor = em.find(Actor.class, actor_id);
		if(actor != null)
			em.remove(actor);
	}
	
	public Actor findActor(long actor_id) {
		return em.find(Actor.class,actor_id);
	}
}
