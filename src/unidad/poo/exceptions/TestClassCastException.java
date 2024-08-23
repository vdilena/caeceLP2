package unidad.poo.exceptions;

public class TestClassCastException {

	public static void main(String[] args) {
		try {
			Object objeto = "Soy una cadena";
			Integer numero = (Integer) objeto; // Esto lanza ClassCastException
			System.out.println("El número es: " + numero);
		} catch (ClassCastException e) {
			System.out.println("Error: Conversión de tipos inválida.");
		}
	}

}
