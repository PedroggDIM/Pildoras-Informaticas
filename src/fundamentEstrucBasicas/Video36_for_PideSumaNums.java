package fundamentEstrucBasicas;

import java.util.Scanner;

public class Video36_for_PideSumaNums {

	public static void main(String[] args) {
		// Pedir 15 números con Scanner y calcular la suma total.
		// Si hay alguno mayor de 20 decir cuantos son
		Scanner teclado = new Scanner(System.in);
		int numeros;
		int suma_numeros = 0;
		int mayores_20 = 0;

		for (int i = 0; i < 15; i++) {
			System.out.println("Ingrese 15 números: ");
			numeros = teclado.nextInt();
			suma_numeros = suma_numeros + numeros;
			if (numeros > 20) {
				mayores_20++;
			}
		}
		System.out.println("La suma de los números es: " + suma_numeros);
		System.out.println("Son mayores de 20: " + mayores_20);
	}
}
