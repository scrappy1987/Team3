package com.qa.cinema;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Facility {
	protected String title;
	protected String description;
	
	public Facility(String title){
		setTitle(title);
	}
	public Facility(String title, String description){
		setTitle(title);
		setDescription(description);
	}
	@Column(name="facility_title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(name="facility_description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getFacility(){
		StringBuilder STR = new StringBuilder();
		STR.append(
				getTitle() + "\n" + getDescription()
		);
		return STR.toString();
	}
	
}
