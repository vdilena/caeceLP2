package clase05.unit.test;

public class Calculadora {

	public static double sumar(double a, double b) {
		return a + b;
	}

	public static double restar(double a, double b) {
		return a - b;
	}

	public static double multiplicar(double a, double b) {
		return a * b;
	}

	public static double dividir(double a, double b) {
		if (b == 0) {
			throw new IllegalArgumentException("No se puede dividir por cero");
		}
		return a / b;
	}

	public static double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}

	public static double raizCuadrada(double numero) {
		if (numero < 0) {
			throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
		}
		return Math.sqrt(numero);
	}

	public static double logaritmoNatural(double numero) {
		if (numero <= 0) {
			throw new IllegalArgumentException(
					"El logaritmo natural no está definido para números menores o iguales a cero");
		}
		return Math.log(numero);
	}

	public static double logaritmoBase10(double numero) {
		if (numero <= 0) {
			throw new IllegalArgumentException(
					"El logaritmo base 10 no está definido para números menores o iguales a cero");
		}
		return Math.log10(numero);
	}

	public static double seno(double angulo) {
		return Math.sin(angulo);
	}

	public static double coseno(double angulo) {
		return Math.cos(angulo);
	}

	public static double tangente(double angulo) {
		return Math.tan(angulo);
	}

	public static double arcoSeno(double valor) {
		if (valor < -1 || valor > 1) {
			throw new IllegalArgumentException("El arco seno solo está definido para valores entre -1 y 1");
		}
		return Math.asin(valor);
	}

	public static double arcoCoseno(double valor) {
		if (valor < -1 || valor > 1) {
			throw new IllegalArgumentException("El arco coseno solo está definido para valores entre -1 y 1");
		}
		return Math.acos(valor);
	}

	public static double arcoTangente(double valor) {
		return Math.atan(valor);
	}

	public static double valorAbsoluto(double numero) {
		return Math.abs(numero);
	}

	public static double numeroAleatorioEntreCeroYUno() {
		return Math.random();
	}

	public static double gradosARadianes(double grados) {
		return Math.toRadians(grados);
	}

	public static double radianesAGrados(double radianes) {
		return Math.toDegrees(radianes);
	}

	public static long factorial(int numero) {
		if (numero < 0) {
			throw new IllegalArgumentException("El factorial no está definido para números negativos");
		}
		if (numero == 0 || numero == 1) {
			return 1;
		} else {
			return numero * factorial(numero - 1);
		}
	}

	public static double redondear(double numero, int decimales) {
		double factor = Math.pow(10, decimales);
		return Math.round(numero * factor) / factor;
	}


	public static int maximoComunDivisor(int a, int b) {
		if (b == 0) {
			return a;
		}
		return maximoComunDivisor(b, a % b);
	}

	public static int minimoComunMultiplo(int a, int b) {
		return Math.abs(a * b) / maximoComunDivisor(a, b);
	}

}
