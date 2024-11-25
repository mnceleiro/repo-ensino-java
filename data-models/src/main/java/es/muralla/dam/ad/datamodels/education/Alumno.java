package es.muralla.dam.ad.datamodels.education;

import java.time.LocalDate;

public record Alumno (
	String dni,
    String nombre,
    String apellido1,
    String apellido2,
    LocalDate fechaNacimiento,
    Direccion direccion
) {
    
	public String nombreCompleto() {
		return String.format("%s %s %s", nombre, apellido1, apellido2);
	}
}