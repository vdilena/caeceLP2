package clase05.runtime.exceptions;

import java.util.ArrayList;

public class TestIndexOutOfBoundsException {

	public static void main(String[] args) {
		try {
			ArrayList<Integer> numeros = new ArrayList<>();
			numeros.add(1);
			numeros.add(2);
			numeros.add(8);
			int numero = numeros.get(3); // Esto lanza ArrayIndexOutOfBoundsException
			System.out.println("El número es: " + numero);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error: Índice de arreglo fuera de límites.");
		}
	}
}
