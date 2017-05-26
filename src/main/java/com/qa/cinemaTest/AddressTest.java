package com.qa.cinemaTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.cinema.Address;

public class AddressTest {

	@Test
	public void test() {
		Address adr = new Address(
			"9","Gordon Street", "West Midlands", "England", "WS10 8AS"	
		);
		
		assertNotNull(adr.getAddress());
	}

}
