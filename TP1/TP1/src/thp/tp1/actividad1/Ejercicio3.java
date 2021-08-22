package thp.tp1.actividad1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
	// VALOR CONSTANTE PARA LA MULTIPLICACION Y DIVISION
	public static final int VAL_MULT = 5;
	public static final int VAL_DIV = 2;
	// STRING CONSTANTES PARA MSJ AL USUARIO
	public static final String MSJ_SOLICITAR_VAL = "Por favor, ingrese un número entero: ";
	public static final String MSJ_MULT = "El valor ingresado multiplicado por " + VAL_MULT + " es igual a: ";
	public static final String MSJ_DIV = "El valor ingresado divido por " + VAL_DIV + " es igual a: ";
	public static final String MSJ_ERROR_NOT_NUM = "ERROR: El valor ingresado no es un número entero. ";
	
	public static void main(String[] args) {
		// DECLARACION DEL OBJETO TIPO SCANNER PARA OBTENER LOS INPUTS DEL USUARIO
		Scanner input = new Scanner(System.in);
		
		int valor = 0;
		Boolean flag = true;
		
		while (flag) {
			// Try-Catch para el caso de que inserte un valor distinto de INT
			try {
				// Solicito el valor a utilizar y si no presenta errores, el Flag obtiene el valor false y sale del ciclo
				System.out.println(MSJ_SOLICITAR_VAL);
				valor = input.nextInt();
				flag = false;
			} catch (InputMismatchException e)  {
				// Catch indicando que no ingreso un INT y su error correspondiente
				System.err.println(MSJ_ERROR_NOT_NUM + e.getMessage());
				// Para seguir el ciclo y no detener la app
				input.nextLine();
			} finally {
				input.close();
			}
		}
		// Realiza el cálculo e indica el resultado de las cuentas con su msj correspondiente 
		System.out.println(MSJ_MULT + valor * VAL_MULT);
		System.out.println(MSJ_DIV + valor / VAL_DIV);
		
	}

}
