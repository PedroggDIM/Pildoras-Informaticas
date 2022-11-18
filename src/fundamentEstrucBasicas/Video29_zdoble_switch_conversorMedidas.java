package fundamentEstrucBasicas;

import java.util.Scanner;

public class Video29_zdoble_switch_conversorMedidas {

	public static void main(String[] args) {
		/*
		 * “Construye un programa que permita realizar la conversión de medidas de
		 * pesos, longitud y volumen, de acuerdo con las conversiones dadas. Se debe
		 * escribir el valor a convertir, la medida en que está expresado el valor, el
		 * nuevo valor y la nueva medida correspondiente. MEDIDAS DE LONGITUD: 1 pulgada
		 * = 25.40 milímetros 1 yarda = 0.9144 metros
		 * 
		 * MEDIDAS DE PESO: 1 onza = 28.35 grs 1 libra= 0.45359 kg.
		 */
		Scanner teclado = new Scanner(System.in);

		double pulgadas, milimetros, yardas, metros, onzas, gramos, libras, kilogramos;
		int menu, submenu;
		System.out.println("Ingrese la opción que desea:" + "\n1. Longitud" + "\n2. Peso");

		menu = teclado.nextInt();
		switch (menu) {
		case 1:
			System.out.println("Qué desea: " + "\n1. Pulgadas a mm" + "\n2. Yardas a m");
			submenu = teclado.nextInt();
			switch (submenu) {
			case 1:
				System.out.println("Introduzca las pulgadas: ");
				pulgadas = teclado.nextDouble();
				milimetros = pulgadas * 25.4;
				System.out.println(pulgadas + " pulgadas " + ", son " + milimetros + " milimetros.");
				break;
			case 2:
				System.out.println("Introduzca las yardas: ");
				yardas = teclado.nextDouble();
				metros = yardas * 0.9144;
				System.out.println(yardas + " yardas " + ", son " + metros + " metros.");
				break;
			default:
				System.out.println("Elija la opción correcta.");
				break;
			}
			break;
		case 2:
			System.out.println("Qué desea: " + "\n1. Onzas a gr" + "\n2. Libras a kg");
			submenu = teclado.nextInt();
			switch (submenu) {
			case 1:
				System.out.println("Introduzca las onzas: ");
				onzas = teclado.nextDouble();
				gramos = onzas * 28.35;
				System.out.println(onzas + " onzas" + ", son " + gramos + " gramos.");
				break;
			case 2:
				System.out.println("Introduzca las libras: ");
				libras = teclado.nextDouble();
				kilogramos = libras * 0.45359;
				System.out.println(libras + " libras" + ", son " + kilogramos + " kilogramos.");
				break;
			default:
				System.out.println("Escriba los valores solicitados");
				break;

			}
			break;
		default:
			System.out.println("Introduzca lo solicitado.");

		}
	}

}
