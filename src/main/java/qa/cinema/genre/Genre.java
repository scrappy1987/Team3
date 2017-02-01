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
	private int genre_id;

	@NotNull
	@Size(max = 20)
	@Column(name = "genre", length = 20)
	private String genre;


	Genre() {
	}

	Genre(int genre_id, String genre) {
		setGenre_id(genre_id);
		setGenre(genre);

	}

	public int getGenre_id() {
		return genre_id;
	}

	public void setGenre_id(int genre_id) {
		this.genre_id = genre_id;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}