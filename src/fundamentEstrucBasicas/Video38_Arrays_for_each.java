package fundamentEstrucBasicas;

public class Video38_Arrays_for_each {
	public static void main(String args[]) {

		// Recorrer una matriz de gran tamaño:

		int[] mi_matriz = { 15, 25, 8, -7, 92, 55, 33, 2, 1, 5, 7, 66, 88, 9, 50, 3, 23, 1 };
		// bucle for normal
		for (int i = 0; i < mi_matriz.length; i++) {
			System.out.println("Valor del índice " + i + " = " + mi_matriz[i]);
		}
		// bucle for each
		for (int elemento : mi_matriz) {
			System.out.println(elemento);
		}
		
		// Otro ejemplo de for each con String
		 String [] paises={"España","Méjico","Colombia","Perú","Chile","Argentina","Ecuador"};	
         
	      //Bucle for each:          
	          for(String elemento:paises){
	              System.out.println("País "+elemento);
	          }  
		
		

	}
}
