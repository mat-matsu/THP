package thp.tp1.actividad1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		double montoVentas;
		double sueldo;
		final double COMISION = 0.16;
		final double SUELDO_FIJO = 44000;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Ingrese el monto de ventas realizadas: ");
		montoVentas = input.nextDouble();
		
		input.close();
		
		/////////////////////////////////////////////////
		sueldo = SUELDO_FIJO + (montoVentas * COMISION);
		/////////////////////////////////////////////////
		System.out.println("Su sueldo de este mes es de: $" + sueldo);

	}

}
