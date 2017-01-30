package com.qa.cinema;



import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import java.util.Calendar;

@Entity
public class Showing {

	@Id
	@GeneratedValue
	private int showingID;
	
	@NotNull
	private int filmID;
	
	@NotNull
	private Date startTime;
	
	@NotNull
	private int screenID;
	
	@NotNull
	private String showingLanguage;
	


	Showing(){}
	
	Showing(int showingID, int filmID, Date startTime, int screenID, String showingLanguage){
		setShowingID(showingID);
		setFilmID(filmID);
		setStartTime(startTime);
		setScreenID(screenID);
		setShowingLanguage(showingLanguage);
		
	}
	
	
	public int getShowingID() {
		return showingID;
	}

	public void setShowingID(int showingID) {
		this.showingID = showingID;
	}

	public int getFilmID() {
		return filmID;
	}

	public void setFilmID(int filmID) {
		this.filmID = filmID;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
		
	}


	public int getScreenID() {
		return screenID;
	}

	public void setScreenID(int screenID) {
		this.screenID = screenID;
	}

	public String getShowingLanguage() {
		return showingLanguage;
	}

	public void setShowingLanguage(String showingLanguage) {
		this.showingLanguage = showingLanguage;
	}
	

	
	
	
}
