package clase05.runtime.exceptions;

public class TestNullPointerException {

	public static void main(String[] args) {
		try {
			String texto = null;
			int longitud = texto.length(); // Esto lanza NullPointerException
			System.out.println("La longitud del texto es: " + longitud);
		} catch (NullPointerException e) {
			System.out.println("Error: Intento de acceder a un objeto nulo.");
		}
	}
}
