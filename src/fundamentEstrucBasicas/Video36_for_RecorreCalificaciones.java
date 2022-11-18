package fundamentEstrucBasicas;

import java.util.Scanner;

public class Video36_for_RecorreCalificaciones {

	public static void main(String[] args) {
		// Pedir con Scanner 5 calificaciones de alumnos y decir al final si hay algún
		// suspenso (decir cuantos).
		/*
		 * Pido 5 calificaciones con un bucle for. Las introduzco con Scanner en la
		 * variable double calificaciones. Con un if veo si alguna es negativa y la
		 * saco.
		 */
		double calificaciones;
		boolean suspensos = false;
		int num_suspensos = 0;

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Escriba las calificaciones: ");
			calificaciones = teclado.nextDouble();
			if (calificaciones < 5) {
				suspensos = true;
				num_suspensos++;
			}
		}
		if (suspensos == true) {
			System.out.println("Hay algún suspenso");
			System.out.println("Los suspensos son: " + num_suspensos);
		}
	}
}