package com.qa.cinema;

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
	private int seatID;

	@NotNull
	@Column(name = "ticket_id")
	private String seatRow;

	@NotNull
	@Column(name = "ticket_id")
	private int seatNumber;

	@NotNull
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seat_type_id", referencedColumnName = "type_id")
	private int seatTypeID;

	@NotNull
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seat_screen_id", referencedColumnName = "screen_id")
	private int seatScreenID;

	// ================================
	// = Constructors =
	// ================================

	public Seat() {
		super();
	}

	public Seat(int seatID, String seatRow, int seatNumber, int seatTypeID,
			int seatScreenID) {
		super();
		this.seatID = seatID;
		this.seatRow = seatRow;
		this.seatNumber = seatNumber;
		this.seatTypeID = seatTypeID;
		this.seatScreenID = seatScreenID;
	}

	// ================================
	// = Getters + Setters =
	// ================================

	public int getSeatID() {
		return seatID;
	}

	public void setSeatID(int seatID) {
		this.seatID = seatID;
	}

	public String getSeatRow() {
		return seatRow;
	}

	public void setSeatRow(String seatRow) {
		this.seatRow = seatRow;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getSeatTypeID() {
		return seatTypeID;
	}

	public void setSeatTypeID(int seatTypeID) {
		this.seatTypeID = seatTypeID;
	}

	public int getSeatScreenID() {
		return seatScreenID;
	}

	public void setSeatScreenID(int seatScreenID) {
		this.seatScreenID = seatScreenID;
	}

}
