package com.qa.cinemaTest;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.qa.cinema.Facility;


public class FacilityTest {

	@Test
	public void test() {
		Facility fty = new Facility(
				"Disabled Access", "Access for disabled customers"
		);
		
		assertNotNull(fty);
	}

}
