package com.qa.cinema.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cin_director database table.
 * 
 */
@Entity
@Table(name="cin_director")
@NamedQuery(name="CinDirector.findAll", query="SELECT c FROM CinDirector c")
public class CinDirector implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="director_id", unique=true, nullable=false)
	private int directorId;

	@Column(name="director_name", nullable=false, length=100)
	private String directorName;

	public CinDirector() {
	}

	public int getDirectorId() {
		return this.directorId;
	}

	public void setDirectorId(int directorId) {
		this.directorId = directorId;
	}

	public String getDirectorName() {
		return this.directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

}