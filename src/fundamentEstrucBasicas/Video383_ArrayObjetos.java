package fundamentEstrucBasicas;

import java.util.Scanner;

public class Video383_ArrayObjetos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Alumno[] a = new Alumno[2];

		String nombre;
		int matricula;
		char grupo;
		int grado;

		for (int i = 0; i < a.length; i++) {
			System.out.println("Ingresa el nombre: ");
			nombre = teclado.nextLine();
			System.out.println("Ingresa la matrícula: ");
			matricula = teclado.nextInt();
			System.out.println("Ingresa el grupo: ");
			grupo = teclado.next().charAt(0);
			System.out.println("Ingresa el grado: ");
			grado = teclado.nextInt();
			teclado.nextLine();

			a[i] = new Alumno(nombre, matricula, grupo, grado);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(
					a[i].getNombre() + " " + a[i].getMatricula() + " " + a[i].getGrupo() + " " + a[i].getGrado());
		}
	}
}

//-------------------------------------------------------------------------------
class Alumno {
	private String nombre;
	private int matricula;
	private char grupo;
	private int grado;

	public Alumno(String nombre, int matricula, char grupo, int grado) {
		this.nombre = nombre;
		this.matricula = matricula;
		this.grupo = grupo;
		this.grado = grado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public char getGrupo() {
		return grupo;
	}

	public void setGrupo(char grupo) {
		this.grupo = grupo;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

}
