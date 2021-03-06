package com.qa.cinemaEntity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
public class Showing {

	@Id
	@Column (name="showing_id", nullable=false, unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int showingID;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@NotNull
	@JoinColumn(name="film_id")
	private Film film; //not sure 

	@NotNull
	@Column(name="showing_start_time")
	private Date startTime;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@NotNull 
	@JoinColumn(name="screen_id")
	private Screen screen;

	@NotNull
	@Size(max=150)
	@Column(name ="showing_language", length=150)
	private String showingLanguage;

	Showing() {
	}


	public Showing(int showingID, Film film, Date startTime, Screen screen,
			String showingLanguage) {
		super();
		this.showingID = showingID;
		this.film = film;
		this.startTime = startTime;
		this.screen = screen;
		this.showingLanguage = showingLanguage;
	}


	public int getShowingID() {
		return showingID;
	}

	public void setShowingID(int showingID) {
		this.showingID = showingID;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public String getShowingLanguage() {
		return showingLanguage;
	}

	public void setShowingLanguage(String showingLanguage) {
		this.showingLanguage = showingLanguage;
	}
	
}