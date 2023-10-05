package service;

import java.util.HashMap;

public class ContactosService {
	
	// HashMap
	//Clave es un número, valor es un string
					
			HashMap<String, String> agendaContactos =new HashMap<>();
			
						
			
			////MÉTODOS de la clase ProgramaAgenda
				
			public String guardarContacto(String email, String nombre) {
				
				boolean controlrepetido = agendaContactos.containsKey(email);
				
				String res1 ="Email repetido";
										
				if(controlrepetido == true) {
					return res1;
				}else {
					agendaContactos.put(email, nombre);
					return "Email "+email+"-"+nombre+" guardado correctamente";
				}
				
				
			}
			
			
			// método guardarcontacto alternativo
			public boolean guardarContactoAlt(String email, String nombre) {
				
				if(!agendaContactos.containsKey(email)) {
					agendaContactos.put(email, nombre);
					return true;
				}
				return false;
			}
			
			
			public boolean eliminar(String email) {
				
				if(agendaContactos.containsKey(email)) {
					agendaContactos.remove(email);
					return true;
				}
				return false;
			}
			
			
			public String buscarContacto(String email) {
				
				//si no existe devuelve null
				String nombre="";
								
				if(agendaContactos.containsKey(email)) {
					nombre = agendaContactos.get(email);
					return nombre;
				}
				
				String resf = "No hay ningún contacto con este email";
				return resf;
				
			}
			
			
			public String[] listaNombres() {
				//Crear el array calcular el tamaño del array con size()
								
				String[] datos=new String[agendaContactos.size()];
				
				var nombres=agendaContactos.values();
				
				int cont=0;
				//para cada nombre de nombres, en la posición con guarda un 
				for(String n:nombres) {
					datos[cont]=n;
					cont++;
				}
				
				return datos;
				
				//otra manera, creamos un array vacío y el método te lo rellena
				//return agendaContactos.values().toArray()new String[0]);
				
			}
	
	

}
