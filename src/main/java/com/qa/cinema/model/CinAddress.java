package com.qa.cinema.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cin_address database table.
 * 
 */
@Entity
@Table(name="cin_address")
@NamedQuery(name="CinAddress.findAll", query="SELECT c FROM CinAddress c")
public class CinAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="address_id", unique=true, nullable=false)
	private int addressId;

	@Column(name="address_line1", nullable=false, length=50)
	private String addressLine1;

	@Column(name="address_line2", nullable=false, length=50)
	private String addressLine2;

	@Column(name="address_line3", length=50)
	private String addressLine3;

	@Column(name="address_line4", length=50)
	private String addressLine4;

	@Column(name="address_name", nullable=false, length=50)
	private String addressName;

	@Column(name="address_postcode", nullable=false, length=12)
	private String addressPostcode;

	//bi-directional many-to-one association to CinCustomer
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="address_id", referencedColumnName="cust_address_id", nullable=false, insertable=false, updatable=false)
	private CinCustomer customer;

	public CinAddress() {
	}

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return this.addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getAddressLine4() {
		return this.addressLine4;
	}

	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
	}

	public String getAddressName() {
		return this.addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getAddressPostcode() {
		return this.addressPostcode;
	}

	public void setAddressPostcode(String addressPostcode) {
		this.addressPostcode = addressPostcode;
	}

	public CinCustomer getCustomer() {
		return this.customer;
	}

	public void setCustomer(CinCustomer customer) {
		this.customer = customer;
	}

}