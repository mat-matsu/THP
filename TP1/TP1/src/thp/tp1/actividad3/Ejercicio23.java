package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		int num;
		int res;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese un número entero: ");
		num = Integer.parseInt(input.nextLine());
		
		input.close();
		/////////////////////////////////////////////////
		for (int i = 0; i < 11; i++) {
			res = num * i;
			System.out.println(num + " * " + i + " = " + res);
		}

	}

}
