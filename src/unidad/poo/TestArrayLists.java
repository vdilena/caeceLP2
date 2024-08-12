package unidad.poo;

import java.util.ArrayList;

public class TestArrayLists {

	public static void main(String[] args) {
		
		// Creo una instancia de una lista con 6 paises
		ArrayList <String> paises = new ArrayList<String>();
		
		//Agrego 6 paises
		paises.add("Argentina");
		paises.add("Francia");
		paises.add("Brasil");
		paises.add("Peru");
		paises.add("Suiza");
		paises.add("Italia");
		
		// Recororro la lista
		for (String pais : paises) {
			System.out.println(pais);
		}
		
		// Accedo a una posicion en especifico de la lista
		System.out.println("Cuarto pais: " + paises.get(3));
		
		// Borro un elemento de la lista
		paises.remove(5);
		
		// Recororro la lista con un elemento menos
		for (String pais : paises) {
			System.out.println(pais);
		}
	}

}
