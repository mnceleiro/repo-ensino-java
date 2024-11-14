package es.muralla.dam.ad.fp;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;

import es.muralla.dam.ad.fp.model.education.Alumno;
import es.muralla.dam.ad.fp.model.education.Direccion;
import es.muralla.dam.ad.fp.model.education.mockdata.Alumnos;

public class MainEducation {
	public static void main(String[] args) {
		// TODO: Obten la lista de alumnos de Sarria.
		
		
		
		// TODO: Obten al lista de nombres y apellidos de alumnos por nombre y apellido
		
		
		
		// TODO: Muestra la lista de estudiantes mayores de edad ordenados por nombre
	
		
		
		// TODO: Obtén el número de alumnos que viven en la Avenida de Galicia en la ciudad de Lugo

		
		
		// TODO: Obten el alumno más joven de la lista.
		
		
		
		// TODO: Obten el DNI del alumno de mayor edad de la lista.
		
		
		
		// TODO: Obten la lista de alumnos que no vivan en Sarria, de ellos obtén las tres primeras direcciones ordenadas alfabeticamente
		
		
		
		// TODO: Obten la lista de asignaturas que no tienen alumnado matriculado
		
		
		
		// TODO: Obten la suma total de de edades del alumnado
		
		
		
		// TODO: Obten la media de edad del alumnado
		
		

	}
	
	
	/**
	 * Devuelve la lista de todos los alumnos de una ciudad concreta
	 * 
	 * @param city ciudad de la que obtener los alumnos
	 * @return List<Alumno> de alumnos de la ciudad
	 */
	public static List<Alumno> getAllFromCity(String city) {
		return Alumnos.ALUMNADO.stream().filter(al -> al.direccion().localidad().equals(city)).toList();
	}
	
	/**
	 * Devuelve el nombre y apellidos de los alumnos de la ciudad pasada como parametro.
	 * @param city ciudad a buscar
	 * 
	 * @return Lista con los nombres y apellidos de los alumnos de esa ciudad.
	 */
	public static List<String> getStudentNamesAndSurnamesFromCity(String city) {
		return Alumnos.ALUMNADO.stream()
				.filter(al -> al.direccion().localidad().equals(city))
				.map(student -> String.format("%s %s %s", 
						student.nombre(), 
						student.apellido1(), 
						student.apellido2()
				 )).toList();
	}
	
	/**
	 * Muestra la lista de estudiantes mayores de edad ordenados por nombre
	 */
	public static void showAdultStudentNamesSurnamesSortedByName() {
		Alumnos.ALUMNADO.stream()
			.filter(a -> Period.between(a.fechaNacimiento(), LocalDate.now()).getYears() >= 18)
			.forEach(a -> System.out.println(a.nombre() + " " + a.apellido1() + " " + a.apellido2()));
	}
	
	
	/**
	 * 
	 * @param address direccion del alumno
	 * @param city ciudad donde vive el alumno
	 * @return numero de alumnos que viven en esa ciudad y direccion
	 */
	public static long getStudentCountByAddressAndCity(String address, String city) {
		return Alumnos.ALUMNADO.stream()
		.filter(a -> a.direccion().localidad().equalsIgnoreCase(city) && a.direccion().calle().equalsIgnoreCase(city))
		.count();
	}
	
	/**
	 * Obtiene el alumno mas joven de la lista.
	 * 
	 * @return Optional<Alumno> El alumno más joven
	 */
	public static Optional<Alumno> getYoungestStudent() {
		Optional<Alumno> alumnoOptional = Alumnos.ALUMNADO.stream()
				.max((a1, a2) -> a1.fechaNacimiento().compareTo(a2.fechaNacimiento()));
	
		return alumnoOptional;
	}
	
	/**
	 * Obtiene el DNI del alumno más mayor de la lista
	 * 
	 * @return Optional<String> DNI del alumno mas viejo
	 */
	public static Optional<String> getOldestStudentDni() {
		return Alumnos.ALUMNADO.stream()
			.sorted((a1, a2) -> a1.fechaNacimiento().isBefore(a2.fechaNacimiento()) ? 1 : -1)
			.findFirst().map(a -> a.dni());
	}
	
	/**
	 * Obtiene las direcciones de los tres primeros alumnos alfabeticamente
	 * que no viven en la ciudad pasada como parametro
	 * 
	 * @param city: ciudad donde no viven
	 * 
	 * @return List<Direccion> direcciones de los 3 primeros alumnos alfabeticamente que no viven en la ciudad
	 */
	public static List<Direccion> getAddressesNotLivingInCityFromThreeFirstStudentsAlphabetically(String city) {
		return Alumnos.ALUMNADO.stream()
			.filter(a -> !a.direccion().localidad().equals(city))
			.sorted((a1, a2) -> a1.nombreCompleto().compareTo(a2.nombreCompleto()))
			.limit(3)
			.map(a -> a.direccion())
			.toList();
	}
}
