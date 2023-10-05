package service;

import java.util.ArrayList;
import java.util.Date;

import model.Pedido;



/*
Aplicación de pedidos

Un pedido se caracteriza por: producto,fechaPedido,precio

1.- Alta pedido
2.- Pedido más reciente
3.- Pedidos por precio inferior
4.- Salir

*/


public class PedidosService {
	
	//vamos a guardar los datos en un ArrayList
	ArrayList<Pedido> pedidos =new ArrayList<>();
	
	
	
	//método para agregar pedido
	public void guardarPedido(String nombreProducto, Date fechaPedido, double precio) {
		
		pedidos.add (new Pedido(nombreProducto,fechaPedido,precio));
		
		
	}
	
	
	//Pedido más reciente, devolvemos un objeto Pedido
	public Pedido pedidoMasReciente(){
		
		//inicializados a los datos del primer pedido
		Pedido pedido = pedidos.get(0);
		Date fechaReciente=pedido.getFechaPedido();
		
		
		//Vamos recorriendo los pedidos y comparando con after
		for(Pedido p:pedidos) {
			if(p.getFechaPedido().after(fechaReciente)){
				
				fechaReciente=p.getFechaPedido();
				pedido=p;
				
	
			}
		}
		return pedido;
		
	}
	
	
	//lista de pedidos inferiores a un precio dado, devuelve un ArrayList
	public ArrayList<Pedido> pedidosInfPrecio(double precioMax){
		ArrayList<Pedido> listped = new ArrayList<>();
		
		for(Pedido p:pedidos) {
			if(p.getPrecio()<precioMax) {
				listped.add(p);
			}
		}
		
		return listped;
	
	}
	
	
	
	

}
