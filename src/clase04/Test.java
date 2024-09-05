package clase04;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
		//System.out.println("Categoria Bebidas " + CategoriaEnum.BEBIDAS.getNum()); 
		
		Map<Integer, String> categorias = new HashMap<Integer, String>();
		categorias.put(1, "BEBIDAS");
		categorias.put(2, "LACTEOS");
		
		System.out.println("Categoria 2: " + categorias.get(2));
		
		
		/*// Cargo lista de productos
		ArrayList<Producto> productos = new ArrayList<>();
		
		producto.add(
			new ProductoBebida("Fernet 1882", 300, 3500, 800, false, false, 
			new Subcategoria("Fernet y aperitivos", 2, new Categoria("Bebidas", 3)))
			);
		
		// Recorro una lista
		for (int i = 0; i < productos.length; i++) {
			
			Producto producto = productos[i];
			System.out.println("Producto:" + producto);
			
		}*/
	}
	
	/**
     * Busca producto por nombre, categoria o subcategoria
     */
    /*public Producto obtenerProducto(String productoABuscar) {

    	for (Producto producto : Productos) {
			
    		String nombreProducto = producto.getNombre();
    		String nombreCategoria = producto.getNombreCategoria();
    		String nombreSubcategoria = producto.getNombreSubcategoria();
    		
    		if(productoABuscar.equalsIgnoreCase(nombreProducto) 
    				|| productoABuscar.equalsIgnoreCase(nombreCategoria)
    				|| productoABuscar.equalsIgnoreCase(nombreSubcategoria)) {
    			return producto;
    			break;
    		}
		}
    	
    	return null;
    }*/

}
