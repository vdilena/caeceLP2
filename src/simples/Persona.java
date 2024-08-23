package ejemplos.simples;

public class Persona {
	
	private String nombre;
	private Integer edad;
	private GeneroEnum genero;
	
	public Persona(String nombre, Integer edad, GeneroEnum genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	
	/**
	 * 
	 * @param datoEntrada
	 * @return
	 */
	public void mostrarDatos() {
		
		/* Estos son los datos de las personas
		esto es un comentario*/
		/*
		 * Este un comentario de bloque
		 */
		System.out.println("Nombre: " + nombre + ", edad:" + edad + ", Genero:" + genero);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: " + nombre + ", edad:" + edad + ", Genero:" + genero;
	}

}
