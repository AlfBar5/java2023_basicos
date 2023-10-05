package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		// realizar un programa que vaya solicitando la introducción de números enteros
		// los irá guardando. 
		//Cada vez que pide un número y lo guarda preguntará al usuario si desea introducir otro número
		//Cuando diga el usuario que no quiere introducir más números se mostrará la suma de todos los números introducidos

		//Dos scaner, uno para lectura de números y otro para lectura de textos
		
		//Colección de numeros
		ArrayList<Integer> lista= new ArrayList<>();
		
		Scanner scNumeros= new Scanner(System.in);
		Scanner scTextos= new Scanner(System.in);
		
		int num;
		String resp;
		int suma=0;
		
					
		do{
			System.out.println("Introduce un número: ");
			num=scNumeros.nextInt();
			lista.add(num); //autoboxing de int a Integer
			System.out.println("Desea introducir otro número (si/no): ");
			resp=scTextos.nextLine();
			
		} while(resp.equals("si"));
		
		
		for(int n:lista) {
			suma+=n;
		}
		
				
		
		// mostramos el string capturado
		System.out.println("Números: "+lista);
		System.out.println("La suma: "+suma);
		
		
	
	}

}
