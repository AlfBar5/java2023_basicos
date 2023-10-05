package service;

import java.util.HashMap;

import model.Contacto;

public class AgendaService {
	HashMap<String,Contacto> agenda=new HashMap<String, Contacto>();
	
	public boolean agregar(String email, String nombre,int edad, int telefono) {
		//si el email no está, añadimos contacto
		//y devolvemos true
		if(!agenda.containsKey(email)) {
			Contacto contacto=new Contacto(nombre, email, edad, telefono);
			agenda.put(email, contacto);
			return true;
		}
		return false;
	}
	
	public boolean eliminar(String email) {
		//si el email no está, añadimos contacto
		//y devolvemos true
		if(agenda.containsKey(email)) {
			agenda.remove(email);
			return true;
		}
		return false;
	}
	
	public Contacto buscar(String email) {
		//a partir de la clave, devuelve el contacto,
		//si no existiera, devuelve directamente null
		return agenda.get(email);
	}
	
	public Contacto[] contactos() {
		//el método toArray de collection devuelve un array con los datos
		//de la colección, a partir de un array vacío
		return agenda.values().toArray(new Contacto[0]);
	}
	
	
	
}
