package com.qa.cinemaTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.cinema.Director;

public class DirectorTest {

	@Test
	public void directorIDTest() {
		Director d1 = new Director(1, "Michael Bay");
		assertEquals(1, d1.getDirectorID());
	}
	
	@Test
	public void director_nameTest() {
		Director d2 = new Director(1, "Michael Bay");
		assertEquals("Michael Bay", d2.getDirector_name());
	}
	
	@Test
	public void setDirectorID() {
		Director d3 = new Director();
		d3.setDirectorID(2);
		assertEquals(2, d3.getDirectorID());
	}
	
	@Test
	public void setDirector_name() {
		Director d4 = new Director();
		d4.setDirector_name("Michael Bay");
		assertEquals("Michael Bay", d4.getDirector_name());
	}
}
