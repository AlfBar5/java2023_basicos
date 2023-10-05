package principal;

public class CalculosEdades {

	public static void main(String[] args) {
		
		int[] edades = {34,19,28,55,61,40};
		
		//calcular la media de edad
		//decir edad mayor y menor
		//inicializamos variables con un valor existente en el array
		int edadmayor = edades[0];
		int edadmenor = edades[0];
		
		double suma = 0;
		
		for(int i=0;i<edades.length;i++) {
			
			suma += edades[i];
			
			//actualizo la variable edadmayor si edades[i]es más alta
			if (edades[i] > edadmayor) {
				edadmayor = edades[i];
			}
			
			//actualizo la variable edadmenor si edades[i]es más baja
			if (edades[i] < edadmenor) {
				edadmenor = edades[i];
			}
			
		}
		
		System.out.println("La suma es: "+suma);
		System.out.println("El total de valores es: "+edades.length);
		System.out.println("La media es: "+suma/edades.length);
		System.out.println("La edad mayor es: "+edadmayor);
		System.out.println("La edad mayor es: "+edadmenor);
		

	}

}
