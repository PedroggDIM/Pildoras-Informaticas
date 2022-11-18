package POO_15_Herencia;
import java.util.GregorianCalendar;

// Si creamos varias clases en un fichero solo una es la principal y será la public
public class UsoEmpleados {

	public static void main(String[] args) {
		
		Empleados Antonio = new Empleados("Antonio", 2300.5, 2005, 7, 15);	
		Jefes Ana = new Jefes("Ana", 2900, 2008, 8, 9);
		
		Ana.setIncentivo(150);
		System.out.println(Ana.getSueldo());		
		
	}
}
////////////////////////////////////////////////////////////////////////////
class Empleados{
	// final es una constante de la clase (el nombre no cambiará)
	private final String nombre;
	private double sueldo;
	//Clase de la api de java para facilitar fechas.
	GregorianCalendar calendario;  //pide anio, mes y dia, por eso lo pido en el constructor.
	private int id;
	
	// Con el static la variable pertenece a la clase, no pertenece a ningún objeto
	//  a las variables static se les llama variables de clase (pertenecen a la clase)
	private static int IdSiguiente = 1;
	
	 
		
	// constructor
	public Empleados(String nombre, double sueldo, int agno, int mes, int dia) {		
		this.nombre = nombre;	
		this.sueldo = sueldo;
		calendario = new GregorianCalendar(agno, mes, dia);
		this.id = IdSiguiente;
		IdSiguiente++;
		
	}

	// metodo static pertenece a la clase
	public  static String getIdSiguiente() {
		return "El id del siguiente empleado será: " + IdSiguiente;
	}

	public String getDatosEmpleado() {
		return "Empleado " + nombre + ". Numeroid: " + id ;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	public GregorianCalendar getFechaAlta() {
		return calendario;
	}
	// metodo que sube el salario a los empleados.
	public void setSubeSueldo(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo+=aumento;
	}	
}
////////////////////////////////////////////////////////////////////////////
class Jefes extends Empleados{
	
	private double incentivo;
	
// al heredar de Empleados hay que usar el constructor de Empleados.
	public Jefes(String nombre, double sueldo, int agno, int mes, int dia) {
		super(nombre, sueldo, agno, mes, dia);  // con el super llamamos al constructor de la clase padre.		
	}
	// los jefes pueden recibir un incentivo. Los empleados no
	public void setIncentivo(double b) {
		incentivo = b;
	}
	public double getSueldo() {
		double sueldoJefe = super.getSueldo();  // con super llamo al método getSueldo() de la clase padre.
		return sueldoJefe + incentivo;
	}	
	
}