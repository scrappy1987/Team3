package qa.cinema.genre;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Genre {

	@Id
	@Column(name = "genre_id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@SequenceGenerator(name="Genre", sequenceName="GenreID", allocationSize = 1)
	private int id;

	@NotNull
	@Size(max = 20)
	@Column(name = "genre", length = 20)
	private String genre;


	public Genre() {
	}

	public Genre(String genre) {
		this.genre = genre;

	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}