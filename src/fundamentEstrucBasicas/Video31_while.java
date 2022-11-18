package fundamentEstrucBasicas;

import javax.swing.JOptionPane;

public class Video31_while {

	public static void main(String[] args) {
  // Bucle while.
        
        String nombre="Pedro";
        String clave="";
        
        while(nombre.equals(clave)==false){  //Mientras que sean diferentes, haz lo de dentro del bucle while.
            clave=JOptionPane.showInputDialog("Introduzca la clave por favor");
            if(nombre.equals(clave)==false){
                System.out.println("Contraseña incorrecta");
              }
        }
        System.out.println("Contraseña correcta, acceso permitido");
	}

}
