package com.qa.cinemaTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.cinema.Booking;

public class BookingTest {

	Booking newBooking = new Booking(1, 2, true);
	
	@Test
	public void testNewBooking() {
	}

	
	@Test
	public void testGetBookingId() {
		int holdID = newBooking.getBooking_id();
		assertEquals(1, holdID);
	}
	
	@Test
	public void testSetBookingId() {
		newBooking.setBooking_id(2);
		assertEquals(2, newBooking.getBooking_id());
	}
	
	@Test
	public void testGetAccountId() {
		int holdAccount = newBooking.getAccount_id();
		assertEquals(2, holdAccount);
	}
	
	@Test
	public void testSetAccountId() {
		newBooking.setAccount_id(1);
		assertEquals(1, newBooking.getAccount_id());
	}
	
	@Test
	public void testGetCompleted() {
		boolean holdComplete = newBooking.isBooking_complete();
		assertEquals(true, holdComplete);
	}
	
	@Test
	public void testSetCompleted() {
		newBooking.setBooking_complete(false);
		assertEquals(false, newBooking.isBooking_complete());
	}
}
