package com.qa.cinema;

import static org.junit.Assert.*;


import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

public class showingTest {

	@Test
	public void getShowingID() {
		
		Showings sh = new Showings();
		sh.setShowingID(1);
		assertEquals(1, sh.getShowingID());
		
	}
	
	@Test
	public void getFilmID(){
		Showings sh = new Showings();
		sh.setFilmID(1);
		assertEquals(1, sh.getFilmID());
	}
	
	@Test
	public void getStartTime(){
		Showings sh = new Showings();
		//Date date = new Date();
		Date newDate = new GregorianCalendar(2017, 2, 14 ,1 , 0).getTime();
		sh.setStartTime(newDate);
		assertEquals(newDate, sh.getStartTime());
	}
	
	@Test
	public void getScreenID(){
		Showings sh = new Showings();
		sh.setScreenID(1);
		assertEquals(1, sh.getScreenID());	
		
	}
	
	@Test
	public void getShowingLanguage(){
		Showings sh = new Showings();
		sh.setShowingLanguage("English");
		assertEquals("English", sh.getShowingLanguage());
		
	}

}
