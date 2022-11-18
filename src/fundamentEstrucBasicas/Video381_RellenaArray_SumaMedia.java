package fundamentEstrucBasicas;

public class Video381_RellenaArray_SumaMedia {

	public static void main(String[] args) {
		/*
		 * Crear un array que contenga los números del 1 al 100 y mostrarlos por
		 * pantalla y calcular la suma y media de sus valores.
		 */
		int numeros[] = new int[100];
		// Para rellenarlo uso un bucle for.
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
			System.out.println(numeros[i]);
		}
		
		// Para calcular la suma y media de los valores declaro las variables.
        int suma = 0;
        double media = 0;
        
        for (int i = 0; i < numeros.length; i++) {
			suma = suma + numeros[i];	
		}
        media = (double)suma/100;
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);        
	}
}
