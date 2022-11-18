package POO_28_Interfaz_Predefinida;
import java.util.Date;
// hereda de clase abstracta y está obligada a 
// sobreescribir su métodos abstracto

public class Empleados extends Personas implements Comparable{
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

@Override
public int compareTo(Object o) {
	
	Empleados otroEmpleado = (Empleados)o;
	if(this.sueldo<otroEmpleado.sueldo) {
		return -1;
	}else if(this.sueldo>otroEmpleado.sueldo){
		return 1;
	}else {
		return 0;
	}
 }	
}
