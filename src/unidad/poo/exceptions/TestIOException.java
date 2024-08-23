package unidad.poo.exceptions;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + (disponible ? "Disponible" : "No disponible") + ")";
    }
}

class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void guardarLibrosEnArchivo(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Libro libro : libros) {
                writer.write(libro.getTitulo() + "," + libro.getAutor() + "," + libro.isDisponible());
                writer.newLine();
            }
            System.out.println("Libros guardados en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar los libros en el archivo: " + e.getMessage());
        }
    }

    public void cargarLibrosDesdeArchivo(String nombreArchivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                String titulo = partes[0];
                String autor = partes[1];
                boolean disponible = Boolean.parseBoolean(partes[2]);
                libros.add(new Libro(titulo, autor, disponible));
            }
            System.out.println("Libros cargados desde el archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al cargar los libros desde el archivo: " + e.getMessage());
        }
    }
}

public class TestIOException {

	public static void main(String[] args) {
		
		Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(new Libro("1984", "George Orwell", true));
        biblioteca.agregarLibro(new Libro("El Quijote", "Miguel de Cervantes", false));
        biblioteca.agregarLibro(new Libro("Cien Años de Soledad", "Gabriel García Márquez", true));

        biblioteca.mostrarLibros();

        // Guardar los libros en un archivo
        biblioteca.guardarLibrosEnArchivo("libros.txt");

        // Crear una nueva biblioteca y cargar los libros desde el archivo
        Biblioteca nuevaBiblioteca = new Biblioteca();
        nuevaBiblioteca.cargarLibrosDesdeArchivo("libros.txt");
        nuevaBiblioteca.mostrarLibros();

	}

}

