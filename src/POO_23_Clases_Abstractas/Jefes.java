package POO_23_Clases_Abstractas;
import java.util.Date;

public class Jefes extends Empleados{
	
	private double incentivo;

	public Jefes(String nom, Date fechaAlta, double sueldo) {
		super(nom, fechaAlta, sueldo);		
	}	
	public void setincentivo(double incentivo) {
		this.incentivo = incentivo;
	}
}
