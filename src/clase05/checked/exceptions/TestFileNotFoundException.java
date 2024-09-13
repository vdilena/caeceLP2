package clase05.checked.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestFileNotFoundException {

	public static void main(String[] args) {

		try {
			
			FileInputStream archivo = new FileInputStream("archivo.txt");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("El programa continuo!");

	}

}
