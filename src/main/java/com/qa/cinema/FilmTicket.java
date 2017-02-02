package com.qa.cinema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cin_ticket")
public class FilmTicket {

	// ================================
	// = Attributes =
	// ================================
	
	@Id
	@Column(name = "ticket_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticketID;
	
	@NotNull
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "ticket_booking_id", referencedColumnName = "booking_id")
	private int bookingID;

	@NotNull
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "showing", referencedColumnName = "showing_id")
	private Showing showing;
	
	@NotNull
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "seat", referencedColumnName = "seat_id")
	private Seat seat;

	// ================================
	// = Constructors =
	// ================================
	
	public FilmTicket() {
		super();
	}

	public FilmTicket(int ticketID, int bookingID, Showing showing, Seat seat) {
		super();
		this.ticketID = ticketID;
		this.bookingID = bookingID;
		this.showing = showing;
		this.seat = seat;
	}

	// ================================
	// = Getters + Setters =
	// ================================
	
	public int getTicketID() {
		return ticketID;
	}

	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}

	public int getBookingID() {
		return bookingID;
	}

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	public Showing getShowing() {
		return showing;
	}

	public void setShowing(Showing showing) {
		this.showing = showing;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	
		
}	
