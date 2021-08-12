package co.com.pruebasunitarias;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringReverseTest {
	
	@Test
	public void testStringReverse() {
		assertEquals("aloH odnuM", StringReverse.reverseWord("Hola Mundo"));
	}

}
