package com.qa.cinema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Actor {
	
	@Id
	@GeneratedValue
	protected long actor_id;
	
	@Column(name="actor_name", length=100)
	protected String actor_name;

	public Actor(long actor_id, String actor_name) {
		super();
		this.actor_id = actor_id;
		this.actor_name = actor_name;
	}

	public Actor() {
		
	}

	public long getActor_id() {
		return actor_id;
	}

	public void setActor_id(long actor_id) {
		this.actor_id = actor_id;
	}

	public String getActor_name() {
		return actor_name;
	}

	public void setActor_name(String actor_name) {
		this.actor_name = actor_name;
	}

	@Override
	public String toString() {
		return "Actor [actor_id=" + actor_id + ", actor_name=" + actor_name
				+ ", getActor_id()=" + getActor_id() + ", getActor_name()="
				+ getActor_name() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
