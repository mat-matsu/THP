package thp.tp1.actividad1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		double valorHora;
		double horasHabiles;
		double valorLuAVi;
		double valorSab;
		double sueldoSemanal;
		final int DIAS_HABILES = 5;
		/////////////////////////////////////////////////
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Ingrese el valor por hora: ");
		valorHora = input.nextDouble();
		
		System.out.println("Ingrese la cantidad de horas h�biles trabajadas por d�a: ");
		horasHabiles = input.nextDouble();
		
		input.close();
		/////////////////////////////////////////////////
		valorLuAVi = valorHora * horasHabiles * DIAS_HABILES;
		
		valorSab = valorHora * (horasHabiles / 2);
		
		sueldoSemanal = valorLuAVi + valorSab;
		/////////////////////////////////////////////////
		System.out.println("Su sueldo semanal es de: $" + sueldoSemanal);
	}

}
