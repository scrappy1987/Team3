package com.qa.cinema;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Films")
public class Film {

	// ================================
	// = Attributes =
	// ================================

	@Id
	@Column(name = "Film_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long filmID;

	@NotNull
	@Column(name = "Title", length = 64)
	private String filmTitle;

	@Column(name = "Summary", length = 256)
	private String filmDescription;

	@Column(name = "Approx._Running_Time")
	private int filmDuration;

	@Column(name = "Age_Rating")
	public int film_CertRatingID;

	@Column(name = "Release_Date")
	@Temporal(TemporalType.DATE)
	private Date film_ReleaseDate;

	@ManyToMany
	@JoinTable(name = "Film_Genres", 
		joinColumns = @JoinColumn(name = "Film_ID", referencedColumnName = "Film_ID"), 
		inverseJoinColumns = @JoinColumn(name = "Genre_ID", referencedColumnName = "Genre_ID"))
	private List<Genre> genres;
	
	@ManyToMany
	@JoinTable(name = "Film_Actors", 
		joinColumns = @JoinColumn(name = "Film_ID", referencedColumnName = "Film_ID"), 
		inverseJoinColumns = @JoinColumn(name = "Actor_ID", referencedColumnName = "Actor_ID"))
	private List<Actor> actors;
	
	@ManyToMany
	@JoinTable(name = "Film_Director", 
		joinColumns = @JoinColumn(name = "Film_ID", referencedColumnName = "Film_ID"), 
		inverseJoinColumns = @JoinColumn(name = "Director_ID", referencedColumnName = "Director_ID"))
	private List<Director> directors;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "Age_Rating")
	private CertRating certRating;
	
	@OneToMany
	private List<>

	// ================================
	// = Constructors =
	// ================================

	public Film() {
	}

	public Film(String filmTitle, String filmDescription) {

		this.filmTitle = filmTitle;
		this.filmDescription = filmDescription;

	}

	public Film(String filmTitle, String filmDescription, int filmDuration,
			int film_CertRatingID, Date film_ReleaseDate) {

		this.filmTitle = filmTitle;
		this.filmDescription = filmDescription;
		this.filmDuration = filmDuration;
		this.film_CertRatingID = film_CertRatingID;
		this.film_ReleaseDate = film_ReleaseDate;
	}

	// ================================
	// = Getters + Setters =
	// ================================

	public long getFilmID() {
		return filmID;
	}

	public void setFilmID(long filmID) {
		this.filmID = filmID;
	}

	public String getFilmTitle() {
		return filmTitle;
	}

	public void setFilmTitle(String filmTitle) {
		this.filmTitle = filmTitle;
	}

	public String getFilmDescription() {
		return filmDescription;
	}

	public void setFilmDescription(String filmDescription) {
		this.filmDescription = filmDescription;
	}

	public int getFilmDuration() {
		return filmDuration;
	}

	public void setFilmDuration(int filmDuration) {
		this.filmDuration = filmDuration;
	}

	public int getFilm_CertRatingID() {
		return film_CertRatingID;
	}

	public void setFilm_CertRatingID(int film_CertRatingID) {
		this.film_CertRatingID = film_CertRatingID;
	}

	public Date getFilm_ReleaseDate() {
		return film_ReleaseDate;
	}

	public void setFilm_ReleaseDate(Date film_ReleaseDate) {
		this.film_ReleaseDate = film_ReleaseDate;
	}

}