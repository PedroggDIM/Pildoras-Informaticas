package fundamentEstrucBasicas;

public class Video30_OperadorTernario {

	public static void main(String[] args) {

		double salario1 = 1200;
		double salario2 = 1000;
		double salario_mayor;

		// Uso primero el if
		if (salario1 > salario2)
			salario_mayor = salario1;
		else
			salario_mayor = salario2;
		System.out.println("El salario mayor es: " + salario_mayor);

		// Operador ternario
		//  Si la condición se cumple tiene que devolver salario1, pues lo pongo el primero.
		salario_mayor = (salario1 > salario2) ? salario1 : salario2;
		System.out.println("El salario mayor es: " + salario_mayor);
		
		
		//Otro ejemplo operador ternario
		int edad = 20;
		String mayor;
		mayor = (edad > 18) ? "Eres mayor de edad" : "Eres menor de edad";
		System.out.println(mayor); 
	}

}
