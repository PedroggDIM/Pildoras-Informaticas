package fundamentEstrucBasicas;

import java.util.Scanner;

public class Video382_ArrayNotasMayMenorAprob {

	public static void main(String[] args) {
		/*
		 * Con Scanner pedir 10 notas (1-10), que se almacenan en un array y mostrar -La
		 * mayor y menor y su posición. -Aprobados y suspensos.
		 */
		Scanner sc = new Scanner(System.in);
		double[] notas = new double[10];
		double mayor = notas[0];
		double menor = notas[0];
		int posicionMayor = 0;
		int posicionMenor = 0;
		double aprobados = 0;
		double suspensos = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Introduzca las notas: ");
			notas[i] = sc.nextInt();
		}

		System.out.println("Sus notas son: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
			if (notas[i] > mayor) {
				mayor = notas[i];
				posicionMayor = i;
			}
			if (notas[i] < menor) {
				menor = notas[i];
				posicionMenor = i;
			}
		}
		// Con otro bucle for veo los aprobados y suspensos.
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= 5) {
				aprobados = aprobados + 1;
			} else {
				suspensos = suspensos + 1;
			}
		}
		System.out.println("-------------------------");
		System.out.println("La nota mayor es: " + mayor);
		System.out.println("La nota menor es: " + menor);
		System.out.println("La posición del mayor es: " + posicionMayor);
		System.out.println("Los aprobados son: " + aprobados);
		System.out.println("Los suspensos son: " + suspensos);

	}

}
