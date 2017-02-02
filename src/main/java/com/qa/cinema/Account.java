package com.qa.cinema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
}
