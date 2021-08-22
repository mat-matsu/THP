package thp.tp1.actividad1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		double ang1;
		double ang2;
		double res;
		final double ANG_TRIANG = 180;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Ingrese el primer angulo: ");
		ang1 = input.nextDouble();
		
		System.out.println("Ingrese el segundo angulo: ");
		ang2 = input.nextDouble();
		
		input.close();
		
		/////////////////////////////////////////////////
		res = ANG_TRIANG - ang1 - ang2;
		System.out.println("El angulo restante vale: " + res);
		
	}

}
