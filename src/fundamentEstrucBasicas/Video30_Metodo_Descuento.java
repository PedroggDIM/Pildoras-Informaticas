package fundamentEstrucBasicas;

import java.util.Scanner;
// si el cliente adquiere 100 o más priezas tendrá un 20% de descuento.
public class Video30_Metodo_Descuento {

	public static void main(String[] args) {

		int num_piezas = 0;
		double precio = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el número de unidades: ");
		num_piezas = sc.nextInt();

		System.out.println("Ingrese el precio por pieza: ");
		precio = sc.nextDouble();
		
		System.out.println("El pago total es: " + calculaPago(num_piezas, precio));
	}

	// Método que calcula el precio total en función de las piezas y precio.
	public static double calculaPago(int num_piezas, double precio) {

		double pagoTotal = 0;
		if (num_piezas >= 100) {
			// precio menos el descuento del 20%
			pagoTotal = (num_piezas * precio) - ((num_piezas * precio) * 0.20);
		} else {
			pagoTotal = num_piezas * precio;
		}
		return pagoTotal;
	}
}
