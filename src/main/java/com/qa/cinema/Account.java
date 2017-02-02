package com.qa.cinema;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="accounts")
public class Account {
	
	//variables
	@Id
	@NotNull
	@Column(name="account_id")
	private int account_id;
	
	@NotNull
	@Column(name="account_name")
	private String account_name;
	
	@NotNull
	@Column(name="account_number")
	private long account_number;
	
	@NotNull
	@Column(name="account_sort")
	private String account_sort;
	
	@NotNull
	@Column(name="cust_id")
	private int cust_id;
	
	@NotNull
	@Column(name="address_id")
	private int address_id;

	public Account(int account_id, String account_name, long account_number,
			String account_sort, int cust_id, int address_id) {
		super();
		this.account_id = account_id;
		this.account_name = account_name;
		this.account_number = account_number;
		this.account_sort = account_sort;
		this.cust_id = cust_id;
		this.address_id = address_id;
	}

	
	//Getters and Setters
	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public long getAccount_number() {
		return account_number;
	}

	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}

	public String getAccount_sort() {
		return account_sort;
	}

	public void setAccount_sort(String account_sort) {
		this.account_sort = account_sort;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	
	
	
	
}
