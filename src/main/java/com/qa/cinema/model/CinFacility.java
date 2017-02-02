package com.qa.cinema.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cin_facilities database table.
 * 
 */
@Entity
@Table(name="cin_facilities")
@NamedQuery(name="CinFacility.findAll", query="SELECT c FROM CinFacility c")
public class CinFacility implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="facility_id", unique=true, nullable=false)
	private int facilityId;

	@Column(name="facility_description", nullable=false, length=2000)
	private String facilityDescription;

	@Column(name="facility_title", nullable=false, length=100)
	private String facilityTitle;

	public CinFacility() {
	}

	public int getFacilityId() {
		return this.facilityId;
	}

	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}

	public String getFacilityDescription() {
		return this.facilityDescription;
	}

	public void setFacilityDescription(String facilityDescription) {
		this.facilityDescription = facilityDescription;
	}

	public String getFacilityTitle() {
		return this.facilityTitle;
	}

	public void setFacilityTitle(String facilityTitle) {
		this.facilityTitle = facilityTitle;
	}

}