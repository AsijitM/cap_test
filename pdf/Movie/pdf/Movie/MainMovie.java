package pdf.Movie;

import java.util.List;

public class MainMovie {

	public static void main(String[] args) {

		
			  Film film1=new Film("Harry Potter","DavidYates",2007);
			  Film film2=new Film("TheLordOfTheRings","PeterJackson",2001);
			  FilmLibrary fl1=new FilmLibrary();
			  fl1.addFilm(film1);
			  fl1.addFilm(film2);
			  
			  List<IFilm> all=fl1.getFilms();
			  for(IFilm f:all) {
				  System.out.println(f);
			  }
//			  fl1.removeFilm("Harry Potter");
//			  
//			  List<IFilm> all1=fl1.getFilms();
//			  for(IFilm f:all1) {
//				  System.out.println(f);
//			  }
			  System.out.println(fl1.searchFilms("PeterJackson"));
			  System.out.println(fl1.getTotalFilmCount());


	}

}
