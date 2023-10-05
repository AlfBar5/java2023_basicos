package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import model.Pedido;

public class PedidosService {
	//arrayList que guarda objetos Pedido
	//ArrayList<Pedido> pedidos=new ArrayList<>();
	
	//ruta del fichero donde guardamos pedidos
	String dir="c:\\temp\\pedidos.txt";
	
	//Aprovechamos el constructor de la clase
	//que es lo primero que se ejecuta para hacer comprobaciones
	//podemos crear el fichero txt si no existe, por ejemplo para evitar errores
	public PedidosService() {
		//Creamos objeto File
		File fichero = new File(dir);
		if(!fichero.exists()) {
			//si no existe lo creamos. Dando a sounrround con try catch, nos lo crea
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public void guardarPedido(String producto, LocalDate fechaPedido,double precio) {
		
		try(FileOutputStream fos = new FileOutputStream(dir, true);
			PrintStream out = new PrintStream(fos))
			{
						
				//grabamos en txt
				out.println(producto+","+fechaPedido+","+precio);
				

			}catch(IOException ex) {
				ex.printStackTrace();
			}
		
	}
	
	
	
	public Pedido pedidoMasReciente() {
		
		//declaramos variable pedidoreciente
		Pedido pedidoReciente =null;
		
		try (FileReader f = new FileReader(dir);
				BufferedReader bf = new BufferedReader(f))
							
			{
				
				//leemos la primera línea 
				String linea=bf.readLine();
				
				//si la primera línea o el fichero no existe:
				if(linea==null) {
					return null;
				}
				
				//split, convierte la cadena de caracteres en un array,
				//el separador es la coma
				String [] datos = linea.split(",");
				
				//la primera línea la tengo ya
				//variable que va a contener los datos del pedido más reciente
				pedidoReciente = new Pedido(datos[0],LocalDate.parse(datos[1]),Double.parseDouble(datos[2]));
				
				LocalDate fechaReciente=pedidoReciente.getFechaPedido();
				
				linea=bf.readLine();
				//entramos en bucle para leer el resto
				
				while(linea!=null) {
					//Hacemos el split de la línea dos y siguientes
					datos = linea.split(",");
					//hago el split
					Pedido p = new Pedido(datos[0],LocalDate.parse(datos[1]),Double.parseDouble(datos[2]));
					
					if(p.getFechaPedido().isAfter(fechaReciente)) {
						//si encontramos una fecha más reciente
						fechaReciente=p.getFechaPedido();
						pedidoReciente=p;
					}
					
					//pasamos a la siguiente línea				
					linea=bf.readLine();
					
				}
				
						
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		
		return pedidoReciente;
						
	}

	
	public ArrayList<Pedido> pedidosPrecio(double precioMax) {
		
		//creamos el arrayLis que tenemos que devolver
		ArrayList<Pedido> resultado=new ArrayList<Pedido>();
		
		//declaramos variable pedidoreciente
		Pedido lineaPedido =null;
		
		
		try (FileReader f = new FileReader(dir);
				BufferedReader bf = new BufferedReader(f))
							
			{
		
			//leemos la primera línea 
			String linea=bf.readLine();
								
			//entramos en bucle directamente
			while(linea!=null) {
				
				String [] datos = linea.split(",");
								
				Pedido p = new Pedido(datos[0],LocalDate.parse(datos[1]),Double.parseDouble(datos[2]));
				
				if(p.getPrecio() < precioMax) {
					
					resultado.add(p);
				
				}
				//pasamos a la siguiente línea				
				linea=bf.readLine();
							
			}
			
			
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		
		//retornamos el array resultado
		return resultado;
		
		
		
	}
	
	
	
	
	
	public ArrayList<Pedido> anteriores(int meses){
		//declaramos el arraylist 
		ArrayList<Pedido> resultado=new ArrayList<>();
		
		LocalDate referencia=LocalDate.now().minusMonths(meses);
	
		
		try (FileReader f = new FileReader(dir);
				BufferedReader bf = new BufferedReader(f))
							
			{
		
			//leemos la primera línea 
			String linea=bf.readLine();
								
			//entramos en bucle directamente
			while(linea!=null) {
				
				//guardamos la línea como array de datos con split
				String [] datos = linea.split(",");
								
				Pedido p = new Pedido(datos[0],LocalDate.parse(datos[1]),Double.parseDouble(datos[2]));
				
				if(p.getFechaPedido().isBefore(referencia)) {
					
					resultado.add(p);
				
				}
				//pasamos a la siguiente línea				
				linea=bf.readLine();
							
			}
			
			
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		
		//retornamos el array resultado
		return resultado;		
		
		
		
		
		
		
		
	}
}
