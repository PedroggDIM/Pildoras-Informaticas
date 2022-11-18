package fundamentEstrucBasicas;

import java.util.Scanner;

public class Video22_if_numOrdenCreciente {

	public static void main(String[] args) {
		/*
		 * Crear un programa que pida por consola 3 números y diga si están en orden
		 * creciente.
		 */
		double num1, num2, num3;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese el número 1:");
		num1 = teclado.nextDouble();

		System.out.println("Ingrese el número 2:");
		num2 = teclado.nextDouble();

		System.out.println("Ingrese el número 3:");
		num3 = teclado.nextDouble();

		if ((num1 < num2) && (num1 < num3) && (num2 < num3)) {

			System.out.println("Los números están en orden creciente.");
		} else {
			System.out.println("Los números no están en orden creciente.");
		}
	}

}
