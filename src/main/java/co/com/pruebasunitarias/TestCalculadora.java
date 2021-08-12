package co.com.pruebasunitarias;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class TestCalculadora {
	
	@Test
	public void testCuadradoPositivo() {
		Calculadora calc  = new Calculadora();
		assertEquals(25.0, calc.cuadrado(5.0), 0.00000001);
	}
	
	@Test
	public void testCuadradoCero() {
		Calculadora calc = new Calculadora();
		assertEquals(0.0, calc.cuadrado(0.0), 0.00000001);
		
	}
	
	@Test
	public void testCuadradoNegativo() {
		Calculadora calc = new Calculadora();
		assertEquals(16.0, calc.cuadrado(-4.0), 0.00000001);
	}
	
	@Test
	public void testCuboPositivo() {
		Calculadora calc = new Calculadora();
		assertEquals(125.0, calc.cubo(5.0), 0.00000001);
	}
	
	@Test
	public void testCuboNegativo () {
		Calculadora calc = new Calculadora();
		assertEquals(-64.0, calc.cubo(-4.0), 0.00000001);
	}

}
