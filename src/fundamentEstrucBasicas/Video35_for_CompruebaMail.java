package fundamentEstrucBasicas;

import java.util.Scanner;

public class Video35_for_CompruebaMail {

	public static void main(String[] args) {
		/*
		 * Ejercicio para comprobar si una email es válido: Necesito un método que me
		 * compruebe si en un String hay un arrova @ o no, uso Voy a usar los métodos
		 * charAt y length de la clase String Si voy a la Api veo que charAt() no es
		 * estático, luego tengo que crear un objeto de esa clase y devuelve el valor
		 * especificado en el índice, si digo charAt(3)nos devuelve el carácter en esa
		 * posición. devuelve un dato de tipo char length jos indica la longitud que
		 * tiene una cadea de caracteres (devuelve un dato de tipo entero)
		 */
		Scanner sc = new Scanner(System.in);
		int arroba = 0;
		boolean punto = false;
		String mail;
		System.out.println("Introduce mail");
		mail = sc.nextLine();
		/*
		 * Lo primero quiero comprobar si hay un @, y un punto. No se si lleva arroba,
		 * entonces lo recorro carácter a carácter en su busca
		 */

		for (int i = 0; i < mail.length(); i++) {
			if (mail.charAt(i) == '@') {
				arroba++;
			}
			if (mail.charAt(i) == '.') {
				punto = true;
			}
		}
		if (arroba == 1 && punto == true) {
			System.out.println("El mail es correcto");
		} else {
			System.out.println("No es correcto");
		}
	}
}
