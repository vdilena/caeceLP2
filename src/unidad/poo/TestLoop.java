package unidad.poo;

import java.util.Scanner;

public class TestLoop {

	public static void main(String[] args) {
		
		/**
		 * Numeros hasta numero solicitado
		 */
		
		// Creacion de objeto scanner
		Scanner scanner = new Scanner(System.in);
		
		// Texto a mostrar antes de solicitar numero entero
		System.out.println("Ingresar un numero entero que sera el tope del loop");
		
		// Tomo el dato del numero entero y se lo asigno a la variable numero
		int tope = scanner.nextInt();
		
		// Muestro los numeros hasta el numero tope con un loop for
		for (int i = 1; i <= tope; i++) {
			System.out.println(i);
		}
		
		/**
		 * Pido numeros hasta que ingrese un numero mayor a 5
		 */
		
		System.out.println("Ingrese un numero mayor a 5");
		int numeroSolicitado = scanner.nextInt();
		
		while(numeroSolicitado <= 5) {
			
			System.out.println("Debe ingresar un numero mayor a 5");
			numeroSolicitado = scanner.nextInt();
		}
		
		System.out.println("Numero mayor a 5 ingresado:" + numeroSolicitado);
		

	}

}
