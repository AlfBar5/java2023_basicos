package principal;

public class EjemploSplit {

	public static void main(String[] args) {
		// Ejemplo de split

		String datos ="Lunes,Martes,Miércoles,Jueves";
		//Convertimos el string en un array de 4 posiciones y metemos cada día en una posición
		
		String [] dias = datos.split(",");
		
		int numerodias = dias.length;
		
		System.out.println("El número de días es: "+numerodias);
		
	}

}
