package POO_32_Programacion_Parametros_Comodin;

public class Empleado {
   
	private String nombre;
	private int edad;	
	private double salario;
	
	
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public double getSalario() {
		return salario;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected void setEdad(int edad) {
		this.edad = edad;
	}
	protected void setSalario(double salario) {
		this.salario = salario;
	}
	public Empleado(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}	
	
	
	
	
}
