package examenParcial1;

import java.util.Scanner;

public class ExamenParcial {

	public static void main(String[] args) {
		// Variables no inicializadas
		int tiempo;
		double prom;
		// Variable booleana no inicializada para control de condiciones
		boolean bPruebaProm; // SI EL PROM ES MAYOR A LIM_PRUEBA_PROM => TRUE
		// Variables int inicializadas
		int diaMenor = 0;
		int sumatoria = 0;
		int tiempoMenor = 100;
		// Variables booleanas inicializadas para control de condiciones
		boolean bLim = false; // SI EL VALOR ES < LIM_MENOR o > LIM_MAYOR => TRUE
		boolean bPruebaMayor = false; // SI EL VALOR ES MAYOR A LIM_PRUEBA_MAYOR => TRUE
		boolean bPruebaMenor = true; // SI NINGUN VALOR ES MENOR A LIM_PRUEBA_MENOR => TRUE
		// Constantes
		final int DIAS = 10;
		final int LIM_MENOR = 0;
		final int LIM_MAYOR = 100;
		final int LIM_PRUEBA_MAYOR = 20;
		final int LIM_PRUEBA_MENOR = 15;
		final int LIM_PRUEBA_PROM = 18;
		// MENSAJES AL USUARIO
		final String MSJ_INGRESO = "Ingrese el tiempo de la prueba del día ";
		final String ERROR_DATO = "ERROR! Debe ingresar un valor mayor a 0 y menor a 100.";
		final String MSJ_PRUEBA_MAYOR = "En al menos un día supero los 20 minutos.";
		final String MSJ_PRUEBA_MENOR = "En al menos un día no logró realizar un tiempo menor a 15 minutos.";
		final String MSJ_PRUEBA_PROM = "No logró un promedio menor o igual a 18 minutos.";
		final String MSJ_CUMPLE_PRUEBA = "Felicitaciones! Está apto para realizar la prueba en el Parque Centenario!";
		final String MSJ_CUMPLE_PROM = "El promedio fue de: ";
		final String MSJ_DIA_MENOR = "El día que realizó el menor tiempo fue: ";
		final String MSJ_FIN = "Fin del programa.";
		/////////////////////////////////////////////////
		
		Scanner input = new Scanner(System.in);
		/////////////////////////////////////////////////
		for (int i = 1; i <= DIAS; i++) {
			// VALIDADOR DE DATO INGRESADO
			do {
				System.out.println(MSJ_INGRESO + i + ": ");
				tiempo = Integer.parseInt(input.nextLine());
				
				if (tiempo < LIM_MENOR || tiempo > LIM_MAYOR) {
					System.out.println(ERROR_DATO);
					bLim = true;
				} else {
					bLim = false;
				}
			} while (bLim);
			
			// CONTROL DE CONDICIONES
			if (tiempo > LIM_PRUEBA_MAYOR) {
				bPruebaMayor = true;
			}
			
			if (tiempo < LIM_PRUEBA_MENOR) {
				bPruebaMenor = false;
			}
			
			// BUSCA EL MEJOR TIEMPO
			if (tiempo < tiempoMenor) {
				tiempoMenor = tiempo;
				diaMenor = i;
			}
			
			sumatoria += tiempo;
		}
		/////////////////////////////////////////////////
		input.close();
		
		// OBTIENE PROMEDIO Y VALIDA SU CONDICION
		prom = (double) sumatoria / (double) DIAS;
		bPruebaProm = prom > LIM_PRUEBA_PROM?true:false;
		
		if (!bPruebaProm && !bPruebaMayor && !bPruebaMenor) {
			// SI ES APTO INGRESA
			System.out.println(MSJ_CUMPLE_PRUEBA);
			System.out.println(MSJ_CUMPLE_PROM + prom);
			System.out.println(MSJ_DIA_MENOR + diaMenor);
		} else {
			// SI NO ES APTO VERIFICA CUAL O CUALES CONDICIONES NO CUMPLE
			if (bPruebaMayor) {
				System.out.println(MSJ_PRUEBA_MAYOR);
			}
			
			if (bPruebaMenor) {
				System.out.println(MSJ_PRUEBA_MENOR);
			}
			
			if (bPruebaProm) {
				System.out.println(MSJ_PRUEBA_PROM);
			}
		}
		
		System.out.println(MSJ_FIN);

	}

}
