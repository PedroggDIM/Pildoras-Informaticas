package fundamentEstrucBasicas;

import javax.swing.JOptionPane;

public class Video27_if_anidados {

	public static void main(String[] args) {
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad: "));
		
		if(edad>=18) {
			String carnet=JOptionPane.showInputDialog("Tienes carnet (si) (no)? ");
			if(carnet.equals("si")) {
				JOptionPane.showMessageDialog(null, "Puedes comprar el coche");
			}else{
				
				JOptionPane.showMessageDialog(null, "No puedes comprar el coche");
			}			
		}else {
			JOptionPane.showMessageDialog(null, "Te quedas sin carnet y coche.");
		}

	}

}
