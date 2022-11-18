package fundamentEstrucBasicas;
import java.util.Scanner;

public class Video_7_Concatenacion_String {

	public static void main(String args[]) {

		double salario = 180.55;
		double salarioEnDolares = 1850.55 * 1.2;

		// Escribiendo Syso (CTRL + tabulador) y escribe System.out.println( );
		System.out.println("El salario de Manuel es " + salario + " a día de hoy.");
		System.out.println("El salario de Manuel es " + salario * 1.2 + " a día de hoy.");
		System.out.println("El salario de Manuel es " + salario + 300 + " a día de hoy."); // Aquí concatena, no suma
		System.out.println("El salario de Manuel es " + (salario + 300) + " a día de hoy."); //Aquí suma con el paréntesis.
		
		int edad;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Escriba su edad: ");
		edad=entrada.nextInt();
		System.out.println("La edad introducida es: "+edad);
		//Si introdujera un String o texto daría un error.
		
	}
}
