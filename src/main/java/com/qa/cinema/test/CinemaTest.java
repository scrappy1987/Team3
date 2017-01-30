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
		cin.setAddress(new Address(1, "addressName", "address1", "address2", "address3", "address4", "poscode"));
		assertEquals(1, cin.getAddress().getId());
		assertEquals("addressName", cin.getAddress().getName());
		assertEquals("address1", cin.getAddress().getAddress1());
		assertEquals("address2", cin.getAddress().getAddress2());
		assertEquals("address3", cin.getAddress().getAddress3());
		assertEquals("address4", cin.getAddress().getAddress4());
		assertEquals("postcode", cin.getAddress().getPostcode());
	}
	
	@Test
	public void getAddress() {
		Cinema cin = new Cinema();
		cin.setAddress(new Address(1, "addressName", "address1", "address2", "address3", "address4", "poscode"));
		assertEquals(1, cin.getAddress().getId());
		assertEquals("addressName", cin.getAddress().getName());
		assertEquals("address1", cin.getAddress().getAddress1());
		assertEquals("address2", cin.getAddress().getAddress2());
		assertEquals("address3", cin.getAddress().getAddress3());
		assertEquals("address4", cin.getAddress().getAddress4());
		assertEquals("postcode", cin.getAddress().getPostcode());
	}
	
	@Test
	public void getScreens() {
		Cinema cin = new Cinema();
		cin.setId(1);
		List<Screen> screens = new ArrayList<Screen>();
		screens.add(new Screen(1, 1, cin.getId(), "Accessible"));
		cin.setScreens(screens);
		assertEquals(1, cin.getScreens().get(0).getId());
		assertEquals(1, cin.getScreens().get(0).getTypeId());
		assertEquals(1, cin.getScreens().get(0).getCinemaId());
		assertEquals("Accessible", cin.getScreens().get(0).getAccessible());
	}
	
	@Test
	public void setScreens() {
		Cinema cin = new Cinema();
		cin.setId(1);
		List<Screen> screens = new ArrayList<Screen>();
		screens.add(new Screen(1, 1, cin.getId(), "Accessible"));
		cin.setScreens(screens);
		assertEquals(1, cin.getScreens().get(0).getId());
		assertEquals(1, cin.getScreens().get(0).getTypeId());
		assertEquals(1, cin.getScreens().get(0).getCinemaId());
		assertEquals("Accessible", cin.getScreens().get(0).getAccessible());
	}
	
	@Test
	public void setFacilities() {
		Cinema cin = new Cinema();
		List<Facility> facilities = new ArrayList<Facility>();
		facilities.add(new Facility(1, "A Facility", "A description"));
		cin.setFacilities(facilities);
		assertEquals(1, cin.getFacilities().get(0).getID());
		assertEquals(1, cin.getFacilities().get(0).getTitle());
		assertEquals(1, cin.getFacilities().get(0).getDescription());
	}
	
	@Test 
	public void getFacilities() {
		Cinema cin = new Cinema();
		List<Facility> facilities = new ArrayList<Facility>();
		facilities.add(new Facility(1, "A Facility", "A description"));
		cin.setFacilities(facilities);
		assertEquals(1, cin.getFacilities().get(0).getID());
		assertEquals(1, cin.getFacilities().get(0).getTitle());
		assertEquals(1, cin.getFacilities().get(0).getDescription());
	}
}
