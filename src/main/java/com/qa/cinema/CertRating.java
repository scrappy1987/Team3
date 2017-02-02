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
@Table(name="cert_rating")
public class CertRating {

	// variables
	@Id
	@NotNull
	@Column(name="rating_title")
	private String ratingTitle;
	
	@NotNull
	@Column(name="rating_description")
	private String ratingDescription;
	
	@OneToMany
	private Set<Film> films = new HashSet<>();

	public CertRating(String ratingTitle, String ratingDescription,
			Set<Film> films) {
		super();
		this.ratingTitle = ratingTitle;
		this.ratingDescription = ratingDescription;
		this.films = films;
	}

	
	public String getRatingTitle() {
		return ratingTitle;
	}

	public void setRatingTitle(String ratingTitle) {
		this.ratingTitle = ratingTitle;
	}

	public String getRatingDescription() {
		return ratingDescription;
	}

	public void setRatingDescription(String ratingDescription) {
		this.ratingDescription = ratingDescription;
	}

	public Set<Film> getFilms() {
		return films;
	}

	public void setFilms(Set<Film> films) {
		this.films = films;
	}
	

	
	
}
