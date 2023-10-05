package principal;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestEscritura {

	public static void main(String[] args) {
		
		// escribimos en un fichero los días de la semana
		
		//declaro la variable tipo PrintStream
		PrintStream out = null;
		
		//hay que poner el try cacht OBLIGATORIAMENTE
		try {
			
			//se pone con doble barra la ruta porque una barra en java tiene un significado especial
			//hay que usar doble barra
			//si el fichero no existe se crea
			out=new PrintStream("c:\\temp\\dias.txt");
			
			//cada vez que creamos el PrintStream el contenido del fichero se machaca
			
			//escribimos en el fichero
			out.println("lunes");
			out.println("martes");
			out.println("miércoles");
			
			
			
		}
		catch(FileNotFoundException ex){
			ex.printStackTrace();
		}
		finally {
			// el objeto out hay que cerrarlo, 
			// porque si no se pueden crear problemas de memoria
			if(out!=null) {
				out.close();
			}
			
			
		}
		
		
		

	}

}
