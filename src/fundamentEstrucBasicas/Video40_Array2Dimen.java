package fundamentEstrucBasicas;

import java.util.Scanner;

public class Video40_Array2Dimen {
	public static void main(String[] args) {

		// Arrays de dos dimensiones, se ponen 2 corchetes, ver video 25
		// La llamo Matrix como la película

		/*
		  Se puede escribir de forma extendida o reducida, la extendida sería:
		  
		 int [][] matrix=new int [4][5];
		  
		 matrix[0][0]=15; 
		 matrix[0][1]=21; 
		 matrix[0][2]=18; 
		 matrix[0][3]=9;
		 matrix[0][4]=15;
		  
		 matrix[1][0]=10; 
		 matrix[1][1]=52; 
		 matrix[1][2]=17; 
		 matrix[1][3]=19;
		 matrix[1][4]=7;
		  
		 matrix[2][0]=19; 
		 matrix[2][1]=2; 
		 matrix[2][2]=19; 
		 matrix[2][3]=17;
		 matrix[2][4]=7;
		  
		 matrix[3][0]=92;
		 matrix[3][1]=13; 
		 matrix[3][2]=13;
		 matrix[3][3]=32;
		 matrix[3][4]=41;
		 */

		// Lo anterior también se puede escribir así:

		int[][] matrix = { { 10, 15, 18, 19, 21 }, { 5, 25, 37, 41, 15 }, { 7, 19, 32, 14, 90 },
				{ 85, 2, 7, 40, 27 }, };     // Esta es la forma resumida de cómo se puede escribir el código de un bucle
											// dimensional.
		// Para ver un registro : 
		// System.out.println("Valor almacenado en la posición 2, 3 es " + matrix[2][3]);

		// Ahora para recorrer todo el bucle uso un for y otro for dentro:

		for (int i = 0; i < 4; i++) { // Este for recorre la primera dimensión.

			System.out.println(); // Esto lo ponemos para que cada vez que imprime la primera dimensión mete un
									// salto de línea.

			for (int j = 0; j < 5; j++) { // Este for recorre la segunda dimensión.

				System.out.print(matrix[i][j] + " ");
			}
		}
		/*
		 * La anterior es una forma de ver los bucles bidimensionales (video 25), pero
		 * también se pueden ver e imprimir de la forma simplificada:
		 */
		for (int[] fila : matrix) { // fila es el nombre que yo le doy.
			System.out.println(); // Este System... es para que me haga un salto de línea.

			for (int z : fila) {

				System.out.print(z + " ");
			}
		}

	}
}
