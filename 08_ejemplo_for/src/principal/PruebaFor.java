package principal;

public class PruebaFor {

	public static void main(String[] args) {
		// bucle for
		//mostrar la suma de todos los números pares comprendidos entre 1 y 20
		

		//int i=1;
		int resultadosuma = 0;
				
		for(int i=1;i<=20;i++){ 
			
			//comprobamos si es par
			if(i%2==0) {
				//resultadosuma=resultadosuma+i;
				resultadosuma+=i;
			}
			 
		 //System.out.println(i);
		 //System.out.println("La suma de los números pares es: "+resultadosuma);
		}
		
		System.out.println("La suma de los números pares es: "+resultadosuma);
		
		

	}

}
