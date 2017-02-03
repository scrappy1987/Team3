/** 
 * Package: com.qa.cinema
 * File: CertRating
 * @Author: Kimberley McGill
 * 
 * Description: The CertRating class to explain the ratings
 * for the films shown in our cinema
 * Each rating will have a ratingID, a ratingTitle and a 
 * ratingDescription.
 */
package com.qa.cinema;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="cin_cert_rating")
public class CertRating {

	// variables
	@Id
	@NotNull
	@Column(name="title")
	private String title;
	
	@NotNull
	@Column(name="rating_description")
	private String description;
	
	@OneToMany
	//private Set<Film> films = new HashSet<Film>();
	private Set<Film> films = new HashSet<>();

	public CertRating(String title, String description,
			Set<Film> films) {
		this.title = title;
		this.description = description;
		this.films = films;
	}

	
	public String getRatingTitle() {
		return title;
	}

	public void setRatingTitle(String ratingTitle) {
		this.title = ratingTitle;
	}

	public String getRatingDescription() {
		return description;
	}

	public void setRatingDescription(String ratingDescription) {
		this.description = ratingDescription;
	}

	public Set<Film> getFilms() {
		return films.toString();
	}

	public void setFilms(Set<Film> films) {
		this.films = films;
	}
	

	public String toString() {
		for (Film films : film) {
			System.out.println(film.getTitle() + " " + film.getDescription());
		}
	}
	
	
	
}
