package es.muralla.dam.ad.jdbc.ui;

import java.util.List;

import es.muralla.dam.ad.datamodels.multimedia.Movie;

public interface IUMovie {
	List<Movie> getAll();
	
	Movie getById(long id);
	
	void add(Movie m);
	
	void update(Movie m);
	
	void remove(long id);
}
