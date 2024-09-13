package clase05.runtime.exceptions;

public class TestClassCastException {

	public static void main(String[] args) {
		try {
			Object objeto = "Soy una cadena";
			chequeoPrevio();
			Integer numero = (Integer) objeto; // Esto lanza ClassCastException
			System.out.println("El número es: " + numero);
		} catch (ClassCastException e) {
			System.out.println("Error: Conversión de tipos inválida.");
		}
	}
	
	private static void chequeoPrevio() {
		
		System.out.println("Se hizo un chequeo previo!");
	}

}
