package com.qa.cinema;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="booking")
public class Booking {
	
	//variables
	@Id
	@NotNull
	@Column(name="booking_id")
	private int booking_id;
	
	@NotNull
	@Column(name="account_id")
	@OneToOne(mappedBy = "account_id")
	@JoinColumns({
		@JoinColumn(name="account_id", referencedColumnName="account_id"),
	})
	private int account_id;
	
	@NotNull
	@Column(name="booking_complete")
	private boolean booking_complete;
	
	//Constructors
	public Booking() {
		
	}
	
	public Booking(int booking_id, int account_id, boolean booking_complete) {
		this.booking_id = booking_id;
		this.account_id = account_id;
		this.booking_complete = booking_complete;
	}

	
	//Getters and Setters
	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public boolean isBooking_complete() {
		return booking_complete;
	}

	public void setBooking_complete(boolean booking_complete) {
		this.booking_complete = booking_complete;
	}
	
	
}
