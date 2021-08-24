package thp.tp1.actividad3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio36 {

	public static void main(String[] args) {
		double num;
		double prom;
		double suma = 0;
		int cont = 0;
		boolean flag = true;
		final int EXIT = 20;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		while(flag) {
			System.out.println("Ingrese un número: ");
			num = Double.parseDouble(input.nextLine());
			
			cont++;
			suma+= num;
			prom = suma / cont;
						
			if (prom >= EXIT) {
				flag = false;
			}
		}
		input.close();
		/////////////////////////////////////////////////
		System.out.println("La cantidad de valores ingresados es de: " + cont);

	}

}
