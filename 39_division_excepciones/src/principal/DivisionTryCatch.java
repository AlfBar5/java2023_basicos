package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionTryCatch {

	public static void main(String[] args) {
		// 

		

		try{
						
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Vamos a dividir. Introduce primer número: ");
		 int a=sc.nextInt();
		 System.out.println("Lo dividimos por número: ");
		 int b=sc.nextInt();
		 int s=a/b;
		 System.out.println("División: "+s); //La instrucción se ejecuta solo si no hay errores
		}
		catch(InputMismatchException ex){
		 System.out.println("Número incorrecto");
		 return; //Si metemos un return en un cacht, siempre se ejecuta el finally
		}
		catch(ArithmeticException ex){
		 System.out.println("División por 0");
		}
		//esta no se suele poner porque no podemos saber que pasa, ya que hemos tratado la excepción y ya no vemos el fallo
		catch(Exception ex) {
			System.out.println("Error inesperado");
			//aunque con esto podemos ver el error:
			ex.printStackTrace();
		}
		
		finally{
			System.out.println("Final");
		}
		

	}

}
