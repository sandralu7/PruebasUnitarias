package co.com.pruebasunitarias;

public class StringReverse {
	
	public static String reverseWord(String str) {
		//split divide la palabra por espacios
		String palabras[] = str.split("\\s");
		String resultado = "";
		for (String palabra : palabras) {
			StringBuilder sb = new StringBuilder(palabra);
			sb.reverse();
			resultado += sb.toString() + " ";
		}
		// Trim quita los espacios del final de un String. String a = " Hola mundo ";		
		return resultado.trim();
		
	}

}
