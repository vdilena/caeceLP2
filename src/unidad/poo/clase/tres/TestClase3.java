package unidad.poo.clase.tres;

import java.util.ArrayList;

public class TestClase3 {

	public static void main(String[] args) {
		
		// Generar la lista con 5 productos
		ArrayList<Producto> productos = new ArrayList<Producto>();
		
		// Voy a crear un televisor Samsung de 100000 pesos y 50 unidades
		Categoria categoria = new Categoria("TV001", "Televisores", "Una descripion");
		Producto producto = new Producto("TV Samsung",100000, 50, categoria);
		productos.add(producto);
		/*productos.add(null);
		productos.add(null);*/
		System.out.println("Posicion 1 del array:" + productos.get(1));
		for (int i = 0; i < productos.size(); i++) {
			
			Producto productoActualRecorrido = productos.get(i);
			System.out.println("Nombre:" + productoActualRecorrido.getNombre());
			
		}
		
	}

}
