package fundamentEstrucBasicas;

import java.util.Scanner;

public class Video31_while_Pide_num_indicaNegati {
	public static void main(String[] args) {
		/*
		 * Pedir números con Scanner hasta que se teclee uno negativo, y mostrar cuántos
		 * números se han introducido
		 */

		int numero;
		int numeros_introducidos = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número, por favor: ");
		numero = teclado.nextInt();
		while (numero > 0) {
			numeros_introducidos++;
			System.out.println("Ingrese un número, por favor: ");
			numero = teclado.nextInt();

		}
		System.out.println(
				"Ha introducido un número negativo." + "Los positivos ingresados son: " + numeros_introducidos);
	}
}
