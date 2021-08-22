package thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int num1;
		int num2;
		double res;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero: ");
		num1 = input.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		num2 = input.nextInt();
		
		input.close();
		
		/////////////////////////////////////////////////
		res = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + res);
		/////////////////////////////////////////////////
		res = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + res);
		/////////////////////////////////////////////////
		res = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + res);
		/////////////////////////////////////////////////
		res = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + res);
		
		
	}

}
