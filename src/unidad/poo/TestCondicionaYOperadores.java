package unidad.poo;

import java.util.Scanner;

public class TestCondicionaYOperadores {

	public static void main(String[] args) {
		
		/**
		 * El numero es par o impar?
		 */

		// Creacion de objeto scanner
		Scanner scanner = new Scanner(System.in);
		
		// Texto a mostrar antes de solicitar numero entero
		System.out.println("Ingresar un numero entero");
		
		// Tomo el dato del numero entero y se lo asigno a la variable numero
		int numero = scanner.nextInt();
		
		// Valido con un if/else y operadores de comparacion el numero es par o impar
		if(numero % 2 == 0) {
			System.out.println("Es un numero par");
		} else {
			System.out.println("Es un numero impar");
		}
		
		/**
		 * El numero es multiplo de 2 y 5?
		 */
		
		// Valido con un if/else con operadores de comparacion y logicos si el numero es multiplo de 2 y de 5
		if(numero % 2 == 0 && numero % 5 == 0) {
			System.out.println("El numero es multiplo de 2 y de 5");
		} else {
			System.out.println("El numero NO es multiplo de 2 y de 5");
		}
		
		/**
		 * Es menor a 10 o mayor a 20?
		 */
		
		// Valido con un if/else con operadores de comparacion y logicos si el numero es multiplo de 2 y de 5
		if(numero < 10 || numero > 20) {
			System.out.println("El numero es menor a 10 o mayor a 20");
		} else {
			System.out.println("El numero NO es menor a 10 o mayor a 20");
		}
	}

}
