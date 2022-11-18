package fundamentEstrucBasicas;

import java.util.Scanner;

public class Video16_20_Scanner {
	public static void main(String args[]) {

		/*
		  La clase Scanner (pertenece al paquete java util por lo al no ser el paquete
		  java lang, que es el paquete por defecto, lo tengo que importar:
		 
		  import.java.util.*;
		 
		  Scanner sc = new Scanner(System.in); //crear un objeto Scanner
		  
		  String nombre;
		  System.out.print("Introduzca su nombre: ");
		  nombre = sc.nextLine(); //Método no estatico y hay instanciarlo o crear un objeto.
		  System.out.println("Hola " + nombre + "!!!");
		  
		  double radio;
		  System.out.print("Introduzca el radio de la circunferencia: ");
		  radio = sc.nextDouble(); //leer un double
		  System.out.println("Longitud de la circunferencia: " + 2*Math.PI*radio);
		  
		 
		  int n; 
		  System.out.print("Introduzca un número entero: ");
		  n = sc.nextInt();
		  //leer un entero System.out.println("El cuadrado es: " + Math.pow(n,2));
		 */
				
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre ");
		String nombre;
		nombre = teclado.nextLine(); // Almaceno en nombre el nombre.
		//teclado.nextLine(); // Puede dar error si ponemos primero la edad y luego el nombre
		                      //porque nextLine al dar enter interpretaría un \n y pasaría a 
		                      // la siguiente línea, se solucionaría con: teclado.nextLine( )
		                      //Cuando se use scanner intentar poner String y el nextLine( ) el primero.
		System.out.println("Hola " + nombre);
			

		System.out.println("Introduce tu edad: ");
		int edad;
		edad = teclado.nextInt(); // Almaceno en edad la edad.
		System.out.println("Hola " + nombre + "\nEl año que viene tendrás: " + (edad + 1) + " añitos");
		
		double radio;
		System.out.print("Introduzca un nº: ");  //En el teclado hp el decimal va con coma.
		radio = teclado.nextDouble(); //leer un double
		System.out.println("La raíz cuadrada del número introducido es: " + Math.sqrt(radio));
		
		teclado.close();
	}
}
