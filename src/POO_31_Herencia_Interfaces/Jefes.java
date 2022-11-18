package POO_31_Herencia_Interfaces;
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
	@Override
	public double setBonus(double gratificacion) {
		double prima = 2000;
		return prima + gratificacion + ParaTrabajadores.bonus;
	}	
	
////////////////////////////////////////////////////////////
}
