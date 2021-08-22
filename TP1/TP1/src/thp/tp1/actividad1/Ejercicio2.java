package thp.tp1.actividad1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	// STRING CONSTANTES PARA MSJ AL USUARIO
	public static final String MSJ_ENUNCIADO = "A continuacion ingrese sus notas, deberán ser valores enteros del 0 al 10.";
	public static final String MSJ_SOLICITAR_NOTA = "Por favor, ingrese la nota ";
	public static final String MSJ_SOLICITAR_NOTA_FUERA_COTA = "El valor debe ser del 0 al 10, vuelva a ingresar la nota ";
	public static final String MSJ_ERROR_NOT_NUM = "ERROR: El valor ingresado no es un número entero. ";
	public static final String MSJ_PROMEDIO = "Su promedio es de: ";
	// VALOR CONSTANTE PARA CANTIDAD DE VALORES A SOLICITAR PARA EL PROMEDIO
	public static final int CANT_NOTAS = 3;
	
	public static void main(String[] args) {
		// DECLARACION DEL OBJETO TIPO SCANNER PARA OBTENER LOS INPUTS DEL USUARIO
		Scanner input = new Scanner(System.in);
		// Variable que almacenará lo ingresado por el usuario y se validara
		int nota;
		// Variable que llevará la sumatoria de las notas
		int sumNotas = 0;
		// Variable que llevará el promedio de las notas
		int promNotas = 0;
		// Variable bandera para validacion
		Boolean flag = true;
		
		System.out.println(MSJ_ENUNCIADO);
		
		// Ciclo for para solicitar las 3 notas
		for (int i = 1; i <= CANT_NOTAS; i++) {
			// Try-Catch para el caso de que inserte un valor distinto de INT
			try {
				// Condicional segun el Flag para saber que nota esta ingresando
				if (flag) {
					System.out.println(MSJ_SOLICITAR_NOTA + i + " a promediar:");
					nota = input.nextInt();
				} else {
					System.out.println(MSJ_SOLICITAR_NOTA_FUERA_COTA + i + " a promediar:");
					nota = input.nextInt();
				}
			} catch (InputMismatchException e)  {
				// Catch indicando que no ingreso un INT y su error correspondiente
				System.err.println(MSJ_ERROR_NOT_NUM + e.getMessage());
				// Asigno el valor -1 para que en caso de error 
				nota = -1;
				// Para seguir el ciclo y no detener la app
				input.nextLine();
			} finally {
				input.close();
			}
			// Validacion para asegurar que el numero no es mayor o menor a los valores de la cota
			if (nota < 0 || nota > 10) {
				// Para que vuelva a solicitar los valores en caso de que esten fuera de rango
				i -= 1;
				flag = false;
			} else {
				// Suma las notas que pasan la validacion
				sumNotas += nota;
				flag = true;
			}
		}
		// Saca el promedio y lo imprime en pantalla
		promNotas = sumNotas / CANT_NOTAS;
		System.out.println(MSJ_PROMEDIO + promNotas);

	}

}
