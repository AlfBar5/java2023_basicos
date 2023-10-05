package principal;

public class LoteriaPrimitiva {

	public static void main(String[] args) {
		// generar combinacion lotería primitiva
		// mientras haya menos de 6 números generados
		// generamos un número y comprobamos que no se haya generado antes (repetido)
		// en caso de que sea nuevo, lo guardamos y s ino vamos a por el siguiente
		
		//creamos array de tamaño 6
		int [] combinacion = new int[6];
		
		int generados=0;
		//generamos 6 números, controlados por la variable generados
		while(generados<6) {
			
			int n=(int)(Math.random()*49+1);
			
			//Control repetidos
			if(!repetido(combinacion,n,generados)) {
				//la posición del array la marca "repetidos"
				combinacion[generados]=n;
				//incremento variable generados en uno
				generados++;
			}
			
		}
		
		
		ordenar(combinacion);
		mostrar(combinacion);
		
		}
		
		
	
	
	
	
		//metódo que nos dirá si el número está repetido en el array
		static boolean repetido(int[] numeros, int num, int total) {
			//recorremos el array desde la posición 0 a la posición total (última generada)
			// primera versión
			/*
			boolean res=false;
			for(int i=0;i<total;i++) {
				if(numeros[i]==num) {
					res=true;
					break;
				}
			}
			
			return res;
			*/
			
			//otra forma más corta, sin variable res
			for(int i=0;i<total;i++) {
				if(numeros[i]==num) {
					return true;
				}
			}
			return false;
			
		}
		
		
		
		
		
		
		
		//metódo que ordena array combinacion. No retorna nada, por eso es void
		//notas y numeros es el mismo array (es un objeto, y no necesitamos retornar el array en el método
		//lo que hagamos en numeros, lo hacemos en notas también
		static void ordenar(int[] numeros) {
			
			int aux;
			
			for(int i=0;i<numeros.length;i++) {
				
				for(int j=i+1;j<numeros.length;j++) {
					
					if(numeros[j]<numeros[i]) { //sustitución
						aux=numeros[j];
						numeros[j]=numeros[i];
						numeros[i]=aux;
					}
					
				}
			
			}
			
			////lo mismo con la clase Arrays, en plural
			//// This class contains various methods for manipulating arrays
			//// llamando importando la librería de la clase
			// Arrays.short(numeros);

			
		}
		
		
		
		
		
		

		//Método que muestra el array
		static void mostrar(int[] numeros) {
	
			for(int n:numeros) {
				System.out.println(n+",");
			}
			
		}
		
		

	
}
