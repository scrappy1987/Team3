package com.qa.cinemaEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="cin_customer")
public class Customer {
	
	//variables
	@Id
	@NotNull
	@Column(name="id")
	private int id;

	@NotNull
	@Column(name="fName")
	private String fName;
	
	@NotNull
	@Column(name="lName")
	private String lName;
	
	@NotNull
	@Column(name="email")
	private String email;
	
	@NotNull
	@Column(name="phone")
	private long phone;
	
	@NotNull
	@Column(name="address_id")
	private int address_id;

	
	public Customer(int id, String fName, String lName,
			String email, long phone) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phone = phone;
	}


	//Getters and Setters
	public int getCust_id() {
		return id;
	}


	public void setCust_id(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return fName;
	}


	public void setFirstName(String fName) {
		this.fName = fName;
	}


	public String getLastName() {
		return lName;
	}


	public void setLastName(String lastName) {
		this.lName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getPhoneNum() {
		return phone;
	}


	public void setPhoneNum(long phone) {
		this.phone = phone;
	}

	
}
