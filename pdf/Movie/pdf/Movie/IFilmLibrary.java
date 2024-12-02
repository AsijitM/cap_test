package pdf.Movie;

import java.util.List;

public interface IFilmLibrary {
	public void addFilm(IFilm film);
	public void removeFilm(String title);
	public List<IFilm> getFilms();
	public List<IFilm> searchFilms(String query);
	public int getTotalFilmCount();


}
