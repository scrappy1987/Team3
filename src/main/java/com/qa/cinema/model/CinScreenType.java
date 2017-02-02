package com.qa.cinema.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cin_screen_type database table.
 * 
 */
@Entity
@Table(name="cin_screen_type")
@NamedQuery(name="CinScreenType.findAll", query="SELECT c FROM CinScreenType c")
public class CinScreenType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="screen_type_id", unique=true, nullable=false)
	private int screenTypeId;

	@Column(name="screen_type_system", nullable=false, length=250)
	private String screenTypeSystem;

	public CinScreenType() {
	}

	public int getScreenTypeId() {
		return this.screenTypeId;
	}

	public void setScreenTypeId(int screenTypeId) {
		this.screenTypeId = screenTypeId;
	}

	public String getScreenTypeSystem() {
		return this.screenTypeSystem;
	}

	public void setScreenTypeSystem(String screenTypeSystem) {
		this.screenTypeSystem = screenTypeSystem;
	}

}