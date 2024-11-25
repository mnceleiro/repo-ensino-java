package es.muralla.dam.ad.datamodels.education;

public record Direccion (
	String calle,
	int portal,
	int piso,
	
	int codigoPostal,
	String localidad,
	String provincia
) {
	
}