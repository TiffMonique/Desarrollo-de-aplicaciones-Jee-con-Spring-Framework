package miProyectoMaven;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class TestCarpintero {
	
	
	@Test
	void test() {
		Carpintero carpintero = new Carpintero();
		carpintero.setNombre("Juan");
		carpintero.setHerramienta(new Serrucho());
		carpintero.getHerramienta().cortar();
		
		assertEquals("Juan", carpintero.getNombre());
		
	}

}
