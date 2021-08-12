package co.com.pruebasunitarias;

public class Aritmetica {
	
	private float resultado;
	
	public float suma (float primerNumero, float segundoNumero) {
		return this.resultado = primerNumero + segundoNumero;
	}
	
	
	public float resta (float primerNumero, float segundoNumero) {
		this.resultado = primerNumero - segundoNumero;
		return resultado;
	}
	
	public float multiplicacion (float primerNumero, float segundoNumero) {
		return this.resultado = primerNumero * segundoNumero;
	}
	
	public float division (float primerNumero, float segundoNumero) {
		this.resultado = primerNumero/segundoNumero;
		return resultado;
	}
	

	public float getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
	
	

}
