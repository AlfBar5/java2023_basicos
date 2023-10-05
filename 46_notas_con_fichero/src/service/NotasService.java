package service;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

//1-Lógica de negocio o de servicio
//Son los cálculos
//va sin main
//guardamos en fichero c:\\temp\\notas.txt

public class NotasService {
	
	ArrayList<Double> notas=new ArrayList<>();
	
	//ruta del fichero
	String dir="c:\\temp\\notas.txt";
	
	////MÉTODOS de la clase NotasService
	
	//guardamos notas en fichero .txt
	public void guardarNota(double nota) {
		try(FileOutputStream fos = new FileOutputStream(dir, true);
			PrintStream out = new PrintStream(fos))
			{
				out.println(nota);
				
		
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		
	}
	
	
	
	/*
	
	public void eliminarNota(int pos) {
		
		//comprobamos que la posición (pos) existe dentro del array
		if(pos<notas.size()) {
			notas.remove(pos);
		}
		
		
	}
	
	*/
	
	// Método no hay que pasar parámetros, ya que el array de notas que necesito ya está dentro de la clase NotasService
	public double media() {
		
		//creamos variable double
		double media=0;
		//Creamos un contador para contar la cantidad de notas que vamos leyendo
		int contador=0;
		
		// Lectura de ficheros
		try (FileReader f = new FileReader(dir);
			BufferedReader bf = new BufferedReader(f))
						
		{
			
			//leemos la primera línea
			String nota=bf.readLine();
			//entramos en bucle para leer el resto
			while(nota!=null) {
				//cada vez que pasamos aumentamos contador
				contador++;
				//sumamos todas las notas
				media+=Double.parseDouble(nota);
				//pasamos a siguiente línea
				nota=bf.readLine();
			}
			
					
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		//hacemos la división y retornamos la media
		return media/contador;
		
		
		
	}
	
	
		
	
	// Método no hay que pasar parámetros, ya que el array de notas que necesito ya está dentro de la clase NotasService
	public int aprobados() {
		
		//Creamos un contador para contar la cantidad de notas que vamos leyendo
		int aprobados=0;
		
		try (FileReader f = new FileReader(dir);
				BufferedReader bf = new BufferedReader(f))
							
			{
				
				//leemos la primera línea
				String nota=bf.readLine();
				//entramos en bucle para leer el resto
				while(nota!=null) {
					//convertimos string a double
					if(Double.parseDouble(nota) >= 5) {
						aprobados++;
					}
					//pasamos a la siguiente línea
					nota=bf.readLine();
					
				}
				
						
			}catch(IOException ex) {
				ex.printStackTrace();
			}
			
			//hacemos la división y retornamos la media
			return aprobados;
		
				
		
	}
	
	
	public ArrayList<Double> mostarNotas(){
		
		ArrayList<Double> notas=new ArrayList<>();
		
		try (FileReader f = new FileReader(dir);
				BufferedReader bf = new BufferedReader(f))
		{
			//leemos la primera línea
			String not=bf.readLine();
			
			//entramos en bucle para leer el resto
			while(not!=null) {
				
				notas.add(Double.parseDouble(not));
				not=bf.readLine();
			}
			
			
		}
		
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
		
		return notas;
	}
	
	
	
}








