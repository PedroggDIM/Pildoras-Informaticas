package fundamentEstrucBasicas;

public class Video381_MayorMenorArray {

	public static void main(String[] args) {

		// Obtener el mayor y menor de un array
		int[] mi_array = { 12, 23, 76, 55, 33, 2, 33, 43, 76, 38, 88 };

		int mayor = mi_array[0];
		int menor = mi_array[0];
		int posicion = 0;
		int lugar = 0;

		for (int i = 0; i < mi_array.length; i++) {
			System.out.println(mi_array[i]);
			if (mi_array[i] > mayor) {
				mayor = mi_array[i];
				posicion = i;
			}
			if (mi_array[i] < menor) {
				menor = mi_array[i];
				lugar = i;
			}
		}
		System.out.println("El mayor: " + mayor + ". Posicion: " + posicion);
		System.out.println("El menor: " + menor + ". Lugar: " + lugar);
	}
}
