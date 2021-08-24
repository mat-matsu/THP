package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int aux;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el primer número entero: ");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el segundo número entero, debe ser menor a " + num1 + ": ");
		num2 = Integer.parseInt(input.nextLine());
		
		input.close();
		/////////////////////////////////////////////////
		System.out.println("Secuencia de números incluyendo al " + num1 + " y " + num2);
		aux = num1;
		
		while (aux <= num2) {
			System.out.println(aux);
			aux++;
		}
		/////////////////////////////////////////////////
		System.out.println("Secuencia de números excluyendo al " + num1 + " y " + num2);
		aux = num1+1;
		
		while (aux < num2) {
			System.out.println(aux);
			aux++;
		}
	}

}
