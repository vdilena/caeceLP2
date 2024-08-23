package unidad.poo.propagated.exceptions;

import java.io.*;

public class TestPropagacionIOException {

    public static void leerArchivo(String nombreArchivo) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo));
        String linea;
        while ((linea = reader.readLine()) != null) {
            System.out.println(linea);
        }
        reader.close();
    }

    public static void main(String[] args) {
        try {
            leerArchivo("archivo.txt");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
