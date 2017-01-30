package com.qa.cinema;



import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import java.util.Calendar;

@Entity
public class Showings {

	@Id
	@GeneratedValue
	private int showingID;
	
	@NotNull
	private int filmID;
	
	@NotNull
	private Date StartTime;
	
	@NotNull
	private int screenID;
	
	@NotNull
	private String showingLanguage;

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
		return StartTime;
	}

	public void setStartTime(Date StartTime) {
		this.StartTime = StartTime;
		
	}
	/*public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	*/

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
	
	//public static void main(String[] args){
		//Date newDate = new GregorianCalendar(2017, 2, 13 ,1 , 0).getTime();
		//System.out.println(newDate);
	//}
	
	
	
}
