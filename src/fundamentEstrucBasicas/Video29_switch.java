package fundamentEstrucBasicas;

import javax.swing.JOptionPane;

public class Video29_switch {

	public static void main(String[] args) {
		// Con switch el valor a evaluar solo puede ser un char,
		// byte, short, int, string o enum
		int dato;
		dato = Integer.parseInt(JOptionPane.showInputDialog("Teclee un número entre 1 y 5: "));

		switch (dato) {
		case 1:
			JOptionPane.showMessageDialog(null, "Es el número 1");
			break;  // Con break rompo el flujo y selecciono este caso y no baja a los siguientes.
		case 2:
			JOptionPane.showMessageDialog(null, "Es el número 2");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Es el número 3");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Es el número 4");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Es el número 5");
			break;
		default:
			JOptionPane.showMessageDialog(null, "No está entre 1 y 5");
			break;

		}
	}

}
