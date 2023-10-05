package principal;

public class ComprobarProvincia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String localidad="Alcalá de Henares (Madrid)";
		
		//Mostrar la provincia con substring
		//localidad.indexOf("(")
		//localidad.indexOf(")")
		
		System.out.println(localidad.substring(localidad.indexOf("(")+1,localidad.indexOf(")"))); 

		
	}

}
