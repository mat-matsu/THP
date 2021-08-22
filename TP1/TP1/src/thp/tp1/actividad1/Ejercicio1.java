package thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio1 {
	// STRING CONSTANTES PARA MSJ AL USUARIO
	public static final String MSJ_SOLICITAR_NOMBRE = "Por favor, se un buen usuario e ingresa tu nombre: ";
	public static final String MSJ_SOLICITAR_NOMBRE_VACIO = "No me dejes este vacío, poné tu nombre por favor: ";
	public static final String MSJ_SOLICITAR_NOMBRE_NUM = "Si sos la hija de Elon Musk, anda por el VIP sino poné tu nombre por favor: ";
	public static final String MSJ_BIENVENIDA = "Bienvenido a la fiesta ";
	
	public static void main(String[] args) {
		// DECLARACION DEL OBJETO TIPO SCANNER PARA OBTENER LOS INPUTS DEL USUARIO
		Scanner input = new Scanner(System.in);
		// Variable que almacenará lo ingresado por el usuario
		String nombre = "";
		// Variable bandera para validacion
		Boolean flag = true;
		// Solicitud de nombre al usuario
		System.out.println(MSJ_SOLICITAR_NOMBRE);
		nombre = input.nextLine();
		input.close();
		
		// Validacion para que el nombre ingresado sea un string
		while (flag) {
			flag = false;
			// Valida si no ingresa nada
			if (nombre.isEmpty() && !flag) {
				System.out.println(MSJ_SOLICITAR_NOMBRE_VACIO);
				nombre = input.nextLine();
				input.close();
				flag = true;
			}
			// Valida si ingresa valores distintos a letras
			if (!nombre.matches("[a-zA-Z]+") && !flag) {
				System.out.println(MSJ_SOLICITAR_NOMBRE_NUM);
				nombre = input.nextLine();
				input.close();
				flag = true;
			}
		}
		
		// Mensaje final para el usuario con su nombre en mayuscula
		System.out.println(MSJ_BIENVENIDA + nombre.toUpperCase() + "!");
		
	}

}
