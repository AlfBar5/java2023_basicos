package principal;

public class LanzarDado {

	public static void main(String[] args) {
		// Hacer un programa que simule el lanzamiento de un dado
		
		
		
		
		//Aleatorio entre 1 y 6
		//int resultado= (int)(Math.random()*6+1);
		
		//System.out.println("El resultado del lanzamiento es: "+resultado );
		
		
		//lanzamos el dado 10000 veces y mostramos los porcentajes de cada resultado
		
		int res1 = 0;
		int res2 = 0;
		int res3 = 0;
		int res4 = 0;
		int res5 = 0;
		int res6 = 0;
		
		
		
		for (int i=1;i<=10000;i++) {
			
			int resultado= (int)(Math.random()*6+1);
			
			switch(resultado){
			case 1:
				res1++;
				//contadores[0]++;
				break;
			case 2:
				res2++;
				//contadores[1]++;
				break;
			case 3:
				res3++;
				//contadores[2]++;
				break;
			case 4:
				res4++;
				//contadores[3]++;
				break;
			case 5:
				res5++;
				//contadores[4]++;
				break;
			case 6:
				res6++;
				//contadores[6]++;
				break;
			default:
				System.out.println(" ");
								 
			}
			
			
			
		}
		
		System.out.println("El total de 1 es: "+res1 );
		System.out.println("El porcentaje de 1 es: "+res1/100+"%" );
		System.out.println("-------");
		System.out.println("El total de 2 es: "+res2 );
		System.out.println("El porcentaje de 2 es: "+res2/100+"%" );
		System.out.println("-------");
		System.out.println("El total de 3 es: "+res3 );
		System.out.println("El porcentaje de 3 es: "+res3/100+"%" );
		System.out.println("-------");
		System.out.println("El total de 4 es: "+res4 );
		System.out.println("El porcentaje de 4 es: "+res4/100+"%" );
		System.out.println("-------");
		System.out.println("El total de 5 es: "+res5 );
		System.out.println("El porcentaje de 5 es: "+res5/100+"%" );
		System.out.println("-------");
		System.out.println("El total de 6 es: "+res6 );
		System.out.println("El porcentaje de 6 es: "+res6/100+"%" );
		
		
		
		
		
		
		
		//// Otra forma
		//Se puede hacer con un array de 6 posiciones
		int[] contadores= new int[6];
		for (int i=1;i<=10000;i++) {
			
			int dado= (int)(Math.random()*6+1);
		
			//para ahorrarse el switch
			contadores[dado-1]++;
		}

		System.out.println(" ");
		System.out.println("------------------");
		System.out.println("----OTRA FORMA---");
		System.out.println("------------------");
		System.out.println(" ");
		
		for (int i=0; i<contadores.length;i++) {
			System.out.println("El total de "+(i+1)+" es "+contadores[i] );
			System.out.println("Porcentaje de "+(i+1)+": "+contadores[i]*100.0/10000);
			System.out.println("-------------");
		}
		
		
		
		
		
		
		
		
	}

}
