package clase05.user.defined.exceptions;

public class PersonaClaseCinco {
	
	private String nombre;
	private String apellido;
	private Integer dni;
	private String email;
	private String telefono;
	private DomicilioClaseCinco domicilio;
	
	public PersonaClaseCinco(String nombre, String apellido
			, Integer dni, String email, String telefono, DomicilioClaseCinco domicilio) throws DniMalFormateadoException {

		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.validarDni();
		this.email = email;
		this.telefono = telefono;
		this.domicilio = domicilio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void setCalle(String nombreCalle) {
		this.domicilio.setCalle(nombreCalle);
	}
	
	public void setNumero(Integer numeroCalle) {
		this.domicilio.setNumero(numeroCalle);
	}
	
	public void setLocalidad(String localidad) {
		this.domicilio.setLocalidad(localidad);
	}

	public void mostrarDomicilioCompleto () throws NullPointerException {
		
		System.out.println("Calle:" + domicilio.getCalle());
		System.out.println("Numero:" + domicilio.getNumero());
		System.out.println("Localidad:" + domicilio.getLocalidad());
	}
	
	private void validarDni() throws DniMalFormateadoException {
		
		if(dni < 0 || dni > 100000000) {
			throw new DniMalFormateadoException("Faltan datos para completar el DNI");
		} 
	}
	

}
