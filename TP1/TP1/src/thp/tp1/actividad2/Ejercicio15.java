package thp.tp1.actividad2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		int edad;
		double alt;
		final int EDAD_MIN = 6;
		final double ALT_MIN = 1.50;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Ingrese su edad: ");
		edad = input.nextInt();
		
		System.out.println("Ingrese su altura: ");
		alt = input.nextDouble();
		
		input.close();
		
		/////////////////////////////////////////////////
		if ( edad > EDAD_MIN || alt > ALT_MIN ) {
			System.out.println("Puede entrar al juego.");
		} else {
			System.out.println("No puede entrar al juego.");
		}

	}

}
