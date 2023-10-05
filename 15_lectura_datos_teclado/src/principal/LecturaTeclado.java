package principal;
import java.util.Scanner;

public class LecturaTeclado {

	public static void main(String[] args) {

		//Para usar una clase MOLDE hay que crear un objeto de esa clase
		//para usar una clase hay que importarla (Control + mayuscula + o)
		//Para manejar el objeto y guardarlo, lo guardamos en una variable (sc) con el operador new
		
		Scanner sc= new Scanner(System.in);
		
		// ahora podemos llamar a los métodos o funciones de la clase
		// el método para leer lo introducido por teclado se llama nexLine() y devuelve un string
		
		System.out.println("Escribe tu nombre: ");
		
		//El objeto sc usa el método nextLine(). Y lo guardamos en la variable de tipo string nombre
		String nombre = sc.nextLine();
		
		// mostramos el string capturado
		System.out.println("Te llamas: "+nombre);
	}

}
