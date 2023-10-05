package principal;

public class ProgramaNotasSwicht {

	public static void main(String[] args) {
		// Swicht
		//Calificación en función de la nota optenida
		
		int nota=6;
		
		switch(nota){
		case 1,2,3,4:
			System.out.println("Suspenso");
			break;
		case 5,6:
			System.out.println("Aprobado");
			break;
		case 7,8:
			System.out.println("Notable");
			break;
		case 9,10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Nota no válida");
							 
		}
		
		

		//antes de java 17 tenía que ser así
		int i = 2;

		switch(i) {
		  case 0:
		  case 1:
		  case 2:
		  case 3:
		  case 4:
		    System.out.println("i es menor que cinco");
		    break;
		  case 5:
		    System.out.println("i es cinco");
		    break;
		  case 6:
		  case 7:
		  case 8:
		  case 9:
		    System.out.println("i es menor que diez y mayor a cinco");
		    break;
		  default:
		    System.out.println("i es diez o mayor a diez");
		}
		
		
	}

}
