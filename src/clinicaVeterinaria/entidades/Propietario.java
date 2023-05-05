package clinicaVeterinaria.entidades;

public class Propietario {

	private int codigoIdentificador;

	private String nombre;

	private String apellidos;

	private boolean esVeterinario = false;

	// getters y setters
	public int getCodigoIdentificador() {
		return codigoIdentificador;
	}

	public void setCodigoIdentificador(int codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public boolean getEsVeterinario() {
		return esVeterinario;
	}

	public void setEsVeterinario(boolean esVeterinario) {
		this.esVeterinario = esVeterinario;
	}

	public Propietario(int codigoIdentificador, String nombre, String apellidos, boolean esVeterinario) {
		super();
		this.codigoIdentificador = codigoIdentificador;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.esVeterinario = esVeterinario;
	}

	public Propietario() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", apellidos="+ apellidos;
	}

	public String toStringPropie() {
		// TODO Auto-generated method stub
		return null;
	}

	public String toStringVete() {
		// TODO Auto-generated method stub
		return null;
	}

}
