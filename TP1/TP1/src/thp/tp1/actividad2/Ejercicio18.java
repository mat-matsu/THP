package thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int menor;
		int mayor;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero: ");
		num1 = input.nextInt();
		
		System.out.println("Ingrese el primer numero: ");
		num2 = input.nextInt();
		
		input.close();
		
		/////////////////////////////////////////////////
		if ( num1 > num2 ) {
			mayor = num1;
			menor = num2;
		} else {
			menor = num1;
			mayor = num2;
		}
		
		if ( (mayor % menor) == 0 ) {
			System.out.println("El numero " + mayor + " es divisible por " + menor);
		} else {
			System.out.println("El numero " + mayor + " no es divisible por " + menor);
		}

	}

}
