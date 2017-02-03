package com.qa.cinema;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;

@RequestScoped
public class BookingService {
	@Inject
	private EntityManager em;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void createBooking(Booking newBooking){
		em.createQuery(
			"INSERT INTO Booking(booking_id, booking_account_id, booking_complete, booking_customer_id, booking_paypal_id) VALUES("+newBooking.getID()+", "+newBooking.getAccountID()+", "+newBooking.isComplete()+", "+newBooking.getCustID()+", "+newBooking.getPaypalOrderID()+");"
		);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteBooking(String bookingID){
		em.createQuery(
			"DELETE FROM Booking WHERE booking_id = '" + bookingID + "';"
		);
	}
}
