package es.muralla.dam.ad.datamodels.education;

import java.util.Optional;

public record Matricula (
	Alumno alumno,
	Asignatura asignatura,
	Optional<Nota> nota,
	Profesor profesor
) {
	
}
