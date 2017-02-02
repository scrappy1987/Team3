package com.qa.cinema;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="customer")
public class Customer {
	
	//variables
	@Id
	@NotNull
	@Column(name="cust_id")
	private int cust_id;

	@NotNull
	@Column(name="fName")
	private String firstName;
	
	@NotNull
	@Column(name="lName")
	private String lastName;
	
	@NotNull
	@Column(name="email")
	private String email;
	
	@NotNull
	@Column(name="phone")
	private long phoneNum;

	
	public Customer(int cust_id, String firstName, String lastName,
			String email, long phoneNum) {
		super();
		this.cust_id = cust_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNum = phoneNum;
	}


	//Getters and Setters
	public int getCust_id() {
		return cust_id;
	}


	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	
}
