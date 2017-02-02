package com.qa.cinema.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cin_cust_rating database table.
 * 
 */
@Entity
@Table(name="cin_cust_rating")
@NamedQuery(name="CinCustRating.findAll", query="SELECT c FROM CinCustRating c")
public class CinCustRating implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="rating_id", unique=true, nullable=false)
	private int ratingId;

	@Column(name="rating_stars", nullable=false, length=1)
	private String ratingStars;

	//bi-directional many-to-one association to CinFilm
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="rating_film_id", nullable=false)
	private CinFilm film;

	public CinCustRating() {
	}

	public int getRatingId() {
		return this.ratingId;
	}

	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}

	public String getRatingStars() {
		return this.ratingStars;
	}

	public void setRatingStars(String ratingStars) {
		this.ratingStars = ratingStars;
	}

	public CinFilm getFilm() {
		return this.film;
	}

	public void setFilm(CinFilm film) {
		this.film = film;
	}

}