package clinicaVeterinaria.servicios;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import clinicaVeterinaria.entidades.Veterinario;

public class ImplClinica implements InterfazClinica {

	public List<Veterinario> NuevoUsuario(List<Veterinario> baseDatos, boolean verdad, File archivo) {

		// declaraciones
		Veterinario objetoVP = new Veterinario();

		Scanner sc = new Scanner(System.in);
		String nombre;
		String apellidos;
		int id = calculoId(baseDatos);

		// pedir datos
		System.out.print("Introduce el nombre: ");
		nombre = sc.next();
		System.out.print("Introduce los apellidos: ");
		apellidos = sc.next();

		// guardar datos

		objetoVP.setCodigoIdentificador(id);
		objetoVP.setNombre(nombre);
		objetoVP.setApellidos(apellidos);
		objetoVP.setEsVeterinario(verdad);

		// propietario
		if (verdad) {

			String numCol;

			System.out.print("Introduce el numero de colegiado: ");
			numCol = sc.next();

			objetoVP.setNumeroColegiado(numCol);

		} else {

			int numMasc;

			System.out.print("Introduce el numero de mascotas: ");
			numMasc = sc.nextInt();

			objetoVP.setNumeroMascotas(numMasc);

		}

		// guadar datos en el fichero

		FileWriter fichero = null;

		try {

			fichero = new FileWriter(archivo, true);//ruta

		} catch (Exception e) {

			e.printStackTrace();
		}

		try {
			PrintWriter escribir = new PrintWriter(fichero, true);//para escribir en fichero
			
			if(baseDatos.size()==0)
			escribir.println("nombre;apellidos;tipo usuario;numero Mascota/Colegiado");		
			
			
			escribir.print(objetoVP.getNombre() + ";");
			escribir.print(objetoVP.getApellidos() + ";");
			
			if(objetoVP.getEsVeterinario())
				escribir.print("Veterinario ;");
			else
				escribir.print("Propietario ;");
			
			
			if(verdad)
			escribir.println(objetoVP.getNumeroColegiado() + ";");
			else
			escribir.println(objetoVP.getNumeroMascotas() + ";");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (null != fichero)
					fichero.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		// guardar objeto en BBDD
		baseDatos.add(objetoVP);

		return baseDatos;

	}

	/**
	 * genera un id dependiendo del anterior (cada id es unico)
	 * 
	 * @param baseDatos
	 * @return
	 */
	private int calculoId(List<Veterinario> baseDatos) {// private cuando solo se us en esa clase
		int auxiliar = 0;

		for (int i = 0; i < baseDatos.size(); i++) {
			int j = baseDatos.get(i).getCodigoIdentificador();
			if (auxiliar < j) {
				auxiliar = j;
			}
		}
		return auxiliar + 1;
	}


}
