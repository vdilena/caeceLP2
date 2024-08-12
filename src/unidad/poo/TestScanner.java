package unidad.poo;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		
		// Creacion de objeto scanner
		Scanner scanner = new Scanner(System.in);

		// Texto a mostrar antes de solicitar los datos de nombre y apellido
	    System.out.println("Ingresar nombre y apellido:");

	    // Tomo los datos de nombre y apellido
	    String nombreYApellido = scanner.nextLine();
	    
	    // Texto a mostrar antes de solicitar los datos de DNI
	    System.out.println("Ingrese DNI:");

	    // Tomo los datos del dni
	    int dni = scanner.nextInt();

	    // Muestro los datos ingresados
	    System.out.println("Nombre y apellido: " + nombreYApellido);
	    System.out.println("DNI: " + dni);

	}

}
