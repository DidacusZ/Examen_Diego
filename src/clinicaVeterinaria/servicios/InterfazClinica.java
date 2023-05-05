package clinicaVeterinaria.servicios;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import clinicaVeterinaria.entidades.Veterinario;

public interface InterfazClinica {

	/**
	 * crea un nuevo usuario (Vetrinario/Propietario) y lo escribe en el fichero
	 * @param baseDatos
	 * @param verdad
	 * @param archivo
	 * @return
	 */
	public List<Veterinario> NuevoUsuario(List<Veterinario> baseDatos, boolean verdad, File archivo);


}
