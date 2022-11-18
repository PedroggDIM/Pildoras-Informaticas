package fundamentEstrucBasicas;

import javax.swing.JOptionPane;

public class Video21_aJOptionPane {

	public static void main(String[] args) {
		
	    String nombre_usuario=JOptionPane.showInputDialog("Introduzca su nombre, por favor");
	     
	     /*ShowInputDialog devuelve un String, para cambiarlo a entero utilizo el método parseInt de la clase Integer.*/
	     
	   int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad, por favor"));
	     
	   System.out.println("Hola "+nombre_usuario+" tienes "+edad+" años");
	   System.out.println("Hola"+nombre_usuario+". El año que viene tendrás: "+(edad+1));

	}

}
