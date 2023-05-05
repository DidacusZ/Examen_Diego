package clinicaVeterinaria.entidades;

public class Veterinario extends Propietario {

	private String numeroColegiado;

	private int numeroMascotas;

	public String getNumeroColegiado() {
		return numeroColegiado;
	}

	public void setNumeroColegiado(String numeroColegiado) {
		this.numeroColegiado = numeroColegiado;
	}

	public int getNumeroMascotas() {
		return numeroMascotas;
	}

	public void setNumeroMascotas(int numeroMascotas) {
		this.numeroMascotas = numeroMascotas;
	}

	public Veterinario(int codigoIdentificador, String nombre, String apellidos, boolean esVeterinario,
			String numeroColegiado, int numeroMascotas) {
		super(codigoIdentificador, nombre, apellidos, esVeterinario);
		this.numeroColegiado = numeroColegiado;
		this.numeroMascotas = numeroMascotas;
	}

	public Veterinario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Veterinario(int codigoIdentificador, String nombre, String apellidos, boolean esVeterinario) {
		super(codigoIdentificador, nombre, apellidos, esVeterinario);
		// TODO Auto-generated constructor stub
	}


	
	@Override
	public String toStringVete() {
		return "numeroColegiado=" + numeroColegiado ;
	}
	
	@Override
	public String toStringPropie() {
		return "numeroMascotas=" + numeroMascotas ;
	}
	

}
