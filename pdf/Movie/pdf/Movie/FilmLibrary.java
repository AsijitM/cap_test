package pdf.Movie;

import java.util.ArrayList;
import java.util.List;

public class FilmLibrary implements IFilmLibrary{
	private List<IFilm> films;

	FilmLibrary(){
		films=new ArrayList<>();
	}
	
	@Override
	public void addFilm(IFilm film) {
		// TODO Auto-generated method stub
		films.add(film);
	}
	@Override
	public void removeFilm(String title) {
		// TODO Auto-generated method stub
//		List<Film>l=new ArrayList<>();
		IFilm filmToRemove=null;
		for(IFilm f:films) {
		if(f.getTitle().equals(title)) {
			filmToRemove=f;
			break;
		}else {
			System.out.println("Film not available");
		}
		if(filmToRemove!=null) {
			films.remove(filmToRemove);
		}
		}
	}
	
	@Override
	//why only list not List<Film>
	public List<IFilm> getFilms() {
		// TODO Auto-generated method stub
		return films;
	}
	@Override
	public List<IFilm> searchFilms(String query) {
		// TODO Auto-generated method stub
		List<IFilm>l=new ArrayList<>();
		for(IFilm f:films) {
			if(f.getTitle().contains(query) || (f.getDirector().contains(query))){
				l.add(f);	
				}
		}
		return l;
	}
	@Override
	public int getTotalFilmCount() {
		return films.size();
	}
	
	
	
	
}
