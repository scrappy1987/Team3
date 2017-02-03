package com.qa.cinemaServices;

import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.Path;

import org.jboss.logging.Logger;

import com.qa.cinema.Booking;

@Path("/bookings")
@SessionScoped
public class BookingServices {

	private static final Logger LOGGER = Logger.getLogger(Booking.class);
	
	@Inject
	private EntityManager em;
	
	public void createBooking(String aBooking) {
		Gson gson = new Gson();
		
	}
	
	
}
