package fundamentEstrucBasicas;

import java.util.Scanner;

public class Video29_switchCajero {
	public static void main(String[] args) {
		/*
		 * Hacer un programa que simule un cajero automático con un saldo inicial de
		 * 1000 euros, con el menú: -Ingresar dinero. -Sacar dinero. -Salir cuenta.
		 */
		Scanner sc = new Scanner(System.in);
		final int saldo_inicial = 1000;
		int opcion;
		double ingreso;
		double retiro;
		double saldo_actual;

		System.out.println("Bienvenido al cajero automático, elija opción" + "\n1. Ingresar dinero."
				+ "\n2. Sacar dinero." + "\n3. Salir cuenta.");
		opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Digite la cantidad que desea ingresar: ");
			ingreso = sc.nextDouble();
			saldo_actual = saldo_inicial + ingreso;
			System.out.println("Dinero en cuenta: " + saldo_actual);
			break;
		case 2:
			System.out.println("Digite la cantidad que desea retirar: ");
			retiro = sc.nextDouble();
			if (retiro > saldo_inicial) {
				System.out.println("No cuenta con el saldo suficiente.");
			} else {
				saldo_actual = saldo_inicial - retiro;
				System.out.println("Dinero en cuenta: " + saldo_actual);
			}
			break;
		case 3:
			break;
		default:
			System.out.println("Se equivocó de opción de menú");
		}
	}
}
