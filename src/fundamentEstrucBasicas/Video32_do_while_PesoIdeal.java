package fundamentEstrucBasicas;

import java.util.Scanner;

public class Video32_do_while_PesoIdeal {

	public static void main(String[] args) {

		/*
		 * Crear un programa en Java que te pregunte si somos hombres o mujeres con
		 * Scanner y nos pregunte nuestra altura y nos devuelva nuestro peso ideal
		 */
		Scanner sc = new Scanner(System.in);
		String genero = "";
		int altura;
		int peso_ideal = 0;
		do {
			System.out.println("Introduce tu género: H/M");
			genero = sc.nextLine();

			// Mientras que genero no sea H o M le pido el género al usuario.
		} while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
		// Le pido al usuario que introduzca su altura.
		System.out.println("Introduzca su altura en cm.");
		altura = sc.nextInt();
		// Ahora necesito saber cual es el peso ideal, que depende de si lo introducido
		// es una M o H.
		if (genero.equalsIgnoreCase("H")) {
			peso_ideal = altura - 110;
		} else if (genero.equalsIgnoreCase("M")) {
			peso_ideal = altura - 120;
		}
		System.out.println("Su peso ideal es: " + peso_ideal);
	}

}
