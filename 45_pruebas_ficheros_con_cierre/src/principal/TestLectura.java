package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestLectura {

	public static void main(String[] args) {
		// Lectura de ficheros
				
		try (FileReader f = new FileReader("c:\\temp\\dias.txt");
			 BufferedReader bf = new BufferedReader(f))
				
		{
			
			//leemos la primera línea
			String dia=bf.readLine();
			
			//entramos en bucle para leer el resto
			while(dia!=null) {
				
				System.out.println(dia);
				dia=bf.readLine();
			}
			
			
		}
		
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			
		}
		
		
		
		
	}

}
