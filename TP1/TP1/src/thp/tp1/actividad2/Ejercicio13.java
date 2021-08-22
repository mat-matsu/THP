package thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese un primer numero: ");
		num1 = input.nextInt();
		
		System.out.println("Ingrese un segundo numero: ");
		num2 = input.nextInt();
		
		System.out.println("Ingrese un tercer numero: ");
		num3 = input.nextInt();
		
		input.close();
		
		/////////////////////////////////////////////////
		if ( num1 > num2 && num1 > num3 ) {
			System.out.println("El numero " + num1 + " es el mayor.");
		} else if ( num2 > num3 ) {
			System.out.println("El numero " + num2 + " es el mayor.");
		} else {
			System.out.println("El numero " + num3 + " es el mayor.");
		}

	}

}
