package com.qa.cinema.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cin_customer database table.
 * 
 */
@Entity
@Table(name="cin_customer")
@NamedQuery(name="CinCustomer.findAll", query="SELECT c FROM CinCustomer c")
public class CinCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cust_id", unique=true, nullable=false)
	private int custId;

	@Column(name="cust_email", nullable=false, length=100)
	private String custEmail;

	@Column(nullable=false, length=50)
	private String cust_fName;

	@Column(nullable=false, length=50)
	private String cust_lName;

	@Lob
	@Column(name="cust_phone", nullable=false)
	private String custPhone;

	//bi-directional many-to-one association to CinBooking
	@OneToMany(mappedBy="customer")
	private List<CinBooking> bookings;

	//bi-directional many-to-one association to CinAddress
	@OneToMany(mappedBy="customer")
	private List<CinAddress> addresses;

	public CinCustomer() {
	}

	public int getCustId() {
		return this.custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustEmail() {
		return this.custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCust_fName() {
		return this.cust_fName;
	}

	public void setCust_fName(String cust_fName) {
		this.cust_fName = cust_fName;
	}

	public String getCust_lName() {
		return this.cust_lName;
	}

	public void setCust_lName(String cust_lName) {
		this.cust_lName = cust_lName;
	}

	public String getCustPhone() {
		return this.custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public List<CinBooking> getBookings() {
		return this.bookings;
	}

	public void setBookings(List<CinBooking> bookings) {
		this.bookings = bookings;
	}

	public CinBooking addBooking(CinBooking booking) {
		getBookings().add(booking);
		booking.setCustomer(this);

		return booking;
	}

	public CinBooking removeBooking(CinBooking booking) {
		getBookings().remove(booking);
		booking.setCustomer(null);

		return booking;
	}

	public List<CinAddress> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<CinAddress> addresses) {
		this.addresses = addresses;
	}

	public CinAddress addAddress(CinAddress address) {
		getAddresses().add(address);
		address.setCustomer(this);

		return address;
	}

	public CinAddress removeAddress(CinAddress address) {
		getAddresses().remove(address);
		address.setCustomer(null);

		return address;
	}

}