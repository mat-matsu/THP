package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {
		char opcion;
		final char OPCION_S = 'S';
		final char OPCION_N = 'N';
		final String MSJ_WHILE = "¿Deseás continuar? [S/N] (version WHILE)";
		final String MSJ_DO_WHILE = "¿Deseás continuar? [S/N] (version DO WHILE)";
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		System.out.println(MSJ_WHILE);
		opcion = input.nextLine().toUpperCase().charAt(0);
		
		while (opcion != OPCION_N && opcion != OPCION_S) {
			System.out.println(MSJ_WHILE);
			opcion = input.nextLine().toUpperCase().charAt(0);
		}
		/////////////////////////////////////////////////
		do {
			System.out.println(MSJ_DO_WHILE);
			opcion = input.nextLine().toUpperCase().charAt(0);
		} while (opcion != OPCION_N && opcion != OPCION_S);
		/////////////////////////////////////////////////		
		input.close();

	}

}
