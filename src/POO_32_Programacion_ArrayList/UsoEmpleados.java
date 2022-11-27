package POO_32_Programacion_ArrayList;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
// Si creamos varias clases en un fichero solo una es la principal y será la public
public class UsoEmpleados {

	public static void main(String[] args) {
				
		ArrayList<Empleados> listaEmpleados = new ArrayList<Empleados>();
		
		listaEmpleados.add(new Empleados("Sonia", 2300.5, 2005, 7, 5));
		listaEmpleados.add(new Empleados("Ana", 2500, 2010, 8, 6));
		listaEmpleados.add(new Empleados("Pedro", 1500.5, 2000, 10, 4));
		listaEmpleados.add(new Empleados("Lucas", 230, 2700, 17, 15));
	
		 for(Empleados obj:listaEmpleados){
             System.out.println("Empleado: " + obj.getDatosEmpleado() +
            		 " y un salario de: " + obj.getSueldo() );
         }
		 
		 //SE PUEDE RECORRER CON UN BUCLE for each o con un Iterator:
		 
		 System.out.println("***Recorro con un ITERADOR***");
		 //Recorro con un Iterador
		 Iterator<Empleados> iteradorEmpleados = listaEmpleados.iterator();
		 while(iteradorEmpleados.hasNext()) System.out.println(iteradorEmpleados.next());
		 
		 
		 
		 
		 
	}
}
////////////////////////////////////////////////////////////////////////////
class Empleados{

	private final String nombre;
	private double sueldo;	
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
