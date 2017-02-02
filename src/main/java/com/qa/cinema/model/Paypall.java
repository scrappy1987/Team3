package com.qa.cinema.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the paypall database table.
 * 
 */
@Entity
@Table(name="paypall")
@NamedQuery(name="Paypall.findAll", query="SELECT p FROM Paypall p")
public class Paypall implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cin_paypal_order_id", unique=true, nullable=false)
	private int cinPaypalOrderId;

	public Paypall() {
	}

	public int getCinPaypalOrderId() {
		return this.cinPaypalOrderId;
	}

	public void setCinPaypalOrderId(int cinPaypalOrderId) {
		this.cinPaypalOrderId = cinPaypalOrderId;
	}

}