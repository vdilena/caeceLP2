package unidad.poo.exceptions;

public class TestArithmeticException {

	public static void main(String[] args) {
		try {
			int numerador = 10;
			int denominador = 0;
			int resultado = numerador / denominador; // Esto lanza ArithmeticException
			System.out.println("El resultado es: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Error: División por cero no permitida.");
		}
	}

}
