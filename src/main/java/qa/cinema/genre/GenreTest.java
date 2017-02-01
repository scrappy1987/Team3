package qa.cinema.genre;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenreTest {

	@Test
	public void getGenre_id() {
		
		Genre ge = new Genre();
		ge.setGenre_id(1);
		assertEquals(1, ge.getGenre_id());
		
	}
	
	@Test
	public void getGenre(){
		Genre ge = new Genre();
		ge.setGenre("Horror");
		assertEquals("Horror", ge.getGenre());
	}
		}


