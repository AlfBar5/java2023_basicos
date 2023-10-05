package principal;

public class MensajePrecioSwitch {

	public static void main(String[] args) {
		// Swicht
		/* el programa comprueba el precio, 
		 * si es 10, muestra un mensaje que muestra "muy caro", 
		 * si es 9 caro
		 * si es 8 aceptable
		 * si es 7 lo compro,
		 * si es 6 barato
		 * otro número, no valido
		 */
		
		int precio=7;
		
		switch(precio){
		 case 10:
		 System.out.println("muy caro");
		 break;
		 case 9:
		 System.out.println("caro");
		 break;
		 case 8:
		 System.out.println("aceptable");
		 break;
		 case 7:
		 System.out.println("Lo compro");
		 break;
		 case 6:
		 System.out.println("barato");
		 break;
		 default:
		 System.out.println("no válido");
		}

		

	}

}
