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
	
	//ASK DUNCAN TOMORROW
	@NotNull
	@Column(name="account_id")
	private int accountID;
	
	@NotNull
	@Column(name="complete")
	private boolean complete;
	
	@NotNull
	@Column(name="cust_id")
	@OneToOne(mappedBy = "cust_id")
	@JoinColumns({
		@JoinColumn(name="cust_id", referencedColumnName="cust_id"),
	})
	private int custID;
	
	@NotNull
	@Column(name="paypal_order_id")
	private String paypalOrderID;
	
	//Constructors
	public Booking(int ID, int accountID, boolean complete, int custID, String paypalOrderID) {
		this.ID = ID;
		this.accountID = accountID;
		this.complete = complete;
		this.custID = custID;
		this.paypalOrderID = paypalOrderID;
	}



	//Getters and Setters
	public int getID() {
		return ID;
	}


	public void setID(int ID) {
		this.ID = ID;
	}


	public int getAccountID() {
		return accountID;
	}

	
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}


	public boolean isComplete() {
		return complete;
	}


	public void setComplete(boolean complete) {
		this.complete = complete;
	}


	public int getCustID() {
		return custID;
	}


	public void setCustID(int custID) {
		this.custID = custID;
	}


	public String getPaypalOrderID() {
		return paypalOrderID;
	}


	public void setPaypalOrderID(String paypalOrderID) {
		this.paypalOrderID = paypalOrderID;
	}

	
}
