package com.qa.cinemaEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cin_facility")
public class Facility {

	// ================================
	// = Attributes =
	// ================================
	@Id
	@Column(name = "facility_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;

	@NotNull
	@Column(name = "facility_title")
	protected String title;

	@NotNull
	@Column(name = "facility_description")
	protected String description;

	// ================================
	// = Constructors =
	// ================================

	public Facility() {
	}

	public Facility(String title, String description) {
		this.title = title;
		this.description = description;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFacility() {
		StringBuilder STR = new StringBuilder();
		STR.append(getTitle() + "\n" + getDescription());
		return STR.toString();
	}

}
