package es.muralla.dam.ad.datamodels.multimedia;

import java.util.List;

public record Director (
	long id,
	String firstName,
	String lastName,
	
	List<Movie> movies
) {}
