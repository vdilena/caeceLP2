package unidad.poo.user.defined.exceptions;

class DivisionPorCeroException extends Exception {
    public DivisionPorCeroException(String mensaje) {
        super(mensaje);
    }
}

class Calculadora {
    public double dividir(double numerador, double denominador) throws DivisionPorCeroException {
        if (denominador == 0) {
            throw new DivisionPorCeroException("No se puede dividir por cero.");
        }
        return numerador / denominador;
    }
}

public class TestDivisionPorCeroException {
	public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        try {
            double resultado = calculadora.dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (DivisionPorCeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
