package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestEscrituraAppend {

	public static void main(String[] args) {

				//declaro las variable tipo FileOutputStream y PrintStream
				
				FileOutputStream fos=null;
				PrintStream out = null;
		
					
				//hay que poner el try cacht OBLIGATORIAMENTE
				try {
					
					
					//declaro la variable tipo PrintStream
					//Para añadir texto se necesita un objeto para configurar la forma de escritura
					//Este objeto indica dónde quiero escribir (ruta) y cómo (añadir texto) (en modo append)
					fos = new FileOutputStream("c:\\temp\\dias.txt", true);
					
					//A partie del objeto anterior creamos el PrintStream
					out = new PrintStream(fos);
					
					//ahora añadinos al fichero
					out.println("jueves");
					out.println("viernes");
					
					// el objeto out hay que cerrarlo, 
					// porque si no se pueden crear problemas de memoria
					out.close();
					
					
				}
				catch(FileNotFoundException ex){
					ex.printStackTrace();
				}
				finally {
					// el objeto out y fos hay que cerrarlo, 
					// porque si no se pueden crear problemas de memoria
					
					if(out!=null) {
						out.close();
					}
					
					if(fos!=null) {
						
						try {
							fos.close();							
						}catch (IOException e){
							e.printStackTrace();
						}
						
					}
					
					
				}
				

	}

}
