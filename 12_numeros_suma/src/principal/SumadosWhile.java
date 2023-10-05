package principal;

public class SumadosWhile {

	public static void main(String[] args) {
		// while
		// ¿Cuántos números, empezando por 1, tenemos que sumar hasta
		// alcanzar o superar 1000?
		

		int n=0;
		int suma=0;
		
		while(suma<1000){
			n++;
			suma+=n;
			
			//suma += n++;
		
		}
		System.out.println("Hay que sumar números hasta: "+n+" veces");

	}

}
