package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestEscrituraAppend {

	public static void main(String[] args) {

		//declaro las variable tipo FileOutputStream y PrintStream
				
		//declaro la variable tipo PrintStream
		//Para añadir texto se necesita un objeto para configurar la forma de escritura
		//Este objeto indica dónde quiero escribir (ruta) y cómo (añadir texto) (en modo append)
		
		
		//A partie del objeto anterior creamos el PrintStream
					
		//hay que poner el try cacht OBLIGATORIAMENTE. 
		//Para evitar el finally declaro los objetos en el try
		//Declaro y creo en la misma instrucción. Como son dos, hay que poner ;
				try(FileOutputStream fos = new FileOutputStream("c:\\temp\\dias.txt", true);
					PrintStream out = new PrintStream(fos))			
				{
					
					//ahora añadinos al fichero
					out.println("jueves");
					out.println("viernes");
					
					// el objeto out hay que cerrarlo, 
					// porque si no se pueden crear problemas de memoria
					out.close();
					
					
				}
				catch(IOException ex){
					ex.printStackTrace();
				}
				

	}

}
