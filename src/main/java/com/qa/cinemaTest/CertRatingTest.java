/** 
 * Package: com.qa.cinemaTest
 * File: CertRatingTest
 * @Author: Kimberley McGill
 * 
 * Description: Tests to ensure the CertRating file
 * works as expected and 
 */

package com.qa.cinemaTest;
import com.qa.cinema.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class CertRatingTest {
	
	CertRating rate = new CertRating("U", "Universal - suitable for all");

	@Test
	public void testNewCertRating() {
		
	}

	
	
	@Test
	public void testGetRatingTitle() {
		String holdTitle = rate.getRatingTitle();
		assertEquals("U", holdTitle);
	}
	
	
	@Test
	public void testSetRatingTitle() {
		rate.setRatingTitle("12");
		assertEquals("12", rate.getRatingTitle());
	}
	
	
	@Test
	public void testGetRatingDescription() {
		String holdDesc = rate.getRatingDescription();
		assertEquals("Universal - suitable for all", holdDesc);
	}
	
	
	@Test
	public void testSetRatingDescription() {
		rate.setRatingDescription("12 - not suitable for anybody under 12");
		assertEquals("12 - not suitable for anybody under 12", rate.getRatingDescription());
	}

}
