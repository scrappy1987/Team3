package com.qa.cinemaEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Director {
	
	@Id
	@GeneratedValue
	private int directorID;
	
	@NotNull
	@Column
	protected String director_name;
	
	public Director () {};
	
	public Director(int directorID, String director_name) {
		super();
		this.directorID = directorID;
		this.director_name = director_name;
	}
	
	public int getDirectorID() {
		return directorID;
	}


	
	public void setDirectorID(int directorID) {
		this.directorID = directorID;
	}

	public String getDirector_name() {
		return director_name;
	}

	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}

	@Override
	public String toString() {
		return "director [directorID=" + directorID + ", director_name="
				+ director_name + ", getDirectorID()=" + getDirectorID()
				+ ", getDirector_name()=" + getDirector_name()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}