package fundamentEstrucBasicas;

import java.util.Scanner;

public class Video22_if_aumentaSalarioPorcentaje {

	public static void main(String[] args) {
		/*
		 * Construye un programa que, al recibir como dato el salario de un profesor de
		 * una universidad, calcule el incremento del salario de acuerdo con el
		 * siguiente criterio y escriba el nuevo salario del profesor. Salario < $18,000
		 * ⇒ Incremento 12%. $18,000 >= Salario <= $30,000 ⇒ Incremento 8%. $Salario
		 * mayor que 30000 y menor o igual que 50,000 ⇒ Incremento 7%. $salario mayor
		 * que 50000 Incremento 6%”
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el salario:");
		double salario;
		salario = teclado.nextDouble();

		if (salario < 18000) {
			System.out.println("Su salario es " + (salario + (salario * 0.18)));
			// Podemos también decir salario =+ (salario*0.18)
		} else if (salario >= 18000 && salario <= 30000) {
			System.out.println("Su salario es " + (salario + (salario * 0.08)));

		} else if (salario > 30000 && salario <= 50000) {
			System.out.println("Su salario es " + (salario + (salario * 0.07)));

		} else {
			System.out.println("Su salario es " + (salario + (salario * 0.06)));

		}

	}

}
