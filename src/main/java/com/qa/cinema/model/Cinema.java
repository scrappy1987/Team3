package com.qa.cinema.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cin_cinema")
public class Cinema {

	@Id
	@Column(name="cinema_id", nullable=false, unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="cinema_name", nullable=false, length=250)
	@Size(max=250)
	@NotNull
	private String name;
	
	@NotNull
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="address_id", nullable=false)
	private Address address;
	
	@NotNull
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="cin_cinema_facilities_join",
			joinColumns=@JoinColumn(name="join_cinema_id", referencedColumnName="cinema_id"),
			inverseJoinColumns=@JoinColumn(name="join_facility_id", referencedColumnName="facility_id"))
	private List<Facility> facilities;
	
	@NotNull
	@OneToMany(fetch=FetchType.LAZY, cascade={CascadeType.ALL})
	@JoinColumn(name="screen_cinema_id")
	private List<Screen> screens;
	
	public Cinema() {
	}
	
	public Cinema(String name, Address address, List<Facility> facilities, List<Screen> screens) {
		this.name = name;
		this.address = address;
		this.facilities = facilities;
		this.screens = screens;
	}
	
	public Cinema(int id, String name, Address address, List<Facility> facilities, List<Screen> screens) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.facilities = facilities;
		this.screens = screens;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Facility> getFacilities() {
		return facilities;
	}

	public void setFacilities(List<Facility> facilities) {
		this.facilities = facilities;
	}

	public List<Screen> getScreens() {
		return screens;
	}

	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}

	@Override
	public String toString() {
		return "Cinema [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cinema other = (Cinema) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
