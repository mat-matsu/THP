package thp.tp1.actividad1;

public class Ejercicio0 {

	public static void main(String[] args) {
		/* TP1 Ejercicio 1
		 * Grupo Nro.: ?
		 * Integrantes: Matsumoto, Matías
		 * Enunciado:
		 * Escribir en la consola de Java el texto "Mi Primer Programa en Java :)"
		 */
		System.out.println("Mi primer programa en Java :)");
		
		
		String regex = "[^0-9]+";

		// positive test cases, should all be "true"
		System.out.println("1".matches(regex));
		System.out.println("12345".matches(regex));
		System.out.println("123456789".matches(regex));

		// negative test cases, should all be "false"
		System.out.println("".matches(regex));
		System.out.println("foo".matches(regex));
		System.out.println("Mat-as".matches(regex));
		
		System.out.println(4%2);
	}

}
