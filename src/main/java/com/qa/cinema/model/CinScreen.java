package com.qa.cinema.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cin_screen database table.
 * 
 */
@Entity
@Table(name="cin_screen")
@NamedQuery(name="CinScreen.findAll", query="SELECT c FROM CinScreen c")
public class CinScreen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="screen_id", unique=true, nullable=false)
	private int screenId;

	@Column(name="screen_accessible", length=250)
	private String screenAccessible;

	//bi-directional many-to-one association to CinCinema
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="screen_cinema_id", nullable=false)
	private CinCinema cinema;

	//bi-directional many-to-one association to CinShowing
	@OneToMany(mappedBy="screen")
	private List<CinShowing> showings;

	//uni-directional one-to-one association to CinScreenType
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="screen_type_id", nullable=false)
	private CinScreenType screenType;

	//bi-directional many-to-one association to CinSeat
	@OneToMany(mappedBy="screen")
	private List<CinSeat> seats;

	public CinScreen() {
	}

	public int getScreenId() {
		return this.screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public String getScreenAccessible() {
		return this.screenAccessible;
	}

	public void setScreenAccessible(String screenAccessible) {
		this.screenAccessible = screenAccessible;
	}

	public CinCinema getCinema() {
		return this.cinema;
	}

	public void setCinema(CinCinema cinema) {
		this.cinema = cinema;
	}

	public List<CinShowing> getShowings() {
		return this.showings;
	}

	public void setShowings(List<CinShowing> showings) {
		this.showings = showings;
	}

	public CinShowing addShowing(CinShowing showing) {
		getShowings().add(showing);
		showing.setScreen(this);

		return showing;
	}

	public CinShowing removeShowing(CinShowing showing) {
		getShowings().remove(showing);
		showing.setScreen(null);

		return showing;
	}

	public CinScreenType getScreenType() {
		return this.screenType;
	}

	public void setScreenType(CinScreenType screenType) {
		this.screenType = screenType;
	}

	public List<CinSeat> getSeats() {
		return this.seats;
	}

	public void setSeats(List<CinSeat> seats) {
		this.seats = seats;
	}

	public CinSeat addSeat(CinSeat seat) {
		getSeats().add(seat);
		seat.setScreen(this);

		return seat;
	}

	public CinSeat removeSeat(CinSeat seat) {
		getSeats().remove(seat);
		seat.setScreen(null);

		return seat;
	}

}