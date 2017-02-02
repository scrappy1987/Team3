package com.qa.cinema.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cin_booking database table.
 * 
 */
@Entity
@Table(name="cin_booking")
@NamedQuery(name="CinBooking.findAll", query="SELECT c FROM CinBooking c")
public class CinBooking implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private int id;

	@Column(name="booking_account_id", nullable=false)
	private int bookingAccountId;

	@Column(name="booking_complete", nullable=false)
	private byte bookingComplete;

	//bi-directional many-to-one association to CinCustomer
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cin_booking_cust_id")
	private CinCustomer customer;

	//uni-directional many-to-one association to Paypall
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cin_booking_paypal_order_id", nullable=false, insertable=false, updatable=false)
	private Paypall paypall;

	//bi-directional many-to-one association to CinTicket
	@OneToMany(mappedBy="booking")
	private List<CinTicket> tickets;

	public CinBooking() {
	}

	public CinBookingPK getId() {
		return this.id;
	}

	public void setId(CinBookingPK id) {
		this.id = id;
	}

	public int getBookingAccountId() {
		return this.bookingAccountId;
	}

	public void setBookingAccountId(int bookingAccountId) {
		this.bookingAccountId = bookingAccountId;
	}

	public byte getBookingComplete() {
		return this.bookingComplete;
	}

	public void setBookingComplete(byte bookingComplete) {
		this.bookingComplete = bookingComplete;
	}

	public CinCustomer getCustomer() {
		return this.customer;
	}

	public void setCustomer(CinCustomer customer) {
		this.customer = customer;
	}

	public Paypall getPaypall() {
		return this.paypall;
	}

	public void setPaypall(Paypall paypall) {
		this.paypall = paypall;
	}

	public List<CinTicket> getTickets() {
		return this.tickets;
	}

	public void setTickets(List<CinTicket> tickets) {
		this.tickets = tickets;
	}

	public CinTicket addTicket(CinTicket ticket) {
		getTickets().add(ticket);
		ticket.setBooking(this);

		return ticket;
	}

	public CinTicket removeTicket(CinTicket ticket) {
		getTickets().remove(ticket);
		ticket.setBooking(null);

		return ticket;
	}

}