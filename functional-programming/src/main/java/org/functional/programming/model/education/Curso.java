package org.functional.programming.model.education;

import java.util.List;

public record Curso (
	int numeroCurso,	// primero, segundo, tercero o cuarto
	List<Matricula> matriculas
) {
	
}