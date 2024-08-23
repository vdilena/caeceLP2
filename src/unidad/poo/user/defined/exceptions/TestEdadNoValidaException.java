package unidad.poo.user.defined.exceptions;

class EdadNoValidaException extends Exception {
    public EdadNoValidaException(String mensaje) {
        super(mensaje);
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) throws EdadNoValidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadNoValidaException("La edad " + edad + " no es válida.");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
}


public class TestEdadNoValidaException {
	public static void main(String[] args) {
        try {
            Persona persona = new Persona("Carlos", -5);
        } catch (EdadNoValidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
