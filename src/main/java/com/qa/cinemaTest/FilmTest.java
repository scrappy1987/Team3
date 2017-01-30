package com.qa.cinemaTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class FilmTest {

	@Test
	public void testGettersSetters() {
	    PropertyAsserter.assertBasicGetterSetterBehavior(new Film());
	}

}
