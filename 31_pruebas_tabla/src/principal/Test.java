package principal;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		// HashMap
		//Clave es un número, valor es un string
		
		//HashMap<Integer, String> dias =new HashMap<Integer, String>();
		HashMap<Integer, String> dias =new HashMap<>();
		dias.put(100,  "Lunes");
		dias.put(200,  "Martes");
		dias.put(300,  "Miércoles");
		dias.put(400,  "Jueves");
		dias.put(500,  "Viernes");
		
		System.out.println(dias.get(400));
		
		//Para controlar si la clave está siendo usada, devuelve true si está usada
		boolean controlrepetido = dias.containsKey(200);
		System.out.println(controlrepetido);
				
		//System.out.println(controlrepetido);
		
		//eliminar
		dias.remove(200);
		
		System.out.println("-----");
		
		var valores=dias.values();
		for(String s:valores) {
			System.out.println(s);
		}
		
		
		System.out.println("-----");
		
		var claves=dias.keySet();
		for(int s:claves) {
			System.out.println(s);
		}
		
	}

}
