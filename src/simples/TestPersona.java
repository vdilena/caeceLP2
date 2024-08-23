package simples;

public class TestPersona {

	public static void main(String[] args) {

		// Generamos una instancia de Persona
		String nombre = "Carolina";
		Persona carolina = new Persona(nombre = "Carolina", 27, GeneroEnum.FEM);
		//carolina.mostrarDatos();
		
		System.out.println("Datos:" + carolina);
	}

}
