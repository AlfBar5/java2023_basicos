package principal;

import java.util.Scanner;


public class SumatorioNumerosForConCapturaTeclado {

	public static void main(String[] args) {
		// For
		//Calcular la suma de todos los números comprendidos entre los dos números
		
		Scanner scnumeroa= new Scanner(System.in);
		Scanner scnumerob= new Scanner(System.in);
		
		System.out.println("Escribe el primer número: ");
		int a=scnumeroa.nextInt();
		
		System.out.println("Escribe el segundo número: ");
		int b=scnumerob.nextInt();
		
		int suma=0;
		// vemos cual de las dos variables es la menor y cual la mayor
		//int mayor=a>b?a:b;
		//int menor=a>b?b:a;
		
		int mayor=Math.max(a, b);
		int menor=Math.min(a, b);
		
		//hacemos un for desde la variable pequeña a la mayor
		for(int i=menor;i<=mayor;i++) {
			suma+=i;
		
		}
		System.out.println("La suma es: "+suma);
		

	}

}
