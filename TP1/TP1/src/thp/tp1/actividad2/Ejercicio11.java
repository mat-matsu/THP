package thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		int num;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		num = input.nextInt();
		
		input.close();
		
		/////////////////////////////////////////////////
		if ( (num % 2) == 0) {
			System.out.println("El numero " + num + " es par.");
		} else {
			System.out.println("El numero " + num + " es impar.");
		}
		
	}
}
