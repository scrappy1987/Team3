package qa.cinema.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import qa.cinema.genre.Genre;

import com.google.gson.Gson;

@Stateless
public class GenreService {

		
	private static final Logger LOGGER = Logger.getLogger(GenreService.class);
	
	@Inject 
	private EntityManager em;

	public List<Genre> listAllGenres(){//Gets all Genres in JAVA
		
		return null;
//		return em.createQuery("SELECT genre FROM Genre", Genre.class).getResultList();
		
	}

	public void addGenre(){
		//Genre newGenre = new Genre("Horror");
		//em.persist(newGenre);
		em.createQuery("INSERT into Genre(genre) values('Horror')");
		
		
	}
	
	public Genre findGenre(int selectedGenre){
		return (Genre) em.createQuery("select genre from Genre where Genre.genreID =" + selectedGenre);
	}
	
	
	
//	public String convertGenreToJSon(addGenre) {
//		Gson gson = new Gson();
//		String aString = gson.toJson(addGenre);
//		LOGGER.info("This is the value of aString " + aString);
//		return aString;
//	}
	
	public String convertGenreToJSon(List<Genre> listOfGenre) {
		Gson gson = new Gson();
		String aString = gson.toJson(listOfGenre);
		LOGGER.info("This is the value of aString " + aString);
		return aString;
	}
	
	
	
//	
//	public Genre creatreGenre(Genre Genre){
//		em.persist(Genre);
//		return Genre;
//	}
//
//	public void addGenre(String clientAddNewGenre) {
//		Gson gson = new Gson();
//		Genre newGenre = gson.fromJson(clientAddNewGenre, Genre.class);
//		em.persist(newGenre);
//	}
//
//	public void removeGenre(int genre_id) {
//		Genre newGenre = em.find(Genre.class, genre_id);
//		if (newGenre != null)
//			em.remove(newGenre);
//	}
	
	
	
//	public Genre findGenre(Long id){
//		return em.find(Genre.class, id);
//	}
//	
	
	

	
	
	
	
}




