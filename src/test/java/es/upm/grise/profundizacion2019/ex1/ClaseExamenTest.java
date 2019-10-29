package es.upm.grise.profundizacion2019.ex1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Fernando Alonso Pastor
 *
 */
public class ClaseExamenTest {
	
	private ClaseExamen cl;
	
	// Los nombres de los métodos, indican el camino, el último camino, no se puede probar
	
	
	@Before
	public void Initialize()
	{
		cl = new ClaseExamen();
	}

	@Test
	public void test_1_2_3_5() {
		assertEquals(cl.metodoAProbar(10, 10), 0, 0.001);
	}
	
	@Test
	public void test_1_1_2_3_5() {
		assertEquals(cl.metodoAProbar(11, 10), 0, 0.001);
	}
	
	@Test
	public void test_1_2_4_5() {
		// No se puede probar esta rama, no es posible acceder a ella, ya que:
		// a siempre será menor o igual que b al llegar a esa parte
	}
	
}
