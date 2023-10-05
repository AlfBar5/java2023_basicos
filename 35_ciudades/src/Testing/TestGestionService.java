package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import service.GestionService;



class TestGestionService {
	
	
	static GestionService service = new GestionService();
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		service.guardarCiudad("Madrid", "España", 3500000);
		service.guardarCiudad("Sevilla", "España", 1500000);
		service.guardarCiudad("Paris", "Francia", 700000);
	}

	@Test
	void testGuardarCiudad() {
		
	}

	@Test
	void testCiudadesPorPais() {
		fail("Not yet implemented");
	}

	@Test
	void testCiudadMasPoblada() {
		assertEquals("Paris", service.ciudadMasPoblada().getNombre());
		
	}

	@Test
	void testEliminarCiudad() {
		fail("Not yet implemented");
	}

}
