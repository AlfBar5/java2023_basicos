package principal;

public class PruebasString {

	public static void main(String[] args) {
		// Texto de ejemplo
		//No hace falta importar la libreria ya que esá en el paquete principal
		//Forma de llamar a la clase String e instanciar el objeto:
		//String cad1=new String(“hola”);
		
		//Forma abreviada
		String cad1="hola";
		String cad2="adios";
		cad1=cad1+" "+cad2;
		System.out.println(cad1);

		///// MÉTODOS
		
		//Longuitud de la cadena
		System.out.println(cad1.length());
		
		//Pasar a may
		System.out.println(cad1.toUpperCase());
		
		//Averiguar la posición de una letra
		//internamente JAVA guarda el string en un array de chart
		System.out.println(cad1.charAt(0)); //h
		
		
	}

}
