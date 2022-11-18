package POO_08_Ejer_Sucursal;

public class Uso_Sucursal_y_Paquetes {

	public static void main(String[] args) {
		 
		/* con los datos de la sucursal y de dos paquetes 
		 * el programa imprimirá en consola los datos de la sucursal (Nº, Dirección y Ciudad)
		 *  y los datos de cada paquete (Referencia, Peso, Prioridad y Precio)
		 *  AUNQUE AQUÍ LOS METO EN EL CONSTRUCTOR, EN LA SOLUCIÓN DE PÍLDORAS SE 
		 *  VÉ CÓMO METE LOS DATOS DE CADA PAQUETE CON UN FOR
		 */
		 int numeroDePaquete = 2;  
		
        Sucursal sucursal_1 = new Sucursal("Calle Larga", "Segovia", 40);
         Paquete paquete_1 = new Paquete("ref1234", 1, "70245218", 1);
         Paquete paquete_2 = new Paquete("ref457", 1.2, "70245218", 2);
         
         System.out.println("Datos de la sucursal:");
         System.out.println(sucursal_1.toString());
         
         System.out.println(paquete_1.toString());
         sucursal_1.setCalculaPrecio(paquete_1);
         System.out.println("El precio del paquete es: " + sucursal_1.getPrecio(paquete_1));
         
         
         System.out.println(paquete_2.toString());
         sucursal_1.setCalculaPrecio(paquete_2);
         System.out.println("El precio del paquete es: " + sucursal_1.getPrecio(paquete_2));
	}
	     
	     
         
}
