package clase05.unit.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


//https://junit.org/junit5/docs/current/user-guide/

// assertEquals, assertFalse, assertTrue
public class CalculadoraCientificaTest {
	
	private Calculadora calculadora;
	
	// Pruebas para sumar
    @Test
    public void testSumar() {
        assertEquals(5.0, calculadora.sumar(2.0, 3.0), 0.0001);
    }

    // Pruebas para restar
    @Test
    public void testRestar() {
        assertEquals(2.0, calculadora.restar(5.0, 3.0), 0.0001);
    }

    // Pruebas para multiplicar
    @Test
    public void testMultiplicar() {
        assertEquals(15.0, calculadora.multiplicar(5.0, 3.0), 0.0001);
    }

    // Pruebas para dividir
    @Test
    public void testDividir() {
        assertEquals(2.0, calculadora.dividir(6.0, 3.0), 0.0001);
    }

    @Test
    public void testDividirPorCero() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(5.0, 0));
    }

    // Pruebas para potencia
    @Test
    public void testPotencia() {
        assertEquals(8.0, calculadora.potencia(2.0, 3.0), 0.0001);
    }

    // Pruebas para raíz cuadrada
    @Test
    public void testRaizCuadrada() {
        assertEquals(3.0, calculadora.raizCuadrada(9.0), 0.0001);
    }

    @Test
    public void testRaizCuadradaNegativa() {
        assertThrows(ArithmeticException.class, () -> calculadora.raizCuadrada(-4.0));
    }

    // Pruebas para seno
    @Test
    public void testSeno() {
        assertEquals(1.0, calculadora.seno(90.0), 0.0001);
    }

    // Pruebas para coseno
    @Test
    public void testCoseno() {
        assertEquals(0.0, calculadora.coseno(90.0), 0.0001);
    }

    // Pruebas para tangente
    @Test
    public void testTangente() {
        assertEquals(1.0, calculadora.tangente(45.0), 0.0001);
    }

    // Pruebas para logaritmo natural
    @Test
    public void testLogaritmoNatural() {
        assertEquals(0.0, calculadora.logaritmoNatural(1.0), 0.0001);
    }

    @Test
    public void testLogaritmoNaturalInvalido() {
        assertThrows(ArithmeticException.class, () -> calculadora.logaritmoNatural(-1.0));
    }

    // Pruebas para factorial
    @Test
    public void testFactorial() {
        assertEquals(120, calculadora.factorial(5));
    }

    @Test
    public void testFactorialCero() {
        assertEquals(1, calculadora.factorial(0));
    }

    @Test
    public void testFactorialNegativo() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.factorial(-5));
    }

}
