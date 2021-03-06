package com.qa.cinemaEntity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
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
	@Column(name = "film_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;

	@NotNull
	@Column(name = "film_title", length = 64)
	private String title;

	@Column(name = "film_description", length = 256)
	private String description;

	@Column(name = "film_duration")
	private int duration;

	@Column(name = "User_Rating")
	private int userRating;

	@Column(name = "Release_Date")
	@Temporal(TemporalType.DATE)
	private Date releaseDate;
	
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name = "film_cert_rating", referencedColumnName = "cert_rating_title")
	private CertRating certRating;
	
	@ManyToMany
	@JoinTable(name = "cin_film_Genre_join", 
		joinColumns = @JoinColumn(name = "join_film_id", referencedColumnName = "film_id"), 
		inverseJoinColumns = @JoinColumn(name = "join_genre_id", referencedColumnName = "genre_id"))
	private Set<Genre> genres = new HashSet<Genre>();;
	
	@ManyToMany
	@JoinTable(name = "cin_film_actor_join", 
		joinColumns = @JoinColumn(name = "join_film_id", referencedColumnName = "film_id"), 
		inverseJoinColumns = @JoinColumn(name = "join_actor_id", referencedColumnName = "actor_id"))
	private Set<Actor> actors = new HashSet<Actor>();;
	
	@ManyToMany
	@JoinTable(name = "cin_film_director_join", 
		joinColumns = @JoinColumn(name = "join_film_id", referencedColumnName = "film_id"), 
		inverseJoinColumns = @JoinColumn(name = "join_director_id", referencedColumnName = "director_id"))
	private Set<Director> directors = new HashSet<Director>();;
	
	@OneToMany
	private Set<Showing> showings = new HashSet<Showing>();
	
	// ================================
	// = Constructors =
	// ================================
	
	public Film() {
	}

	public Film(String filmTitle, String filmDescription) {
		super();
		this.title = filmTitle;
		this.description = filmDescription;
	}
	
	public Film(String filmTitle, String filmDescription, Date filmReleaseDate) {
		super();
		this.title = filmTitle;
		this.description = filmDescription;
		this.releaseDate = filmReleaseDate;
	}

	public Film(String filmTitle, String filmDescription,
			int filmDuration, int userRating, Date filmReleaseDate,
			CertRating certRating, Set<Genre> genres, Set<Actor> actors,
			Set<Director> directors, Set<Showing> showings) {
		
		this.title = filmTitle;
		this.description = filmDescription;
		this.duration = filmDuration;
		this.userRating = userRating;
		this.releaseDate = filmReleaseDate;
		this.certRating = certRating;
		this.genres = genres;
		this.actors = actors;
		this.directors = directors;
		this.showings = showings;
	}
	
	// ================================
	// = Getters + Setters =
	// ================================
	
	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getUserRating() {
		return userRating;
	}

	public void setUserRating(int userRating) {
		this.userRating = userRating;
	}

	public Date getmReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
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
	



	