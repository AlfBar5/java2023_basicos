package principal;

public class SumatorioNumerosFor {

	public static void main(String[] args) {
		// For
		//Calcular la suma de todos los números comprendidos entre los dos números
		
		
		int a=30;
		int b=5;
		
		int suma=0;
		// vemos cual de las dos variables es la menor y cual la mayor
		int mayor=a>b?a:b;
		int menor=a>b?b:a;
		
		//hacemos un for desde la variable pequeña a la mayor
		for(int i=menor;i<=mayor;i++) {
			suma+=i;
		
		}
		System.out.println("La suma es: "+suma);
		

	}

}
