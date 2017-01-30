package com.qa.cinema;

import static org.junit.Assert.*;

import org.junit.Test;

public class ActorTest {

	@Test
	public void actorIDTest() {
		Actor a = new Actor(12345,"Tom Hanks");
		assertEquals(12345,a.getActor_id());
		
	}
	
	@Test
	public void actornameTest() {
		Actor a = new Actor(12345,"Tom Hanks");
		assertEquals("Tom Hanks",a.getActor_name());
		
	}
	
	@Test
	public void setactorIDTest() {
		Actor a = new Actor();
		a.setActor_id(12345);
		assertEquals(12345,a.getActor_id());
		
	}
	
	@Test
	public void setactornameTest() {
		Actor a = new Actor();
		a.setActor_name("Tom Hanks");
		assertEquals("Tom Hanks",a.getActor_name());
		
	}

}
