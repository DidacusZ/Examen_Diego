package clinicaVeterinaria.controladores;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import clinicaVeterinaria.entidades.Propietario;
import clinicaVeterinaria.entidades.Veterinario;
import clinicaVeterinaria.servicios.ImplClinica;
import clinicaVeterinaria.servicios.ImplMenu;
import clinicaVeterinaria.servicios.InterfazClinica;
import clinicaVeterinaria.servicios.InterfazMenu;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Propietario propietario = new Propietario(); Veterinario veterinario = new
		 * Veterinario();
		 * 
		 * veterinario.setEsVeterinario(true); propietario.setEsVeterinario(false);
		 */

		InterfazMenu menu = new ImplMenu();
		InterfazClinica clinica = new ImplClinica();

		// base de datos
		List<Veterinario> BD = new ArrayList();

		// escaner
		Scanner sc = new Scanner(System.in);

		// ficheros
		File fichero = new File("ficheroClinica.txt");// direccion
		// FileWriter fw = new FileWriter("logGasolinera.txt");// direccion

		// declaracion variables
		int num;
		boolean verdad = true;

		try {

			do {

				menu.MostrarMenu();
				num = sc.nextInt();

				switch (num) {

				case 1:
					clinica.NuevoUsuario(BD, true, fichero);
					break;

				case 2:
					clinica.NuevoUsuario(BD, false, fichero);
					break;

				case 0:
					verdad = false;
					break;
				}

			} while (verdad);

		} catch (InputMismatchException e) {
			System.out.println("Se produjo un error de formato: " + e.getMessage());

		} catch (Exception e) {
			System.out.println("Se produjo un error: " + e.getMessage());
		}

		System.out.println("Adios y gracias por usar mi aplicación");

	}

}
