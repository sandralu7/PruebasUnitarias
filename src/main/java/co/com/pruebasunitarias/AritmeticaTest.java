package co.com.pruebasunitarias;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.*;

public class AritmeticaTest {
	
//	fail se usa para hacer fallar la prueba. Por ejemplo en el caso que no la tengamos implementada aún
//	@Test
//	public void testSuma () {
//		fail ("No se ha implementado");
//	}
	
	private Aritmetica aritmetica;
	
	
	//Crear una instancia de la clase cada vez que se ejeucta un metodo test
	@Before
	public void init() {
		aritmetica = new Aritmetica();
	}
	
	
	@Test
	public void testSuma () {
		//Aritmetica aritmetica = new Aritmetica();
		assertEquals(2, aritmetica.suma(1, 1), 0.0000001);
	}
	
	@Test
	public void testResta () {
		//Aritmetica aritmetica = new Aritmetica();
		assertEquals(3, aritmetica.resta(4, 1), 0.0000001);
	}
	
	@Test
	public void testMultiplicacion() {
		//Aritmetica aritmetica = new Aritmetica();
		assertEquals(6, aritmetica.multiplicacion(2, 3), 0.0000001);
	}
	
	@Test
	public void testDivision () {
		//Aritmetica  aritmetica = new Aritmetica();
		assertEquals(5, aritmetica.division(10, 2),  0.0000001);
	}
	
	//finalizar las variables al terminar de ejecutar los test
	@After
	public void finish() {
		aritmetica = null;
	}
}
