package model;

import java.util.Date;



/*
Aplicación de pedidos

Un pedido se caracteriza por: producto,fechaPedido,precio

1.- Alta pedido
2.- Pedido más reciente
3.- Pedidos por precio inferior
4.- Salir

*/

public class Pedido {
	
	//atributos producto,fechaPedido,precio
	private String nombreProducto;
	private Date fechaPedido;
	private double precio;
	
	
	//Contructor con atributos
	//El this, nos referimos a la variable más interna
	public Pedido(String nombreProducto, Date fechaPedido, double precio) {
		
		this.nombreProducto = nombreProducto;
		this.fechaPedido = fechaPedido;
		this.precio = precio;
	}

	//constructor sin atributos
	public Pedido() {
		
		
	}

	
	//Generar setter and getter
	//setter (escritura) y getter (lectura) Guardan y Recuperan
	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Date getFechaPedido() {
		
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		
		this.fechaPedido = fechaPedido;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	
	
	
	
	
}