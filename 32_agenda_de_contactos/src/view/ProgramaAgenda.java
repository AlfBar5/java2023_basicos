package view;

import java.util.HashMap;
import java.util.Scanner;

import service.ContactosService;

public class ProgramaAgenda {
	

	public static void main(String[] args) {
		/*
		1- Nuevo contacto
		2- Buscar contacto
		3- Eliminar contacto
		4- Mostrar todos los nombres
		5- Salir
		
		Un contacto tiene como valor el nombre y clave su email.
		
		1.- Se pide el nombre y el email. Si no existe un contacto
		con ese email, se guarda, si ya existe, mensaje de error
		2.- Se pide el email del contacto y se muestra el nombre
		correspondiente. Si no hay contacto con ese email, mensaje
		3.-Se pide el email y se elimina el contacto. Si no existe, mensaje
		4. Muestra todos los nombres de contactos
		*/		
		
		//dos escaners para leer números y textos
		Scanner scint=new Scanner(System.in);
		Scanner sctxt=new Scanner(System.in);
		
		//Creo un objeto notas service para poder acceder a sus métodos
		ContactosService contactos=new ContactosService();
		
		int opcion;
		
		
		do {
			mostrarMenu();
			opcion=scint.nextInt();//lee la opción elegida
			switch(opcion) { //evaluamos
				case 1:
					System.out.println("Introduce Nuevo email");
					//El objeto sc usa el método nextLine(). Y lo guardamos en la variable de tipo string nombre
					String email = sctxt.nextLine();
					System.out.println("Introduce el nombre");
					String nombre = sctxt.nextLine();
					contactos.guardarContacto(email,nombre);
					System.out.println("----");
					break;
				case 2:
					System.out.println("Buscar contacto por email:");
					String email2 = sctxt.nextLine();
					System.out.println("El nombre es: "+contactos.buscarContacto(email2));
					System.out.println("----");
					break;
				case 3:
					System.out.println("Eliminar contacto del email:");
					String email3 = sctxt.nextLine();
					contactos.eliminar(email3);
					System.out.println("----");
					break;
				case 4:
					//System.out.println(contactos.listaNombres()); 
					//String[] datosagend = new String[contactos.agendaContactos.size()];
												
										
					String[] nombres=contactos.listaNombres();
					for(String n:nombres) {
						System.out.println(n);
					}
					
					
					
					break;
								
				case 5:
					System.out.println("---Adios---");
			}
		}while(opcion!=5);
		
	

	}
	
	

	//Método mostrar menú
	static void mostrarMenu() {
		
		System.out.println(" ");
		System.out.println("1.Nuevo contacto: email y nombre");
		System.out.println("2.Buscar contacto por email");
		System.out.println("3.Eliminar contacto");
		System.out.println("4.Mostrar todos los contactos");
		System.out.println("5.Salir");
		System.out.println("Pulse un número del menú: ");
		System.out.println(" ");
		
	}
	

}
