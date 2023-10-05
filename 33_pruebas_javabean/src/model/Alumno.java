package model;

public class Alumno {
	
	private String nombre;
	private String curso;
	private int edad;
	
	
	
	

	//primer constructor de la clase (con parámetros), no es un método, es solo el nombre de la clase y todos los atributos de la clase
	public Alumno(String nombre, String curso, int edad) {
		this.nombre=nombre;
		this.curso=curso;
		this.edad=edad;		
	}
	
	
	
	//segundo constructor de la clase (con parámetros)
	public Alumno() {
		
	}

	//método para devolver el dato getter
	
	//método para guardar setter

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}


	
	
	


	
	
	
	

}
