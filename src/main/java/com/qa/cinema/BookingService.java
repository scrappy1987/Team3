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
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateBooking(String bookingID, Booking updatedBooking){
		Booking tmp = (Booking)em.createQuery("SELECT * FROM Booking WHERE booking_id = '" + bookingID + "';").getSingleResult();
		em.createQuery(
			"UPDATE Booking SET booking_id = '" +
				updatedBooking.getID() +
				"' booking_account_id = '" +
				updatedBooking.getAccountID() +
				"' booking_complete = '" +
				updatedBooking.isComplete() +
				"' booking_customer_id ='" +
				updatedBooking.getCustID() +
				"' booking_paypal_id = '" +
				updatedBooking.getPaypalOrderID() +
				"' WHERE booking_id = '" +
				bookingID +
				"';"
		);
	}
}
