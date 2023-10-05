package view;

import java.util.Scanner;

import service.NotasService;

public class ProgramaNotas {

	public static void main(String[] args) {
				
		Scanner sc=new Scanner(System.in);
		
		//Creo un objeto notas service para poder acceder a sus métodos
		NotasService notasService=new NotasService();
		
		int opcion;
		
		
		do {
			mostrarMenu();
			opcion=sc.nextInt();//lee la opción elegida
			switch(opcion) { //evaluamos
				case 1:
					System.out.println("Introduce nota");
					notasService.guardarNota(sc.nextDouble());
					break;
				case 2:
					System.out.println("Introduce posición");
					notasService.eliminarNota(sc.nextInt());
					break;
				case 3:
					System.out.println("La nota media es: "+notasService.media());
					break;
				case 4:
					System.out.println("Total de aprobados: "+notasService.aprobados());
					break;
				case 5:
					System.out.println("Mostrar notas: "+notasService.mostarNotas());
					/*
					for(double n:notas) {
						System.out.println(n);
					}
					*/
					break;
				
				case 6:
					System.out.println("---Adios---");
			}
		}while(opcion!=5);
		
		
		

	}
	
	
	//Método mostrar menú
	static void mostrarMenu() {
		
		System.out.println("1.Añadir nota");
		System.out.println("2.Eliminar nota por posición");
		System.out.println("3.Nota media");
		System.out.println("4.Total de aprobados");
		System.out.println("5.Mostrar todas las notas");
		System.out.println("6.Salir");
		System.out.println("Pulse un número del menú: ");
		
	}
	

	
}
