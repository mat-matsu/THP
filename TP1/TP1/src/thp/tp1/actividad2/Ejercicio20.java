package thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		String operador;
		int num1;
		int num2;
		double res = 0;
		boolean flag = true;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero: ");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el segundo numero: ");
		num2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el operador: ");
		operador = input.nextLine();
		
		input.close();
		/////////////////////////////////////////////////
		switch(operador) {
			case "+":
				res = num1 + num2;
				break;
			case "-":
				res = num1 - num2;
				break;
			case "*":
				res = num1 * num2;
				break;
			case "/":
				if (num2 == 0) {
					flag = false;
				} else {
					res = (double)num1 / (double)num2;
				}
				break;
			default:
				flag = false;
				break;
		}
		
		if (flag) {
			System.out.println(num1 + " " + operador + " " + num2 + " = " + res);
		} else {
			System.out.println("ERROR");
		}

	}

}
