package unidad.poo.propagated.exceptions;

public class TestPropagacionArithmeticException {

	public static int dividir(int numerador, int denominador) {
        return numerador / denominador; // Puede lanzar ArithmeticException
    }

    public static void calcular() {
        dividir(10, 0); // Llamada al método que puede lanzar la excepción
    }

    public static void main(String[] args) {
        try {
            calcular(); // Se propaga desde calcular() a main()
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero detectada.");
        }
    }
}
