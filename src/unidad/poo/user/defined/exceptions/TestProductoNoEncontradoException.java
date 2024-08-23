package unidad.poo.user.defined.exceptions;

class ProductoNoEncontradoException extends Exception {
    public ProductoNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}

class Inventario {
    private String[] productos = {"Manzanas", "Naranjas", "Peras"};

    public void buscarProducto(String producto) throws ProductoNoEncontradoException {
        boolean encontrado = false;
        for (String p : productos) {
            if (p.equalsIgnoreCase(producto)) {
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            throw new ProductoNoEncontradoException("Producto no encontrado: " + producto);
        } else {
            System.out.println("Producto encontrado: " + producto);
        }
    }
}

public class TestProductoNoEncontradoException {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        try {
            inventario.buscarProducto("Bananas");
        } catch (ProductoNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
