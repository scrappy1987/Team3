package com.qa.cinemaEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="cin_screen_type")
public class ScreenType {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="screen_type_id", unique=true, nullable=false)
	@NotNull
	private int ID;

	@Column(name="screen_type_system", nullable=false, length=250)
	@Size(max=250)
	@NotNull
	private String screenTypeSystem;

	public ScreenType() {
	}

	public int getScreenTypeId() {
		return this.ID;
	}

	public void setScreenTypeId(int screenTypeId) {
		this.ID = screenTypeId;
	}

	public String getScreenTypeSystem() {
		return this.screenTypeSystem;
	}

	public void setScreenTypeSystem(String screenTypeSystem) {
		this.screenTypeSystem = screenTypeSystem;
	}

}
