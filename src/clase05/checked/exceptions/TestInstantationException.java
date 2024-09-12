package clase05.checked.exceptions;

abstract class Empleado {
	
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void trabajar(); 
}

class Gerente extends Empleado {
	
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override
    public void trabajar() {
        System.out.println("El gerente " + nombre + " está gestionando el departamento de " + departamento);
    }
}


public class TestInstantationException {

	public static void main(String[] args) {
		
		try {
            // Intentar crear una instancia de la clase abstracta Empleado
            Empleado empleado = Empleado.class.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Error: No se puede crear una instancia de una clase abstracta.");
        } catch (IllegalAccessException e) {
            System.out.println("Error: Acceso ilegal al intentar crear una instancia.");
        }

        // Creación de un objeto Gerente válido
        Gerente gerente = new Gerente("Juan", 50000, "Ventas");
        gerente.trabajar();

	}

}
