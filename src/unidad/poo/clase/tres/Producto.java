package unidad.poo.clase.tres;

public class Producto {
	
	private String nombre;
	
	private float precio;
	
	private int cantidad;
	
	private Categoria categoria;

	public Producto(String nombre, float precio, int cantidad, Categoria categoria) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
