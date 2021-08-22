package thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio17 {
	
	public static final String GEN_MASC = "M";
	public static final String GEN_FEM = "F";
	public static final int EDAD_MIN = 1;
	public static final int EDAD_MAX = 120;
	public static final int JUB_MASC = 65;
	public static final int JUB_FEM = 60;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String genero = "";
		int edad = 0;
		boolean flag = true;
		
		System.out.println("Ingrese su g�nero: \r(" + GEN_FEM  + " para FEMENINO, " + GEN_MASC +  " para MASCULINO) ");
		genero = input.nextLine();
		
		// El signo de exclamaci�n "invierte" el valor booleano obtenido
		if (!genero.equals(GEN_MASC) && !genero.equals(GEN_FEM) ) {
			// Si el valor ingresado por el usuario es distinto a las constantes avisa del error.
			System.out.println("Ingres� un valor de g�nero incorrecto.");
			flag = false;
		}
		// Flag => para usarla como referencia y saber si cumpli� las condiciones anteriores
		if (flag) {
			// Si flag es false, no hace falta que realice lo que se encuentra dentro del if
			System.out.println("Ingrese su edad: \r(rango del " + EDAD_MIN + " al " + EDAD_MAX + ") ");
			edad = input.nextInt();
			// Validaci�n de rango de edad
			if ( (edad < EDAD_MIN || edad > EDAD_MAX) && flag) {
				System.out.println("Ingres� un valor de edad incorrecto.");
				flag = false;
			}
		}
		
		if (flag) { 
			if (edad >= JUB_MASC && genero.equals(GEN_MASC)) {
				System.out.println("Se�or est� en edad de jubilarse.");
			} else if (edad >= JUB_FEM && genero.equals(GEN_FEM)) {
				System.out.println("Se�ora est� en edad de jubilarse.");
			} else {
				System.out.println("A�n le falta para jubilarse.");
			}
		}
		
		input.close();
		System.out.println("FIN DEL PROGRAMA.");

	}

}
