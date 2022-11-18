package fundamentEstrucBasicas;

import java.util.Scanner;

public class Video32_do_while3_try_catch {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int edad;
		boolean repetir = true;

		do {
			System.out.println("Introduzca la edad");
			try {
				edad = teclado.nextInt();
				repetir = false;
			} catch (Exception e) {
				teclado.nextLine();
				System.out.println("Error, has introducido mal la edad.");
			}

		} while (repetir);
	}
}
