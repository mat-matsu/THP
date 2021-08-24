package thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		int alto;
		int ancho;
		String aux;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el alto: ");
		alto = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el ancho: ");
		ancho = Integer.parseInt(input.nextLine());
		
		input.close();
		/////////////////////////////////////////////////
		for (int i = 0; i < alto; i++) {
			aux = "";
			for (int j = 0; j < ancho; j++) {
				aux += "X";
			}
			System.out.println(aux);
		}

	}

}
