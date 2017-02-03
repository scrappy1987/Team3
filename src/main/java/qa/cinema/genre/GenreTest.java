package qa.cinema.genre;

import static org.junit.Assert.*;
import org.junit.Test;

public class GenreTest {

	
	
	@Test
	public void getGenre(){
		Genre ge = new Genre();
		ge.setGenre("Horror");
		assertEquals("Horror", ge.getGenre());
	}
		}


