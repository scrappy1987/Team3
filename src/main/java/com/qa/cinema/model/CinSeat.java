package com.qa.cinema.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cin_seat database table.
 * 
 */
@Entity
@Table(name="cin_seat")
@NamedQuery(name="CinSeat.findAll", query="SELECT c FROM CinSeat c")
public class CinSeat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="seat_id", unique=true, nullable=false)
	private int seatId;

	@Column(name="seat_number", nullable=false)
	private int seatNumber;

	@Column(name="seat_row", nullable=false, length=2)
	private String seatRow;

	//bi-directional many-to-one association to CinSeatType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="seat_type_id", nullable=false)
	private CinSeatType seatType;

	//bi-directional many-to-one association to CinScreen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="seat_screen_id", nullable=false)
	private CinScreen screen;

	public CinSeat() {
	}

	public int getSeatId() {
		return this.seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public int getSeatNumber() {
		return this.seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getSeatRow() {
		return this.seatRow;
	}

	public void setSeatRow(String seatRow) {
		this.seatRow = seatRow;
	}

	public CinSeatType getSeatType() {
		return this.seatType;
	}

	public void setSeatType(CinSeatType seatType) {
		this.seatType = seatType;
	}

	public CinScreen getScreen() {
		return this.screen;
	}

	public void setScreen(CinScreen screen) {
		this.screen = screen;
	}

}