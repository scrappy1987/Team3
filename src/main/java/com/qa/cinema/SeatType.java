package com.qa.cinema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cin_seat_type")
public class SeatType {

	// ================================
	// = Attributes =
	// ================================
	
	@Id
	@Column(name = "type_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	
	@NotNull
	private double price;
	
	
	private enum type {STANDARD, PREMIUM, DISABLED}
	
	// ================================
	// = Constructors =
	// ================================
	
	public SeatType() {
		super();
	}

	public SeatType(int iD, double price) {
		super();
		ID = iD;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	};
	
}
