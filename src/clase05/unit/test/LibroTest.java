package clase05.unit.test;

public class LibroTest {

	private Libro libro;

	@BeforeEach
	public void setUp() {
		// Inicializamos el libro con valores de prueba
		libro = new Libro("El Principito", "Antoine de Saint-Exupéry", "978-3-16-148410-0", 96, "Reynal & Hitchcock",
				1943, "Español", "Ficción", 9.99, true);
	}
	
	@Test
    public void testCalcularTiempoLecturaInvalido() {
        assertThrows(IllegalArgumentException.class, () -> libro.calcularTiempoLectura(0));
    }

}
