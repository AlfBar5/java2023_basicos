package principal;

import java.util.Scanner;

public class Verificador {

	public static void main(String[] args) {
		// realizar un programa que solicite la introducción de un correo electrónico
		// y nos diga si es o no válida
		// dirección válida es aquella que contiene al menos un . y una @

		
		Scanner email= new Scanner(System.in);
		
		// ahora podemos llamar a los métodos o funciones de la clase Scanner
		// el método para leer lo introducido por teclado se llama nexLine() y devuelve un string
		
		System.out.println("Escribe un email: ");
		
		//El objeto sc usa el método nextLine(). Y lo guardamos en la variable de tipo string nombre
		String emailv = email.nextLine();
		
		//Convertir todo a minúsculas (para prevenir que metamos vocales mayúsculas)
		emailv = emailv.toLowerCase();
		
		// mostramos el string capturado
		System.out.println("El email que has escrito es: "+emailv);
		
		int arrobar = emailv.indexOf("@");
		int pospunto = emailv.indexOf(".");
		
		if(arrobar !=-1 && pospunto != -1) {
			System.out.println("El email es verdadero. ");
		}else {
			System.out.println("El email es falso. ");
		}
		
		
		// Tambien se puede usar esto, así no tenemos que declarar las variables
		if(emailv.indexOf("@") !=-1 && emailv.indexOf(".")  !=-1) {
			System.out.println("El email es verdadero. ");
		}else {
			System.out.println("El email es falso. ");
		}
		
		

		// con método contains
		if(emailv.contains("@") && emailv.contains(".") ) {
			System.out.println("El email es verdadero. ");
		}else {
			System.out.println("El email es falso. ");
		}
		
		
		
		
		
		
	}

}
