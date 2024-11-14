package org.functional.programming.model.education;

import java.time.LocalDate;

public record Profesor (
    String nombre,
    String especialidad,
    LocalDate fechaNacimiento,
    String dni
    
) { }