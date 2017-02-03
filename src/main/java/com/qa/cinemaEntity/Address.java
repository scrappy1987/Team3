package com.qa.cinemaEntity;

import javax.persistence.*;

// Author : Jack Roden
// Date	  : 31/Jan/2017

@Entity
@Table(name = "cin_address")
public class Address {

	// ================================
	// = Attributes =
	// ================================

	@Id
	@Column(name = "address_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	@Column(name = "address_line1")
	protected String line1;
	@Column(name = "address_line2")
	protected String line2;
	@Column(name = "address_county")
	protected String county;
	@Column(name = "address_country")
	protected String country;
	@Column(name = "address_postcode")
	protected String postCode;

	// ================================
	// = Constructors =
	// ================================

	public Address() {
	}

	public Address(String line1, String line2, String county, String country,
			String postCode) {

		this.line1 = line1;
		this.line2 = line2;
		this.county = county;
		this.country = country;
		this.postCode = postCode;
	}

	// ================================
	// = Getters + Setters =
	// ================================

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postalCode) {
		this.postCode = postalCode;
	}

	public String getAddress() {
		StringBuilder STR = new StringBuilder();
		STR.append(getLine1() + "\n" + getLine2() + getCounty() + "\n"
				+ getCountry() + "\n" + getPostCode());

		return STR.toString();
	}

}
