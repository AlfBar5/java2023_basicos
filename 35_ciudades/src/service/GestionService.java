package service;

import java.util.ArrayList;

import model.Ciudad;


/*
Programa para gestión de ciudades
Una ciudad se caracteriza por un nombre, habitantes y pais.

1. Nueva ciudad
2. Ciudades por pais
3. Ciudad más poblada
4. Eliminar ciudad
5. Salir

1. Pide los datos de la ciudad y la guarda
2. Se pide el pais, y muestra datos de todas sus ciudades
3. Muestra datos de la ciudad más poblada
4. Pide el nombre de la ciudad y la elimina

Las ciudades se guardan en un ArrayList

*/

public class GestionService {
	
	//vamos a guardar los datos en un ArrayList
	ArrayList<Ciudad> ciudades =new ArrayList<>();
	
	
	//Método para agregar ciudad
	public void guardarCiudad(String nombre, String pais, int habitantes) {
		
		ciudades.add(new Ciudad(nombre, pais, habitantes));		
		
		//return "Ciudad "+nombre+" añadida";
		
		
	}
	
	
	
	
	
	public ArrayList<Ciudad> ciudadesPorPais(String pais){
		
		//Guardamos las ciudades en un arraylist por que no sabemos el tamaño que tendrá
		ArrayList<Ciudad> aux = new ArrayList<>();
		
		for(Ciudad c:ciudades) {
			//si la ciudad es del pais buscado, la añadimos al arraylist aux
			if(pais.equals(c.getPais())) {
				aux.add(c);
			}
		}
		
		//retorna un arraylist
		return aux;
		
	}
	
	
	
	public Ciudad ciudadMasPoblada() {
		//declaro dos variables
		int habitantesMax=0;
		Ciudad ciudad=null;
		//vamos recorriendo las ciudades
		for(Ciudad c:ciudades) {
			if(c.getHabitantes()>habitantesMax) {
				habitantesMax=c.getHabitantes();
				ciudad=c;
			}
			
		}
		return ciudad;
	}
	
	
	
	
	public void eliminarCiudad(String nombre) {
		
		for(int i=0; i<ciudades.size();i++) {
			if(nombre.equals(ciudades.get(i).getNombre())) {
				ciudades.remove(i);
				break;
			}
		}
		
		
	
		
	}

	 
	
	
}
