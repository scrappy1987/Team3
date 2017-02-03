package com.qa.cinema.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.qa.cinema.model.Cinema;

public class CinemaTest {

	@Test
	public void Cinema() {
		Cinema cin = new Cinema();
		assertNotNull(cin);
	}
	
	@Test
	public void getID() {
		Cinema cin = new Cinema();
		cin.setId(1);
		assertEquals(1, cin.getId());
	}
	
	@Test
	public void setId() {
		Cinema cin = new Cinema();
		cin.setId(1);
		assertEquals(1, cin.getId());
	}

	@Test
	public void getName() {
		Cinema cin = new Cinema();
		cin.setName("name");
		assertEquals("name", cin.getName());
	}
	
	@Test
	public void setName() {
		Cinema cin = new Cinema();
		cin.setName("name");
		assertEquals("name", cin.getName());
	}
	
	@Test
	public void setAddress() {
		Cinema cin = new Cinema();
		Address address = new Address(1, "addressName", "address1", "address2", "address3", "address4", "poscode");
		cin.setAddress(address);
	}
	
	@Test
	public void getAddress() {
		Cinema cin = new Cinema();
		Address address = new Address(1, "addressName", "address1", "address2", "address3", "address4", "poscode");
		cin.setAddress(address);
		//assertEquals(true, address.equals(cin.getAddress().get(0)));
	}
	
	@Test
	public void getScreens() {
		Cinema cin = new Cinema();
		cin.setId(1);
		List<Screen> screens = new ArrayList<Screen>();
		Screen screen = new Screen(1, 1, cin.getId(), "Accessible");
		screens.add(screen);
		cin.setScreens(screens);
		//assertEquals(1, cin.getScreens().length());
	}
	
	@Test
	public void setScreens() {
		Cinema cin = new Cinema();
		cin.setId(1);
		List<Screen> screens = new ArrayList<Screen>();
		Screen screen = new Screen(1, 1, cin.getId(), "Accessible");
		screens.add(screen);
		cin.setScreens(screens);
		//assertEquals(1, cin.getScreens().length());
	}
	
	@Test
	public void setFacilities() {
		Cinema cin = new Cinema();
		List<Facility> facilities = new ArrayList<Facility>();
		Facility facility = new Facility(1, "A Facility", "A description");
		facilities.add(facility);
		cin.setFacilities(facilities);
		//assertEquals(1, cin.getFacilities().length());
	}
	
	@Test 
	public void getFacilities() {
		Cinema cin = new Cinema();
		List<Facility> facilities = new ArrayList<Facility>();
		Facility facility = new Facility(1, "A Facility", "A description");
		facilities.add(facility);
		cin.setFacilities(facilities);
		//assertEquals(1, cin.getFacilities().length());
	}
}
