package com.qa.cinema;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="cin_booking")
public class Booking {
	
	//variables
	@Id
	@NotNull
	@Column(name="ID")
	private int ID;

	@NotNull
	@Column(name="account_id")
	private int account_id;
	
	@NotNull
	@Column(name="complete")
	private boolean complete;
	
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
	public Booking(int ID, int account_id, boolean complete,
			int cust_id, String paypal_order_id) {
		this.ID = ID;
		this.account_id = account_id;
		this.complete = complete;
		this.cust_id = cust_id;
		this.paypal_order_id = paypal_order_id;
	}



	//Getters and Setters
	public int getID() {
		return ID;
	}


	public void setID(int ID) {
		this.ID = ID;
	}


	public int getAccount_id() {
		return account_id;
	}

	
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}


	public boolean isComplete() {
		return complete;
	}


	public void setComplete(boolean complete) {
		this.complete = complete;
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
