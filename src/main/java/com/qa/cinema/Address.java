package com.qa.cinema;

import javax.persistence.*;

// Author : Jack Roden

@Entity
public class Address {
	protected String line1;
	protected String line2;
	protected String county;
	protected String country;
	protected String postCode;

	public Address() {}
	public Address(String line1, String line2, String county, String country, String postCode) {
		setLine1(line1);
		setLine2(line2);
		setCounty(county);
		setCountry(country);
		setPostCode(postCode);
	}

	@Column(name="address_line1")
	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}
	@Column(name="address_line2")
	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}
	@Column(name="address_county")
	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}
	@Column(name="address_country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	@Column(name="address_postcode")
	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postalCode) {
		this.postCode = postalCode;
	}
	
	public String getAddress(){
		StringBuilder STR = new StringBuilder();
		STR.append(
			getLine1() + "\n" + getLine2() +
			getCounty() + "\n" + getCountry() + "\n" + getPostCode()
		);
		
		return STR.toString();
	}

}
