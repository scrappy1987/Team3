package qa.cinema.service;

import java.util.List;
import javax.ws.rs.*;
import javax.inject.Inject;
import qa.cinema.genre.Genre;


	@Path("/genre")
	public class GenreRest {
	
		@Inject
		GenreService genreService;
			
		@POST
		@Path("/json")
		@Produces({"application/json"})
		public void addGenre(){
			genreService.addGenre();
		}

		@GET
		@Path("/json")
		@Produces({"application/json"})
		public String getGenre(){
			List<Genre> ListGenre = genreService.listAllGenres();
			return genreService.convertGenreToJSon(ListGenre);
		}
		
//		@GET
//		@Path("/json")
//		@Produces({"application/json"})
//		public String findGenre(){
//			Genre ChosenGenre = genreService.findGenre(1);
//			return genreService.convertGenreToJSon(ChosenGenre);
//		}
		

	}


