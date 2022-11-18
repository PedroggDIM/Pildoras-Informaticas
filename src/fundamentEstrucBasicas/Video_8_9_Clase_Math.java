package fundamentEstrucBasicas;

public class Video_8_9_Clase_Math {
	public static void main(String args[]) {

		double num1 = 5.85;
		int resultado =  (int) Math.round(num1); // Math.round (redondea)
		// Hago un casting o refundición pues round me devolveria un long, pero lo
		// quiero en un int.
		// Es un método static por lo que va la clase.método Math.round( )
		System.out.println(resultado);

		double base = 5;
		double exponente = 3;
		int resul = (int) Math.pow(base, exponente);
		// Me pasa como antes Math.pow me devuelve un double pero como lo quiero en un
		// int hago la refundición (int)
		System.out.println(resul);

		// Math.random genera números aleatoreos entre 0.0 y 1.0, pero devuelve un
		// doble.
		/*
		 * Si quisiera generar un número aleatoreo entre 0 y 100, primero lo
		 * multiplicaría por 100 para sacar un 34.3234234 por ejemplo y luego haría una
		 * refundición con un int para convertirlo a entero, pero la refundición sería
		 * de todo el resultado del (Math.random()*100).
		 */
		int aleatoreo = (int) (Math.random() * 100);
		System.out.println(aleatoreo);

	}
}
