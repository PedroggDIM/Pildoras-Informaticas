package POO_10_12_final_static;
// Si creamos varias clases en un fichero solo una es la principal y será la public
public class UsoEmpleados {

	public static void main(String[] args) {
		
		Empleados empleado1 = new Empleados("Ana");
		System.out.println(empleado1.getDatosEmpleado()); 
		empleado1.setSeccion("RRHH");
		System.out.println(empleado1.getDatosEmpleado()); 
		
		Empleados empleado2 = new Empleados("Antonio");
		System.out.println(empleado2.getDatosEmpleado());
		
		Empleados empleado3 = new Empleados("Lucas");
		System.out.println(empleado3.getDatosEmpleado());
		
		System.out.println(Empleados.getIdSiguiente());
		
	}

}

class Empleados{
	// final es una constante de la clase (el nombre no cambiará)
	private final String nombre;
	private String seccion;
	private int id;
	
	// Con el static la variable pertenece a la clase, no pertenece a ningún objeto
	//  a las variables static se les llama variables de clase (pertenecen a la clase)
	private static int IdSiguiente = 1;
	 
		
	// constructor
	public Empleados(String nombre) {		
		this.nombre = nombre;
		this.seccion = "Administracion"; //Esteblezco por defecto seccion = Adminstracion en todos los casos
		this.id = IdSiguiente;
		IdSiguiente++;
	}

	// metodo static pertenece a la clase
	public  static String getIdSiguiente() {
		return "El id del siguiente empleado será: " + IdSiguiente;
	}
	
	protected void setSeccion(String seccion) {
		this.seccion = seccion;
	}


	public String getDatosEmpleado() {
		return "Empleado " + nombre + ", seccion= " + seccion + ". Numeroid: " + id ;
	}
	
	
	
	
	
	
}