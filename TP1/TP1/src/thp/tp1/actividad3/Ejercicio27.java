package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		int num;
		int cont = 0;
		int suma = 0;
		double prom;
		final int CONT_TOTAL = 5;
		final int EDAD_MAY = 18;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < CONT_TOTAL; i++) {
			System.out.println("Ingrese la " + (i+1) + "º edad: ");
			num = Integer.parseInt(input.nextLine());
			
			if ((num%2 != 0) && num > EDAD_MAY) {
				cont++;
			}
			suma += num;
		}
		input.close();
		/////////////////////////////////////////////////
		prom = (double)suma / (double)CONT_TOTAL;
		/////////////////////////////////////////////////
		System.out.println("La edad promedio es de: " + prom);
		System.out.println("La cantidad de edad mayores a 18 e impares son: " + cont);

	}

}
