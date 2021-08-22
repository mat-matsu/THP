package thp.tp1.actividad2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		int inscriptos;
		int asientos;
		int asientosFaltantes;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Ingrese la cantidad de inscriptos: ");
		inscriptos = input.nextInt();
		
		System.out.println("Ingrese la cantidad de asientos: ");
		asientos = input.nextInt();
		
		input.close();
		
		/////////////////////////////////////////////////
		if ( inscriptos > asientos ) {
			asientosFaltantes = inscriptos - asientos;
			System.out.println("Hacen falta " + asientosFaltantes + " asientos.");
		} else {
			System.out.println("Alcanzan los asientos.");
		}

	}

}
