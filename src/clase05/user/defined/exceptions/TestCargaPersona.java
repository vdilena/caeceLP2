package clase05.user.defined.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestCargaPersona {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// Quiero cargar una persona con los siguientes datos: nombre, apellido, dni, email, telefono
		
		// Pido el nombre no vacio
		System.out.println("Ingrese nombre");
		String nombre = scanner.nextLine();
		
		// Pido el apellido no vacio
		System.out.println("Ingrese apellido");
		String apellido = scanner.nextLine();
		
		// Pido DNI con formato numerico, ser mayor a cero y menor a 100 millones
		System.out.println("Ingrese dni");
		Integer dni = null;
		try {
			dni = scanner.nextInt();			
		} catch (InputMismatchException e) {
			// TODO: handle exception
		}
		
		// Pido email contenga arroba y .com
		System.out.println("Ingrese email");
		String email = scanner.nextLine();
		
		// Pido telefono no vacio y con formato 011- 41234567
		System.out.println("Ingrese telefono");
		String telefono = scanner.nextLine();
		
		// Pido calle domicilio no vacio
		System.out.println("Ingrese Calle domicilio");
		String calle = scanner.nextLine();
		
		// Pido numero domicilio en formato numerico
		System.out.println("Ingrese Numero domicilio");
		Integer numero = scanner.nextInt();
		
		// Pido localidad no vacio
		System.out.println("Ingrese Localidad domicilio");
		String localidad = scanner.nextLine();
		
		PersonaClaseCinco persona = null;
		try {
			persona = new PersonaClaseCinco(nombre, apellido, dni, email, telefono, new DomicilioClaseCinco(calle, numero, localidad));
		} catch (DniMalFormateadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//persona.setCalle(calle);
		//persona.setNumero(numero);
		//persona.setLocalidad(localidad);
		
		try {
			persona.mostrarDomicilioCompleto();
		} catch (NullPointerException e) {
			System.out.println("Algunos de los datos del domicilio es nulo");
		}
	}

}
