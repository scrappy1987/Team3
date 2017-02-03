package com.qa.cinema;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cin_seat")
public class Seat {

	// ================================
	// = Attributes =
	// ================================

	@Id
	@Column(name = "seat_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;

	@NotNull
	@Column(name = "ticket_id")
	private String row;

	@NotNull
	@Column(name = "ticket_id")
	private int number;

	@NotNull
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name = "seat_type_id", referencedColumnName = "type_id")
	private int seatTypeID;

	@NotNull
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name = "seat_screen_id", referencedColumnName = "screen_id")
	private int ScreenID;

	// ================================
	// = Constructors =
	// ================================

	public Seat() {
		super();
	}

	public Seat(int iD, String row, int number, int seatTypeID, int screenID) {
		super();
		ID = iD;
		this.row = row;
		this.number = number;
		this.seatTypeID = seatTypeID;
		ScreenID = screenID;
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

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSeatTypeID() {
		return seatTypeID;
	}

	public void setSeatTypeID(int seatTypeID) {
		this.seatTypeID = seatTypeID;
	}

	public int getScreenID() {
		return ScreenID;
	}

	public void setScreenID(int screenID) {
		ScreenID = screenID;
	}


	

	
}