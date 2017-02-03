package com.qa.cinema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;


@Entity
public class Director {
	
	@Id
	@GeneratedValue
	private int directorID;
	
	@OneToMany(mappedBy = "Film")
	
	@NotNull
	@Column
	private  String director_name;
	
	public Director () {};

	public Director(int directorID, String directorName) {
		super();
		this.directorID = directorID;
		this.director_name = directorName;
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
	public void setDirector_name(String directorName) {
		this.director_name = directorName;
	}
	
	@Override
	public String toString() {
		return "director [directorID=" + directorID + ", director_name="
				+ director_name + ", getDirectorID()=" + getDirectorID()
				+ ", getDirector_name()=" + getDirector_name();
	}
}