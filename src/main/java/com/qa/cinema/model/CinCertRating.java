package com.qa.cinema.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cin_cert_rating database table.
 * 
 */
@Entity
@Table(name="cin_cert_rating")
@NamedQuery(name="CinCertRating.findAll", query="SELECT c FROM CinCertRating c")
public class CinCertRating implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cert_rating_id", unique=true, nullable=false)
	private int certRatingId;

	@Column(name="cert_rating_description", nullable=false, length=250)
	private String certRatingDescription;

	@Column(name="cert_rating_title", nullable=false, length=45)
	private String certRatingTitle;

	//bi-directional many-to-one association to CinFilm
	@OneToMany(mappedBy="certRating")
	private List<CinFilm> films;

	public CinCertRating() {
	}

	public int getCertRatingId() {
		return this.certRatingId;
	}

	public void setCertRatingId(int certRatingId) {
		this.certRatingId = certRatingId;
	}

	public String getCertRatingDescription() {
		return this.certRatingDescription;
	}

	public void setCertRatingDescription(String certRatingDescription) {
		this.certRatingDescription = certRatingDescription;
	}

	public String getCertRatingTitle() {
		return this.certRatingTitle;
	}

	public void setCertRatingTitle(String certRatingTitle) {
		this.certRatingTitle = certRatingTitle;
	}

	public List<CinFilm> getFilms() {
		return this.films;
	}

	public void setFilms(List<CinFilm> films) {
		this.films = films;
	}

	public CinFilm addFilm(CinFilm film) {
		getFilms().add(film);
		film.setCertRating(this);

		return film;
	}

	public CinFilm removeFilm(CinFilm film) {
		getFilms().remove(film);
		film.setCertRating(null);

		return film;
	}

}