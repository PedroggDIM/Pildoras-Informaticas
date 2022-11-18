package POO_28_Interfaces;
import java.util.Date;
// hereda de clase abstracta y está obligada a 
// sobreescribir su métodos abstracto
public class Empleados extends Personas {
    private double sueldo;
    private Date fechaAlta; 
    // constructor de la clase	
	public Empleados(String nom, Date fechaAlta, double sueldo) {
		super(nom);
		this.fechaAlta = fechaAlta;
		this.sueldo = sueldo;
	}
	

//metodo que sobreescribimos al heredar de personas(en Personas es abstract)	
	@Override  
	public String dameDescripcion() {		
		return "El empleado " + this.getNombre() + " tiene un sueldo de "
	          + sueldo + " y entro a trabajar en " + fechaAlta;
	}	
}
