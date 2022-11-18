package POO_28_Interfaz_Predefinida;
import java.util.Date;

public class Jefes extends Empleados implements ParaJefes{
	
	private double incentivo;

	public Jefes(String nom, Date fechaAlta, double sueldo) {
		super(nom, fechaAlta, sueldo);		
	}	
	public void setincentivo(double incentivo) {
		this.incentivo = incentivo;
	}
///////////////////////////////////////////////////////////////	
	private String cargo; 
	
	// metodos que implementamos de la interfazParaJefes
	@Override
	public void setCargo(String cargo) {
		this.cargo = cargo;
		
	}
	@Override
	public String getCargo() {		
		return "\n Además tiene el cargo de " + cargo;
	}	
////////////////////////////////////////////////////////////
}
