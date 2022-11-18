package fundamentEstrucBasicas;

import java.util.Scanner;

public class Video32_do_while2 {

	public static void main(String[] args) {
		/*
		 * Crear un programa que genere un número aleatoreo del 0 al 100 y pida al
		 * usuario que introduzca un número para ver si lo acierta.
		 */

		int aleatoreo = (int) (Math.random() * 100);
		// Math.random devuelve un doble por eso hago una refundición con (int).
		System.out.println(aleatoreo);

		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		int intento = 0;

		do {
			intento++;
			System.out.println("Introduzca un número por favor");

			numero = teclado.nextInt();
			if (aleatoreo < numero) {
				System.out.println("Introduzca un número más bajo");
			} else if (aleatoreo > numero) {
				System.out.println("Introduzca un número más alto");
			}
		}

		while (numero != aleatoreo);
		System.out.println("Correcto");

		System.out.println("Su número de intentos son: " + intento);
	}

}
