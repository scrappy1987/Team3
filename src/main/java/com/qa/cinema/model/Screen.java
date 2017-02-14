package com.qa.cinema.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="screen")
public class Screen {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="screen_id", unique=true, nullable=false)
	@NotNull
	private int ID;

	@Column(name="screen_accessible", length=250, nullable=false)
	@Size(max=250)
	@NotNull
	private String screenAccessibility;

	@ManyToOne(fetch=FetchType.LAZY, cascade={CascadeType.ALL})
	@JoinColumn(name="screen_cinema_id", nullable=false)
	@NotNull
	private Cinema cinema;

	@OneToOne(fetch=FetchType.LAZY, cascade={CascadeType.ALL})
	@JoinColumn(name="screen_type_id", nullable=false)
	@NotNull
	private ScreenType screenType;

	@OneToMany(mappedBy="screen", cascade={CascadeType.ALL})
	@NotNull
	private List<Seat> seats;

	public int getID() {
		return this.ID;
	}

	public void setId(int ID) {
		this.ID = ID;
	}

	public String getScreenAccessibility() {
		return screenAccessibility;
	}

	public void setScreenAccessibility(String screenAccessibility) {
		this.screenAccessibility = screenAccessibility;
	}

	public Cinema getCinema() {
		return this.cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public ScreenType getScreenType() {
		return this.screenType;
	}

	public void setScreenType(ScreenType screenType) {
		this.screenType = screenType;
	}

	public List<Seat> getSeats() {
		return this.seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	
	
}
