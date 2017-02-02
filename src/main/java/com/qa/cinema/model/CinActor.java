package com.qa.cinema.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cin_actor database table.
 * 
 */
@Entity
@Table(name="cin_actor")
@NamedQuery(name="Actor.findAll", query="SELECT a FROM Actor a")
public class CinActor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="actor_id", unique=true, nullable=false)
	private int actorId;

	@Column(name="actor_name", nullable=false, length=100)
	private String actorName;

	public Actor() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}