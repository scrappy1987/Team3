package com.qa.cinema.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cin_cinema database table.
 * 
 */
@Entity
@Table(name="cin_cinema")
@NamedQuery(name="CinCinema.findAll", query="SELECT c FROM CinCinema c")
public class CinCinema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cinema_id", unique=true, nullable=false)
	private int cinemaId;

	@Column(name="cinema_name", nullable=false, length=100)
	private String cinemaName;

	//bi-directional many-to-one association to CinScreen
	@OneToMany(mappedBy="cinema")
	private List<CinScreen> screens;

	//uni-directional one-to-one association to CinAddress
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cinema_address_id", nullable=false)
	private CinAddress address;

	public CinCinema() {
	}

	public int getCinemaId() {
		return this.cinemaId;
	}

	public void setCinemaId(int cinemaId) {
		this.cinemaId = cinemaId;
	}

	public String getCinemaName() {
		return this.cinemaName;
	}

	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}

	public List<CinScreen> getScreens() {
		return this.screens;
	}

	public void setScreens(List<CinScreen> screens) {
		this.screens = screens;
	}

	public CinScreen addScreen(CinScreen screen) {
		getScreens().add(screen);
		screen.setCinema(this);

		return screen;
	}

	public CinScreen removeScreen(CinScreen screen) {
		getScreens().remove(screen);
		screen.setCinema(null);

		return screen;
	}

	public CinAddress getAddress() {
		return this.address;
	}

	public void setAddress(CinAddress address) {
		this.address = address;
	}

}