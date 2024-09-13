package clase05.user.defined.exceptions;

public class DniMalFormateadoException extends Exception {

	private static final long serialVersionUID = 5424629161310381454L;

	public DniMalFormateadoException(String mensaje) {
		super(mensaje);
	}
	
}
