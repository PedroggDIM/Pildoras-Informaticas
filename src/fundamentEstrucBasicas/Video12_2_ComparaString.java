package fundamentEstrucBasicas;

import javax.swing.JOptionPane;

public class Video12_2_ComparaString {
	public static void main(String args[]) {

		// Tenemos 2 variables String y vamos a mostrar un mensaje que diga si son
		// iguales o diferentes.

		String A;
		String F;

		A = JOptionPane.showInputDialog(null, "Ingrese el String 1");
		// Usamos el método JOptionPane.showInputDialog(objecto, object01);
		F = JOptionPane.showInputDialog(null, "Ingrese el String 2");

		if (A.equals(F)) {
			JOptionPane.showMessageDialog(null, "Son iguales");
		} else {
			JOptionPane.showMessageDialog(null, "Son diferentes");

		}

	}
}
