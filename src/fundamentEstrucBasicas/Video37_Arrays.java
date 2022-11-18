package fundamentEstrucBasicas;

public class Video37_Arrays {

	public static void main(String[] args) {
		/*
		 Se puede: Declarar la matriz con el número de valores que tiene y dar valores
		 uno a uno:
		  
		 int [] mi_matriz = new int [5]; //int es el tipo de valores que tiene
		  
		 mi_matriz[0]=15;
		 mi_matriz[1]=25;
		 mi_matriz[2]=8;
		 mi_matriz[3]=-7;
		 mi_matriz[4]=92;		  
		 Para imprimir un valor: System.out.println(mi_matriz[3]);
		 
		 //Sintaxis:  T[] identificador; 
	     //         int[] misNumeros;
		  
		   int[] misNumeros;		  
           misNumeros = new int[2];		

           // String[] nombresAlumnos = new String[getNumeroAlumnos()]; 
           // getNumeroAlumnos() un método que me devolvía los alumnos

           misNumeros[0] = 1;
           misNumeros[1] = misNumeros[0] + 1;
           misNumeros[2] = 3; // error en ejecución  		

		// Otro ejemplo:
		  double[] misNumeros;
		  misNumeros=new double[2];
		  misNumeros[0]=1;
		  misNumeros[1]=misNumeros[0]+1;
		  System.out.println(Arrays.toString(misNumeros));
		  misNumeros[2]=3;  //error en ejecución
		
	      misNumeros = new double[] { 1, 2, 3 };
		  System.out.println(Arrays.toString(misNumeros));
	
		 for (int i = 0; i < misNumeros.length; i++) {
		      System.out.println("Posición " + i + ": " + misNumeros[i]);
		  }
		 
		 */
		
		// También se puede declarar los valores así:
		int[] mi_matriz = { 15, 25, 8, -7, 92 };
		for (int i = 0; i < 5; i++) {			
			System.out.println("Valor del índice " + i + " = " + mi_matriz[i]);
		}
		
		
		
		
		
		
	}
}
