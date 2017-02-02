package com.qa.cinema.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cin_film database table.
 * 
 */
@Entity
@Table(name="cin_film")
@NamedQuery(name="CinFilm.findAll", query="SELECT c FROM CinFilm c")
public class CinFilm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="film_id", unique=true, nullable=false)
	private int filmId;

	@Column(name="film_description", nullable=false, length=250)
	private String filmDescription;

	@Column(name="film_duration", nullable=false)
	private int filmDuration;

	@Column(name="film_title", nullable=false, length=45)
	private String filmTitle;

	//bi-directional many-to-one association to CinCustRating
	@OneToMany(mappedBy="film")
	private List<CinCustRating> customerRatings;

	//bi-directional many-to-one association to CinCertRating
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="film_cert_rating_id", nullable=false)
	private CinCertRating certRating;

	//bi-directional many-to-one association to CinShowing
	@OneToMany(mappedBy="film")
	private List<CinShowing> showings;

	public CinFilm() {
	}

	public int getFilmId() {
		return this.filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public String getFilmDescription() {
		return this.filmDescription;
	}

	public void setFilmDescription(String filmDescription) {
		this.filmDescription = filmDescription;
	}

	public int getFilmDuration() {
		return this.filmDuration;
	}

	public void setFilmDuration(int filmDuration) {
		this.filmDuration = filmDuration;
	}

	public String getFilmTitle() {
		return this.filmTitle;
	}

	public void setFilmTitle(String filmTitle) {
		this.filmTitle = filmTitle;
	}

	public List<CinCustRating> getCustomerRatings() {
		return this.customerRatings;
	}

	public void setCustomerRatings(List<CinCustRating> customerRatings) {
		this.customerRatings = customerRatings;
	}

	public CinCustRating addCustomerRating(CinCustRating customerRating) {
		getCustomerRatings().add(customerRating);
		customerRating.setFilm(this);

		return customerRating;
	}

	public CinCustRating removeCustomerRating(CinCustRating customerRating) {
		getCustomerRatings().remove(customerRating);
		customerRating.setFilm(null);

		return customerRating;
	}

	public CinCertRating getCertRating() {
		return this.certRating;
	}

	public void setCertRating(CinCertRating certRating) {
		this.certRating = certRating;
	}

	public List<CinShowing> getShowings() {
		return this.showings;
	}

	public void setShowings(List<CinShowing> showings) {
		this.showings = showings;
	}

	public CinShowing addShowing(CinShowing showing) {
		getShowings().add(showing);
		showing.setFilm(this);

		return showing;
	}

	public CinShowing removeShowing(CinShowing showing) {
		getShowings().remove(showing);
		showing.setFilm(null);

		return showing;
	}

}