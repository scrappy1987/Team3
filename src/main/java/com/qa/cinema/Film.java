package com.qa.cinema;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
@Table(name = "cin_film")
public class Film {

	// ================================
	// = Attributes =
	// ================================

	@Id
	@Column(name = "Film_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int filmID;

	@NotNull
	@Column(name = "Title", length = 64)
	private String filmTitle;

	@Column(name = "Summary", length = 256)
	private String filmDescription;

	@Column(name = "Approx._Running_Time")
	private int filmDuration;

	@Column(name = "User_Rating")
	private int userRating;

	@Column(name = "Release_Date")
	@Temporal(TemporalType.DATE)
	private Date filmReleaseDate;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "Age_Rating", referencedColumnName = "rating_title")
	private CertRating certRating;
	
	@ManyToMany
	@JoinTable(name = "Film_Genres", 
		joinColumns = @JoinColumn(name = "Film_ID", referencedColumnName = "film_id"), 
		inverseJoinColumns = @JoinColumn(name = "Genre_ID", referencedColumnName = "genre_id"))
	private Set<Genre> genres = new HashSet<>();;
	
	@ManyToMany
	@JoinTable(name = "Film_Actors", 
		joinColumns = @JoinColumn(name = "Film_ID", referencedColumnName = "film_id"), 
		inverseJoinColumns = @JoinColumn(name = "Actor_ID", referencedColumnName = "actor_id"))
	private Set<Actor> actors = new HashSet<>();;
	
	@ManyToMany
	@JoinTable(name = "Film_Director", 
		joinColumns = @JoinColumn(name = "Film_ID", referencedColumnName = "film_id"), 
		inverseJoinColumns = @JoinColumn(name = "Director_ID", referencedColumnName = "director_id"))
	private Set<Director> directors = new HashSet<>();;
	
	@OneToMany
	private Set<Showing> showings = new HashSet<>();
	
	// ================================
	// = Constructors =
	// ================================
	
	public Film() {
	}

	public Film(String filmTitle, String filmDescription) {
		super();
		this.filmTitle = filmTitle;
		this.filmDescription = filmDescription;
	}
	
	public Film(String filmTitle, String filmDescription, Date filmReleaseDate) {
		super();
		this.filmTitle = filmTitle;
		this.filmDescription = filmDescription;
		this.filmReleaseDate = filmReleaseDate;
	}

	public Film(String filmTitle, String filmDescription,
			int filmDuration, int userRating, Date filmReleaseDate,
			CertRating certRating, Set<Genre> genres, Set<Actor> actors,
			Set<Director> directors, Set<Showing> showings) {
		
		this.filmTitle = filmTitle;
		this.filmDescription = filmDescription;
		this.filmDuration = filmDuration;
		this.userRating = userRating;
		this.filmReleaseDate = filmReleaseDate;
		this.certRating = certRating;
		this.genres = genres;
		this.actors = actors;
		this.directors = directors;
		this.showings = showings;
	}
	
	// ================================
	// = Getters + Setters =
	// ================================
	
	public int getFilmID() {
		return filmID;
	}

	public void setFilmID(int filmID) {
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

	public int getUserRating() {
		return userRating;
	}

	public void setUserRating(int userRating) {
		this.userRating = userRating;
	}

	public Date getFilmReleaseDate() {
		return filmReleaseDate;
	}

	public void setFilmReleaseDate(Date filmReleaseDate) {
		this.filmReleaseDate = filmReleaseDate;
	}

	public CertRating getCertRating() {
		return certRating;
	}

	public void setCertRating(CertRating certRating) {
		this.certRating = certRating;
	}

	public Set<Genre> getGenres() {
		return genres;
	}

	public void setGenres(Set<Genre> genres) {
		this.genres = genres;
	}

	public Set<Actor> getActors() {
		return actors;
	}

	public void setActors(Set<Actor> actors) {
		this.actors = actors;
	}

	public Set<Director> getDirectors() {
		return directors;
	}

	public void setDirectors(Set<Director> directors) {
		this.directors = directors;
	}

	public Set<Showing> getShowings() {
		return showings;
	}

	public void setShowings(Set<Showing> showings) {
		this.showings = showings;
	}
	
}
	



	