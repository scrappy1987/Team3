package com.qa.cinema.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cin_genre database table.
 * 
 */
@Entity
@Table(name="cin_genre")
@NamedQuery(name="CinGenre.findAll", query="SELECT c FROM CinGenre c")
public class CinGenre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="genre_id", unique=true, nullable=false)
	private int genreId;

	@Column(name="genre_name", nullable=false, length=100)
	private String genreName;

	public CinGenre() {
	}

	public int getGenreId() {
		return this.genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	public String getGenreName() {
		return this.genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}

}