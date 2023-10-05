package principal;

import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		 
		
		// Excepción por fuera de rango, el array solo llega hasta 3
		// Esto es un fallo del programador, no se puede controlar la excepción, da un error
		int[] nums = {5,1,33,10};
		for(int i=0;i<=4;i++) {
			System.out.println(nums[i]);
		}
		
		//Excepción por que el usuario supuestamente mete una letra
		//Es un error del usuario, se puede capturar como excepción y se puede tratar
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce edad: ");
		int edad = sc.nextInt();
		System.out.println("Tienes "+edad+" años");
		

	}

}
