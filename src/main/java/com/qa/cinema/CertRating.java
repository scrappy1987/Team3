/** 
 * Package: com.qa.cinema
 * File: CertRating
 * @Author: Kimberley McGill
 * 
 * Description: The CertRating class to explain the ratings
 * for the films shown in our cinema
 * Each rating will have a ratingID, a ratingTitle and a 
 * ratingDescription.
 */
package com.qa.cinema;

import javax.persistence.*;

@Entity
public class CertRating {

	// variables
	private int ratingID;
	private String ratingTitle;
	private String ratingDescription;
	
	
	public CertRating(int ratingID, String ratingTitle, String ratingDescription) {
		this.ratingID = ratingID;
		this.ratingTitle = ratingTitle;
		this.ratingDescription = ratingDescription;
	}
	

	// getters and setters
	public int getRatingID() {
		return ratingID;
	}
	
	public void setRatingID(int ratingID) {
		this.ratingID = ratingID;
	}
	
	public String getRatingTitle() {
		return ratingTitle;
	}
	
	public void setRatingTitle(String ratingTitle) {
		this.ratingTitle = ratingTitle;
	}
	
	public String getRatingDescription() {
		return ratingDescription;
	}
	 
	public void setRatingDescription(String ratingDescription) {
		this.ratingDescription = ratingDescription;
	}
	
	
	
}
