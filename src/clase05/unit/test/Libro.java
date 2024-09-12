package clase05.unit.test;

public class Libro {
	
    private String titulo;
    private String autor;
    private String ISBN;
    private int paginas;
    private String editorial;
    private int anioPublicacion;
    private String idioma;
    private String genero;
    private double precio;
    private boolean disponible;

    public Libro(String titulo, String autor, String ISBN, int paginas, String editorial, 
                 int anioPublicacion, String idioma, String genero, double precio, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.idioma = idioma;
        this.genero = genero;
        this.precio = precio;
        this.disponible = disponible;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String mostrarInformacion() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nISBN: " + ISBN + 
               "\nPáginas: " + paginas + "\nEditorial: " + editorial + 
               "\nAño de Publicación: " + anioPublicacion + "\nIdioma: " + idioma + 
               "\nGénero: " + genero + "\nPrecio: $" + precio;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            this.precio -= this.precio * (porcentaje / 100);
        } else {
            System.out.println("Porcentaje de descuento inválido.");
        }
    }

    public void cambiarDisponibilidad() {
        this.disponible = !this.disponible;
    }

    public void aumentarPrecio(double cantidad) {
        if (cantidad > 0) {
            this.precio += cantidad;
        }
    }

    public boolean esIgual(Libro otroLibro) {
        return this.ISBN.equals(otroLibro.getISBN());
    }

    public void actualizarEdicion(String nuevaEditorial, int nuevoAnio) {
        this.editorial = nuevaEditorial;
        this.anioPublicacion = nuevoAnio;
    }

    public String obtenerResumen() {
        return "Título: " + titulo + " - Autor: " + autor + " - ISBN: " + ISBN;
    }
    
    public boolean esPrimeraEdicion(int anioActual) {
        return this.anioPublicacion == anioActual;
    }

    public String compararPrecio(Libro otroLibro) {
    	
        if (this.precio > otroLibro.getPrecio()) {
            return this.titulo + " es más caro que " + otroLibro.getTitulo();
        } else if (this.precio < otroLibro.getPrecio()) {
            return otroLibro.getTitulo() + " es más caro que " + this.titulo;
        } else {
            return "Ambos libros tienen el mismo precio.";
        }
    }
    
    public void aplicarImpuesto(double porcentajeImpuesto) {
        if (porcentajeImpuesto < 0) {
            throw new IllegalArgumentException("El impuesto no puede ser negativo.");
        }
        this.precio += this.precio * (porcentajeImpuesto / 100);
    }


}
