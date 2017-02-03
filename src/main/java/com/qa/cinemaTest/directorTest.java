package com.qa.cinemaTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.cinema.director;

public class directorTest {

	@Test
	public void directorIDTest() {
		director d1 = new director(1, "david");
		
		assertEquals(1, d1.getDirectorID());
	}
	@Test
	public void director_nameTest() {
		director d2 = new director(1, "david");
		assertEquals("david", d2.getDirector_name());
		
	}
	@Test
	public void setDirectorID() {
		director d3 = new director();
		d3.setDirectorID(2);
		assertEquals(2, d3.getDirectorID());
	}
	@Test
	public void setDirector_name() {
		director d4 = new director();
		d4.setDirector_name("david");
		assertEquals("david", d4.getDirector_name());
	}
	

}
