package pdf.Movie;

import java.util.List;

public class Film implements IFilm{
	private String title;
	private String director;
	private int year;
	
	public Film(String title, String director, int year) {
		this.title=title;
		this.director=director;
		this.year=year;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		this.title=title;
	}

	@Override
	public String getDirector() {
		// TODO Auto-generated method stub
		return director;
	}

	@Override
	public void setDirector(String director) {
		// TODO Auto-generated method stub
		this.director=director;
	}

	@Override
	public int getYear() {
		// TODO Auto-generated method stub
		return year;
	}

	@Override
	public void setYear(int year) {
		// TODO Auto-generated method stub
		this.year=year;
	}
	
	

}
