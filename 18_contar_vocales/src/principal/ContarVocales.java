package principal;
import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		// solicita la introducción de un texto
		// y nos dice cuántas vocales tiene
		
		
		Scanner sc= new Scanner(System.in);
		
		// ahora podemos llamar a los métodos o funciones de la clase Scanner
		// el método para leer lo introducido por teclado se llama nexLine() y devuelve un string
		
		System.out.println("Escribe una frase: ");
		
		//El objeto sc usa el método nextLine(). Y lo guardamos en la variable de tipo string nombre
		String frase = sc.nextLine();
		
		//Convertir todo a minúsculas (para prevenir que metamos vocales mayúsculas)
		frase = frase.toLowerCase();
		
		// mostramos el string capturado
		System.out.println("Lo que has escrito es: "+frase);
		
		int longuitudfrase =frase.length();
		
		//inicializamos contador
		int vocales=0;

		//// contar vocales
		
		for (int i=0;i<frase.length();i++) {
		
			switch(frase.charAt(i)) {
			case 'a','e','i','o','u':
				vocales++;
				break;
			}
			
		}
		
		System.out.println("Total de vocales: "+vocales);

	}

}
