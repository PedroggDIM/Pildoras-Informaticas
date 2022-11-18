package fundamentEstrucBasicas;

public class Video382_ArrayAleatorios {

	public static void main(String[] args) {
		// Crear una matriz grande que se rellene con números aleatorios y luego
		// sacarlos en pantalla
		// Declaro una matriz donde almacenar los números enteros.

		int[] matriz_aleatorios = new int[150];

		// Ahora para rellenar la matriz con números aleatorios hago:
		for (int i = 0; i < matriz_aleatorios.length; i++) {
			matriz_aleatorios[i] = (int) Math.round(Math.random() * 100);
		}
		// el Math.round y random nos dan un número aleatorio redondeado entre 1 y 100

		for (int numeros : matriz_aleatorios) {
			System.out.print(numeros + " ");

		}
	}
}
