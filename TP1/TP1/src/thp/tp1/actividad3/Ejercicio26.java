package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		int num;
		int res;
		final int MULT_3 = 3;
		final int MULT_5 = 5;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese un n�mero natural: ");
		num = Integer.parseInt(input.nextLine());
		
		input.close();
		/////////////////////////////////////////////////
		for (int i = 1; i <= num; i++) {
			res = MULT_3 * i;
			if (res%MULT_5 != 0) {
				System.out.println(res);
			}
		}
	}

}
