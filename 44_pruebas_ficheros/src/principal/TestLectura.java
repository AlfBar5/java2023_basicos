package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestLectura {

	public static void main(String[] args) {
		// Lectura de ficheros
		
		FileReader f =null;
		BufferedReader bf = null;
		
		try {
			f = new FileReader("c:\\temp\\dias.txt");
			bf = new BufferedReader(f);
			
			
			String dia;
			
			//entramos en bucle para leer el resto
			while((dia=bf.readLine())!=null) {
				
				System.out.println(dia);
				
			}
			
			
		}
		
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			// el objeto out y fos hay que cerrarlo, 
			// porque si no se pueden crear problemas de memoria
			
			if(bf!=null) {
				
				try {
					bf.close();							
				}catch (IOException e){
					e.printStackTrace();
				}
			}
			
			if(f!=null) {
				
				try {
					f.close();							
				}catch (IOException e){
					e.printStackTrace();
				}
				
			}
			
		}
		
		
		
		
	}

}
