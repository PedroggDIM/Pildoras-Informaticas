package fundamentEstrucBasicas;

public class Video_5_Constantes_Operadores {

	public static void main(String args[]) {

//Declaro una constante	
		final double CONVERSION_EURO = 1.2;
		System.out.println(CONVERSION_EURO);

		int num1 = 7;
		num1 += 10; // incremento a num1 10 7+10=17

		int num2 = 5;
		num2++; // aumento 1 a num2

		int resultado = num1 + num2;

		System.out.println(resultado);
//Otro ejemplo CONSTANTE:	 
		final double APULGADAS = 2.54;
		// apulgadas ya no se puede modificar, no se puede poner: apulgadas=7;
		double cm = 6;
		double resul = cm / APULGADAS;
		System.out.println("En " + cm + " cm. hay: " + resul + " pulgadas.");
//Más ejemplos

		/*
		 * int a=5; int b; b=7;
		 * 
		 * int c=a+b; //c vale 12. c++; //A c le sumo 1. c+=3; //A c le sumo 3. c-=2;
		 * //A c le resto 2. System.out.println(c);
		 * 
		 * 
		 * double x=5; double y=7; double z=y/x; //En el caso de divisiones hay que
		 * trabajar con double o float y todos los valores double.
		 * System.out.println(z);
		 * 
		 * int operador1, operador2, resultado; operador1=4; operador2=3;
		 * resultado=operador1*operador2; System.out.println(resultado);
		 */
	}

}
