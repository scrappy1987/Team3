package com.qa.cinema;

public class Address {
	protected String addressLine1;
	protected String addressLine2;
	protected String county;
	protected String country;
	protected String postalCode;

	public Address() {}
	public Address(String addressLine1, String addressLine2, String county, String country, String postalCode) {
		setAddressLine1(addressLine1);
		setAddressLine2(addressLine2);
		setCounty(county);
		setCountry(country);
		setPostalCode(postalCode);
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
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

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getAddress(){
		StringBuilder STR = new StringBuilder();
		STR.append(
			getAddressLine1() + "\n" + getAddressLine2() +
			getCounty() + "\n" + getCountry() + "\n" + getPostalCode()
		);
		
		return STR.toString();
	}

}
