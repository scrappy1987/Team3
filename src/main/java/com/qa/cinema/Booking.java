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
	private int account_id;
	
	@NotNull
	@Column(name="booking_complete")
	private boolean booking_complete;
	
	@NotNull
	@Column(name="cust_id")
	@OneToOne(mappedBy = "cust_id")
	@JoinColumns({
		@JoinColumn(name="cust_id", referencedColumnName="cust_id"),
	})
	private int cust_id;
	
	@NotNull
	@Column(name="paypal_order_id")
	private String paypal_order_id;

	
	
	//Constructors
	public Booking(int booking_id, int account_id, boolean booking_complete,
			int cust_id, String paypal_order_id) {
		super();
		this.booking_id = booking_id;
		this.account_id = account_id;
		this.booking_complete = booking_complete;
		this.cust_id = cust_id;
		this.paypal_order_id = paypal_order_id;
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


	public int getCust_id() {
		return cust_id;
	}


	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}


	public String getPaypal_order_id() {
		return paypal_order_id;
	}


	public void setPaypal_order_id(String paypal_order_id) {
		this.paypal_order_id = paypal_order_id;
	}

	
}
