package fundamentEstrucBasicas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Video32_do_while1 {

	public static void main(String[] args) {
		System.out.println(
				"Este programa cuenta los caracteres de la palabra introducida, para acabar" + " pulsar: salir ");

		Scanner sc = new Scanner(System.in);
		String texto = "";

		do {
			System.out.println("Introduzca el texto");
			texto = sc.nextLine();

			System.out.println("Texto introducido " + texto.length() + " caracteres.");

		} while (!texto.equals("salir"));
		System.out.println("Has salido del programa.");
	}

}
