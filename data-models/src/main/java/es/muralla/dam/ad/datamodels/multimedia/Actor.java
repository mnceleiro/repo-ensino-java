package es.muralla.dam.ad.datamodels.multimedia;

import java.time.LocalDate;

public record Actor (
	long id,
	String firstName,
	String lastName,
	
	LocalDate bornDate
) {}