package service;

import java.util.ArrayList;

//1-Lógica de negocio o de servicio
//Son los cálculos
//va sin main

public class NotasService {
	
	ArrayList<Double> notas=new ArrayList<>();
	

	
	
	////MÉTODOS de la clase NotasService
	
	public void guardarNota(double nota) {
		
		notas.add(nota);
		
	}
	
	
	
	public void eliminarNota(int pos) {
		
		//comprobamos que la posición (pos) existe dentro del array
		if(pos<notas.size()) {
			notas.remove(pos);
		}
		
		
	}
	
	
	// Método no hay que pasar parámetros, ya que el array de notas que necesito ya está dentro de la clase NotasService
	public double media() {
		
		double res=0;
		for(double d:notas) {
			res+=d;
		}
		return res / notas.size();
		
	}
	
	
		
	
	// Método no hay que pasar parámetros, ya que el array de notas que necesito ya está dentro de la clase NotasService
	public int aprobados() {
		
		int cont=0;
		for(double d:notas) {
			if(d>5) {
				cont++;
			}
		}
		return cont;
		
	}
	
	
	public ArrayList<Double> mostarNotas(){
		return notas;
	}
	
	
	
}








