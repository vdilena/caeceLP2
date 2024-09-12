package clase05.runtime.exceptions;

public class TestStackOverflowException {

	public static void main(String[] args) {
		
		try {
			mostrarTexto();
		} catch (StackOverflowError e) {
			e.printStackTrace();
		}


	}
	
	public static void mostrarTexto() {
		
		System.out.println("Texto a mostrar");
		mostrarTexto();
	}

}
