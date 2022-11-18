package fundamentEstrucBasicas;

import java.util.Scanner;

public class Video21_if_else {

	public static void main(String[] args) {
		
		Scanner introduce_edad=new Scanner(System.in);
		System.out.println("Introduce tu edad por favor");
		int edad=introduce_edad.nextInt();
		
		if (edad>=18){   //Si se cumple o es true, ejecuta lo siguiente
		   System.out.println("Eres mayor de edad");

	}
		else{
			System.out.println("Eres menor");
		}

	}

}
