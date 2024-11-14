package es.muralla.dam.ad.fp.model.education;

import java.util.Optional;

public record Matricula (
	Alumno alumno,
	Asignatura asignatura,
	Optional<Nota> nota,
	Profesor profesor
) {
	
}
