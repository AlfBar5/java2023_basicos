package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.AgendaService;

class TestAgendaService {

		
	AgendaService service;
	
	//Añadimos 5 contactos a la lista
	// @BeforeEach se lanza antes de cada método individual
	// @BeforeEach setUp() -- antes de cada método de prueba, pero antes cargo unos datos, iguales para cada método. 
	@BeforeEach
	void setUp() throws Exception{
		service= new AgendaService();
		service.agregar("c1@gmail.com", "c1", 20, 22222);
		service.agregar("c2@gmail.com", "c2", 20, 22222);
		service.agregar("c3@gmail.com", "c3", 20, 22222);
		service.agregar("c4@gmail.com", "c4", 20, 22222);
		service.agregar("c5@gmail.com", "c5", 20, 22222);
	}
	
	
	// métodos de prueba, que nosotros damos de alta, y donde se dan las suposiciones
	// son void, pero si fallan te generan un error
	// Todos llevan anotación @ para que se puedan lanzar
	@Test
	void testAgregar() {
		//supongo que al agregar este contacto, dará verdadero
		assertTrue(service.agregar("c6@gmail.com", "c6", 30, 22222));
		
		//supongo que al agregar un contacto repetido dará Falso (no se agrega)
		assertFalse(service.agregar("c1@gmail.com", "c1", 30, 22222));
		
		//Compruebo que hay 6 contatos en la lista
		assertEquals(6, service.contactos().length);
		
		//fail("Not yet implemented");
		
	}

	@Test
	void testEliminar() {
		//esta suposición debería fallar, entonces ponemos assertFalse
		assertFalse(service.eliminar("dddd"));
		
		//Esta suposición debería ser verdadera
		assertTrue(service.eliminar("c3@gmail.com"));
		
		//fail("Not yet implemented");
	}

	@Test
	void testBuscar() {
		//Suponemos que al buscar el contacto con este email, su nombre será c4
		//comparamos el primer término string c4, con la cadena contenidad en el nombre del objeto, 
		//de hay que cojamos el getNombre()
		assertEquals("c4", service.buscar("c4@gmail.com").getNombre());
		//fail("Not yet implemented");
		
	}

	@Test
	void testContactos() {
		// suponemos que la lista de contactos es 5
		assertEquals(5, service.contactos().length);
		//fail("Not yet implemented");
	}

}
