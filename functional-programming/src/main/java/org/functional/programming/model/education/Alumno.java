package org.functional.programming.model.education;

import java.time.LocalDate;
import java.util.List;

public record Alumno (
	String dni,
    String nombre,
    String apellido1,
    String apellido2,
    LocalDate fechaNacimiento,
    Direccion direccion
) {
    	
}