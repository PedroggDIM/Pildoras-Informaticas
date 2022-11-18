package fundamentEstrucBasicas;

public class Video11_String {

	public static void main(String args[]) {

		String nombre = "Pedro";
		System.out.println("Mi nombre es " + nombre);
		System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
		System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
		// length() Devuelve la longitud de la cadena
		System.out.println("La última letra de mi nombre es " + nombre.charAt(nombre.length() - 1));

		// MÉTODO DESCRIPCIÓN
		// indexOf(‘caracter’) Devuelve la posición de la primera aparición de carácter
		String a = "San Lucas";
		int resultado = a.indexOf("Lucas");
		System.out.println(resultado);// resultado 4

		int resultado2 = a.indexOf('u');
		System.out.println(resultado2);// resultado 5

		// lastIndexOf(‘caracter’) Devuelve la posición de la última aparición de
		// carácter
		// charAt(n) Devuelve el carácter que está en la posición n
		// substring(n1,n2) Devuelve la subcadena comprendida entre las posiciones n1 y
		// n2-1
		System.out.println(a.substring(1, 3)); // a="San Lucas" // imprime an
		//  Devuelve la cadena convertida a mayúsculas
		// toLowerCase() Devuelve la cadena convertida a minúsculas
		// equals("cad") Compara dos cadenas y devuelve true si son iguales

		// ¡Importante! No se debe utilizar nunca el comparativo de igualdad == para
		// comprobar si dos cadenas son iguales. Usar equals( )
		String am = "java";
		String b = "JAVA";
		if (am.equals(b)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
			// Imprime son diferentes.
		}
		// equalsIgnoreCase("cad") Igual que equals pero sin considerar mayúsculas y
		// minúsculas

		/*
		 * compareTo(OtroString) Devuelve 0 si las dos cadenas son equals. <0 si la
		 * primera es alfabéticamente menor que la segunda ó >0 si la primera es
		 * alfabéticamente mayor que la segunda.
		 */
		String cad1 = "1234";
		String cad2 = " 1500";
		int valor = cad1.compareTo(cad2);
		if (valor == 0) {
			System.out.println("Son iguales");
		} else if (valor < 0) {
			System.out.println("cad1 menor que cad2");
		} else {
			System.out.println("cad1 es mayor que cad2");
		}

		// compareToIgnoreCase(OtroString) Igual que compareTo pero sin considerar
		// mayúsculas y minúsculas.
		// valueOf(N) Método estático. Convierte el valor N a String. N puede ser de
		// cualquier tipo.

		// replace
		String cadena = "mama";
		String hielera;
		hielera = cadena.replace('m', 'p');
		System.out.println(hielera); // imprime papa
		// replaceAll
		String cadena2 = "Fernando Castillo y Ana Castillo";
		String hielera2;
		hielera2 = cadena2.replaceAll("Castillo", "Aguirre"); // imprime Fernando Aguirre y Ana Aguirre
		System.out.println(hielera2);
	}
}
