package principal;

public class Comprobar {

	public static void main(String[] args) {

		//comprobar si hay algún número negativo en el array
		int [] nums = {3,5,11,2,3,-7,23,4};
		int resultado = 0;
		
		for (int n:nums) {
			//System.out.println(n);
			if (n<0) {
				resultado=1;
			}
		}
		
		if (resultado == 1) {
			System.out.println("Hay negativos");
		}else {
			System.out.println("No hay negativos");
		}
		
		
		
		
		//comprobar si hay algún número negativo en el array
		int [] nums2 = {3,5,11,-2,3,-7,23,4};
		boolean negativo = false;
				
		for (int n:nums2) {
			//System.out.println(n);
			if (n<0) {
				negativo=true;
				break; //ya hemos encontrado un negativo, salimos del bucle
			}
		}
		
		//hay negativo
		if (negativo) {
			System.out.println("Hay negativos");
		}else {
			System.out.println("No hay negativos");
		}
		
		
		
	}

}
