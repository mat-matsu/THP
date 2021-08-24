package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		int nota;
		boolean flag = true;
		final int NOTA_USAR = 2;
		final int NOTA_MAX = 10;
		final int NOTA_NO_USAR = 3;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese la nota: ");
			nota = Integer.parseInt(input.nextLine());
			
			if (nota == NOTA_USAR || (nota > NOTA_NO_USAR && nota <= NOTA_MAX)) {
				flag = false;
			}
		} while (flag);
		
		input.close();

	}

}
