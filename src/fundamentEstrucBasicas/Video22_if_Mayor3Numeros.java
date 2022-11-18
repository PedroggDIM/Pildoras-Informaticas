package fundamentEstrucBasicas;

import java.util.Scanner;

public class Video22_if_Mayor3Numeros {

	public static void main(String[] args) {
		/*
		 * Crear un programa que pida tres números y diga cual es el mayor y considere
		 * que pueden ser iguales.
		 */
		double num1, num2, num3;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese el número 1: ");
		num1 = teclado.nextDouble();

		System.out.println("Ingrese el número 2: ");
		num2 = teclado.nextDouble();

		System.out.println("Ingrese el número 3: ");
		num3 = teclado.nextDouble();

		if ((num1 > num2) && (num1 > num3)) {
			System.out.println("El número 1: " + num1 + ", es el mayor");
		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.println("El número 2: " + num2 + ", es el mayor");
		} else if ((num3 > num1) && (num3 > num2)) {
			System.out.println("El número 3: " + num3 + ", es el mayor");
		} else {
			System.out.println("Son iguales");
		}
	}

}
