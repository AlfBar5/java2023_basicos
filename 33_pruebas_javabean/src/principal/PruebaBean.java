package principal;

import java.util.ArrayList;

import model.Alumno;

public class PruebaBean {

	public static void main(String[] args) {
		// Creamos un objeto alumno
		
		Alumno alumno = new Alumno("Alumno 1", "Java 21", 45);
		
		//ver curso
		System.out.println("El alumno es del curso: "+alumno.getCurso());
		alumno.setEdad(12);
		
		//se pueden crear colecciones y arrays de JavaBeans
		ArrayList<Alumno> alumnos=new ArrayList<>();
		
		System.out.println();
		alumnos.add(alumno);

	}

}
