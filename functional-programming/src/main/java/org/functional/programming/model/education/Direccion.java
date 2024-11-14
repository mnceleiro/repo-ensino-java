package org.functional.programming.model.education;

public record Direccion (
	String calle,
	int portal,
	int piso,
	
	int codigoPostal,
	String localidad,
	String provincia
) {
	
}