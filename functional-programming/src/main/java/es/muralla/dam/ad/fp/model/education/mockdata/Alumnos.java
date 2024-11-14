package es.muralla.dam.ad.fp.model.education.mockdata;

import java.time.LocalDate;
import java.util.List;

import es.muralla.dam.ad.fp.model.education.Alumno;
import es.muralla.dam.ad.fp.model.education.Direccion;

public class Alumnos {

	private static final Alumno ROSA_LOPEZ_LOPEZ = new Alumno(
		"12345678L",
		"Rosa",
		"López",
		"López",
		LocalDate.of(2006, 12, 5),
		new Direccion(
			"Emilia Pardo Bazán",
			213,
			2,
			27001,
			"Lugo",
			"Lugo"
		)
	);

	private static final Alumno CARLOS_PEREZ_GARCIA = new Alumno(
		"87654321P",
		"Carlos",
		"Pérez",
		"García",
		LocalDate.of(2007, 1, 10),
		new Direccion(
			"Avenida de Galicia",
			45,
			1,
			27002,
			"Lugo",
			"Lugo"
		)
	);

	private static final Alumno MARIA_GOMEZ_MARTINEZ = new Alumno(
		"13579246M",
		"María",
		"Gómez",
		"Martínez",
		LocalDate.of(2008, 3, 18),
		new Direccion(
			"Ronda das Fontiñas",
			12,
			3,
			27003,
			"Lugo",
			"Lugo"
		)
	);

	private static final Alumno LUIS_FERNANDEZ_SANCHEZ = new Alumno(
		"24681357N",
		"Luis",
		"Fernández",
		"Sánchez",
		LocalDate.of(2005, 7, 22),
		new Direccion(
			"Calle San Pedro",
			56,
			1,
			27001,
			"Lugo",
			"Lugo"
		)
	);

	private static final Alumno ANA_RUIZ_PEREZ = new Alumno(
		"19283746Q",
		"Ana",
		"Ruiz",
		"Pérez",
		LocalDate.of(2004, 5, 9),
		new Direccion(
			"Praza Maior",
			2,
			4,
			27004,
			"Lugo",
			"Lugo"
		)
	);

	private static final Alumno MANUEL_GARCIA_NUNEZ = new Alumno(
		"99887766Z",
		"Manuel",
		"García",
		"Núñez",
		LocalDate.of(2006, 11, 30),
		new Direccion(
			"Rúa Santiago",
			20,
			3,
			27002,
			"Lugo",
			"Lugo"
		)
	);

	private static final Alumno MARTA_VAZQUEZ_DIAZ = new Alumno(
		"33445566L",
		"Marta",
		"Vázquez",
		"Díaz",
		LocalDate.of(2005, 2, 27),
		new Direccion(
			"Rúa das Noreas",
			5,
			2,
			27003,
			"Lugo",
			"Lugo"
		)
	);

	private static final Alumno PABLO_CASTRO_LOPEZ = new Alumno(
		"66554433K",
		"Pablo",
		"Castro",
		"López",
		LocalDate.of(2004, 10, 14),
		new Direccion(
			"Rúa de San Marcos",
			9,
			1,
			27004,
			"Lugo",
			"Lugo"
		)
	);

	private static final Alumno LAURA_GONZALEZ_RODRIGUEZ = new Alumno(
		"12121212F",
		"Laura",
		"González",
		"Rodríguez",
		LocalDate.of(2009, 9, 1),
		new Direccion(
			"Rúa Ourense",
			32,
			5,
			27001,
			"Lugo",
			"Lugo"
		)
	);

	private static final Alumno MIGUEL_ALVAREZ_MARTIN = new Alumno(
		"21212121H",
		"Miguel",
		"Álvarez",
		"Martín",
		LocalDate.of(2008, 4, 19),
		new Direccion(
			"Rúa Foz",
			7,
			2,
			27210,
			"Sarria",
			"Lugo"
		)
	);

	private static final Alumno SARA_DIAZ_FERNANDEZ = new Alumno(
		"54545454J",
		"Sara",
		"Díaz",
		"Fernández",
		LocalDate.of(2005, 8, 15),
		new Direccion(
			"Avenida de Galicia",
			45,
			1,
			27002,
			"Lugo",
			"Lugo"
		)
	);

	// Lista de alumnado
	public static final List<Alumno> ALUMNADO = List.of(
		ROSA_LOPEZ_LOPEZ,
		CARLOS_PEREZ_GARCIA,
		MARIA_GOMEZ_MARTINEZ,
		LUIS_FERNANDEZ_SANCHEZ,
		ANA_RUIZ_PEREZ,
		MANUEL_GARCIA_NUNEZ,
		MARTA_VAZQUEZ_DIAZ,
		PABLO_CASTRO_LOPEZ,
		LAURA_GONZALEZ_RODRIGUEZ,
		MIGUEL_ALVAREZ_MARTIN,
		SARA_DIAZ_FERNANDEZ
	);
}