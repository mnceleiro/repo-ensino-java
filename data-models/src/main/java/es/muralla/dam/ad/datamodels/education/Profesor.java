package es.muralla.dam.ad.datamodels.education;

import java.time.LocalDate;

public record Profesor (
    String nombre,
    String especialidad,
    LocalDate fechaNacimiento,
    String dni
    
) { }