package com.qa.cinema.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cin_showing database table.
 * 
 */
@Entity
@Table(name="cin_showing")
@NamedQuery(name="CinShowing.findAll", query="SELECT c FROM CinShowing c")
public class CinShowing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="showing_id", unique=true, nullable=false)
	private int showingId;

	@Column(name="showing_language", nullable=false, length=150)
	private String showingLanguage;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="showing_start_time", nullable=false)
	private Date showingStartTime;

	//bi-directional many-to-one association to CinFilm
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="showing_film_id", nullable=false)
	private CinFilm film;

	//bi-directional many-to-one association to CinScreen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="showing_screen_id", nullable=false)
	private CinScreen screen;

	//bi-directional many-to-one association to CinTicket
	@OneToMany(mappedBy="showing")
	private List<CinTicket> tickets;

	public CinShowing() {
	}

	public int getShowingId() {
		return this.showingId;
	}

	public void setShowingId(int showingId) {
		this.showingId = showingId;
	}

	public String getShowingLanguage() {
		return this.showingLanguage;
	}

	public void setShowingLanguage(String showingLanguage) {
		this.showingLanguage = showingLanguage;
	}

	public Date getShowingStartTime() {
		return this.showingStartTime;
	}

	public void setShowingStartTime(Date showingStartTime) {
		this.showingStartTime = showingStartTime;
	}

	public CinFilm getFilm() {
		return this.film;
	}

	public void setFilm(CinFilm film) {
		this.film = film;
	}

	public CinScreen getScreen() {
		return this.screen;
	}

	public void setScreen(CinScreen screen) {
		this.screen = screen;
	}

	public List<CinTicket> getTickets() {
		return this.tickets;
	}

	public void setTickets(List<CinTicket> tickets) {
		this.tickets = tickets;
	}

	public CinTicket addTicket(CinTicket ticket) {
		getTickets().add(ticket);
		ticket.setShowing(this);

		return ticket;
	}

	public CinTicket removeTicket(CinTicket ticket) {
		getTickets().remove(ticket);
		ticket.setShowing(null);

		return ticket;
	}

}