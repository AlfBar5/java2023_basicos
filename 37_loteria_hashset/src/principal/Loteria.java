package principal;

import java.util.HashSet;

public class Loteria {

	public static void main(String[] args) {
		// Como en la colección tipo hashset no se admiten valores repetidos podemos crear 
		// los 6 números de la lotería
		
		HashSet <Integer> combinacion = new HashSet<>();
		
		while(combinacion.size()<6) {
			combinacion.add((int)(Math.random()*49+1));
		}

		//Para mostrar la combinación
		for(int n:combinacion) {
			System.out.println(n+",");
		}
		
	}

}
