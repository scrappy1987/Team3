package com.qa.cinema;

import static org.junit.Assert.*;


import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

public class showingTest {

	@Test
	public void getShowingID() {
		
		Showing sh = new Showing();
		sh.setShowingID(1);
		assertEquals(1, sh.getShowingID());
		
	}
	
	@Test
	public void getFilmID(){
		Showing sh = new Showing();
		sh.setFilmID(1);
		assertEquals(1, sh.getFilmID());
	}
	
	@Test
	public void getStartTime(){
		Showing sh = new Showing();
		Date newDate = new GregorianCalendar(2017, 2, 14 ,1 , 0).getTime();
		sh.setStartTime(newDate);
		assertEquals(newDate, sh.getStartTime());
	}
	
	@Test
	public void getScreenID(){
		Showing sh = new Showing();
		sh.setScreenID(1);
		assertEquals(1, sh.getScreenID());	
		
	}
	
	@Test
	public void getShowingLanguage(){
		Showing sh = new Showing();
		sh.setShowingLanguage("English");
		assertEquals("English", sh.getShowingLanguage());
		
	}

}
