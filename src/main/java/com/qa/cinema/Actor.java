package com.qa.cinema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Actor")
public class Actor {

	@Id
	@GeneratedValue
	@Column(name = "actorID")
	protected long actorID;

	@NotNull
	@Column(name = "actor_name", length = 100)
	protected String actor_name;

	public Actor(long actor_id, String actor_name) {
		super();
		this.actorID = actor_id;
		this.actor_name = actor_name;
	}

	public Actor() {

	}

	public long getActor_id() {
		return actorID;
	}

	public void setActor_id(long actorID) {
		this.actorID = actorID;
	}

	public String getActor_name() {
		return actor_name;
	}

	public void setActor_name(String actor_name) {
		this.actor_name = actor_name;
	}

	@Override
	public String toString() {
		return "Actor [actor_id=" + actorID + ", actor_name=" + actor_name
				+ ", getActor_id()=" + getActor_id() + ", getActor_name()="
				+ getActor_name() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
