package POO_21_Casting_Objetos;
import java.util.GregorianCalendar;
// Si creamos varias clases en un fichero solo una es la principal y será la public
public class UsoEmpleados {

	public static void main(String[] args) {
		
		Jefes Juan = new Jefes("Juan", 8000, 2013, 8, 5);
		Juan.setIncentivo(200);
			
		Empleados[] losEmpleados = new Empleados[6];
		losEmpleados[0] = new Empleados("Antonio", 2300.5, 2005, 7, 5);
		losEmpleados[1] = new Empleados("Carlos", 5000.5, 2007, 6, 5);
		losEmpleados[2] = new Empleados("Maria", 2500.5, 2006, 11, 5);
		losEmpleados[3] = new Empleados("Ana", 7000, 2009, 5, 3);
		losEmpleados[4] = Juan;  
		losEmpleados[5] = new Jefes("Isabel", 8000, 2007, 4, 2);
// hago un casting de objetos.		
		Jefes Isabel = (Jefes)losEmpleados[5];
		Isabel.setIncentivo(500);
		
	     /*	
		Empleados Patricia = new Jefes("Patricia", 2500, 2007, 5, 6);
		Jefes PatriciaSecretaria = (Jefes)Patricia;
		*/
		
		 for(Empleados obj:losEmpleados){
             System.out.println("Empleado: " + obj.getDatosEmpleado() +
            		 " y un salario de: " + obj.getSueldo() );
         } 		
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