package com.qa.cinema.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the cin_seat_type database table.
 * 
 */
@Entity
@Table(name="cin_seat_type")
@NamedQuery(name="CinSeatType.findAll", query="SELECT c FROM CinSeatType c")
public class CinSeatType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="type_id", unique=true, nullable=false)
	private int typeId;

	@Column(name="type_name", nullable=false, length=1)
	private String typeName;

	@Column(name="type_price", nullable=false, precision=10)
	private BigDecimal typePrice;

	//bi-directional many-to-one association to CinSeat
	@OneToMany(mappedBy="seatType")
	private List<CinSeat> seats;

	public CinSeatType() {
	}

	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public BigDecimal getTypePrice() {
		return this.typePrice;
	}

	public void setTypePrice(BigDecimal typePrice) {
		this.typePrice = typePrice;
	}

	public List<CinSeat> getSeats() {
		return this.seats;
	}

	public void setSeats(List<CinSeat> seats) {
		this.seats = seats;
	}

	public CinSeat addSeat(CinSeat seat) {
		getSeats().add(seat);
		seat.setSeatType(this);

		return seat;
	}

	public CinSeat removeSeat(CinSeat seat) {
		getSeats().remove(seat);
		seat.setSeatType(null);

		return seat;
	}

}