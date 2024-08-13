package unidad.poo.exceptions;

import java.util.ArrayList;

class Estudiante {
	
    private String nombre;
    private String matricula;
    private double promedio;

    public Estudiante(String nombre, String matricula, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getPromedio() {
        return promedio;
    }
}

class RegistroEstudiantes {
	
    private ArrayList<Estudiante> estudiantes;

    public RegistroEstudiantes() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public double calcularPromedioGeneral() {
    	
        double suma = 0;
        for (Estudiante e : estudiantes) {
            suma += e.getPromedio();
        }
        return estudiantes.size() > 0 ? suma / estudiantes.size() : 0;
    }

    public void cargarClaseDinamica(String className) {
    	
        try {
            // Intentar cargar una clase que puede no existir en el sistema
            Class<?> clase = Class.forName(className);
            System.out.println("Clase " + clase.getName() + " cargada exitosamente.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: La clase " + className + " no se pudo encontrar.");
        }
    }
}

public class TestClassNotFoundException {

	public static void main(String[] args) {
        RegistroEstudiantes registro = new RegistroEstudiantes();

        registro.agregarEstudiante(new Estudiante("Ana", "12345", 85.5));
        registro.agregarEstudiante(new Estudiante("Luis", "67890", 90.0));
        registro.agregarEstudiante(new Estudiante("Maria", "54321", 78.3));

        System.out.println("Promedio General: " + registro.calcularPromedioGeneral());

        // Intentar cargar una clase que existe
        registro.cargarClaseDinamica("java.util.ArrayList");

        // Intentar cargar una clase que no existe
        registro.cargarClaseDinamica("com.ejemplo.ClaseInexistente");
    }
}
