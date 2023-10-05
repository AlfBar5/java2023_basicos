package view;

import java.util.Scanner;

import service.GestionService;

public class ProgramaGestion {

	static GestionService gestionservice = new GestionService();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		do {
		mostrarMenu();
		opcion=sc.nextInt();//lee la opción elegida
		switch(opcion) { //evaluamos
			case 1:
				agregarCiudad();
				break;
			case 2:
				//buscarPorPais();
				break;
			case 3:
				//ciudadMasPoblada();
				break;
			case 4:
				//eliminarCiudad();
				break;
			
			case 5:
				System.out.println("---Adios---");
		}
	}while(opcion!=5);
		

	}

	static void mostrarMenu() {
	System.out.println("1.- Nueva ciudad");
	System.out.println("2.- Buscar ciudades de un país");
	System.out.println("3.- Buscar ciudad más poblada");
	System.out.println("4.- Eliminar ciudad");
	System.out.println("5.- Salir");

	}


	
	static void agregarCiudad() {
		Scanner scpedir=new Scanner(System.in);
		
		String nombre;
		String pais;
		int habitantes;
		
		System.out.println("Introduce el nombre de la ciudad");
		nombre=scpedir.nextLine();
		
		System.out.println("Introduce nombre del país");
		pais=scpedir.nextLine();
		
		
		System.out.println("Introduce nº habitantes:");
		habitantes=Integer.parseInt(scpedir.nextLine());
		
		gestionservice.guardarCiudad(nombre,pais,habitantes);
	}
	
	

}
