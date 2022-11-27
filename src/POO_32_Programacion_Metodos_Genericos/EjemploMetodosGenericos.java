package POO_32_Programacion_Metodos_Genericos;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class EjemploMetodosGenericos {

	public static void main(String[] args) {
	
//Primero utilizo el método generico getElementos() con un Array de String.		
		String[] nombresPersonas = {"Sara", "Antonio", "Maria"};        		
		System.out.println(ExaminaArrays.getElementos(nombresPersonas));
		System.out.println(ExaminaArrays.getMenor(nombresPersonas));

//Utilizo el método generico con un Array de Empleados		
		Empleados[] losEmpleados = new Empleados[4];	
		losEmpleados[0] = new Empleados("Sonia",7, 5);
		losEmpleados[0] = new Empleados("Juan",17, 15);
		losEmpleados[0] = new Empleados("Pedro",5, 9);
		losEmpleados[0] = new Empleados("Ana",6, 13);
		System.out.println(ExaminaArrays.getElementos(losEmpleados));
		
		
	}
	
}


////  clase con METODO GENERICO   //////////////
class ExaminaArrays{
	
	// (RECIBE POR PARÁMETRO UN ARRAY )
	public static <T> String getElementos(T[] elArray) {		
		return "El array tiene " + elArray.length + " elementos.";
	}
	
	//Meotodo generico que nos da el valor mas cercano a la A
	public static <T extends Comparable> String getMenor(T[] elArray) {		
		T objetoMenor = elArray[0];
		for(int i =1 ; i<elArray.length ; i++) {
			if(objetoMenor.compareTo(elArray[i]) > 0) {
				objetoMenor = elArray[i];
			}
		}
		return  (String) objetoMenor;
	}
}
// clase
class Empleados{
	private String nombre;
	private double sueldo;	
	private int id;	
	
	public Empleados(String nombre, double sueldo, int id) {		
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public int getId() {
		return id;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	protected void setId(int id) {
		this.id = id;
	}	
}