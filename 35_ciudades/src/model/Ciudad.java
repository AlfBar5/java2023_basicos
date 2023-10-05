package model;

public class Ciudad {
	
	private String nombre;
	private String pais;
	private int habitantes;
	
	//constructor con parámetros
	public Ciudad(String nombre, String pais, int habitantes) {
		
		this.nombre = nombre;
		this.pais = pais;
		this.habitantes = habitantes;
	}

	//constructor sin parámetros
	public Ciudad() {
		
	}
	
	
	//Setter y Getter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}


	
	
	

}
