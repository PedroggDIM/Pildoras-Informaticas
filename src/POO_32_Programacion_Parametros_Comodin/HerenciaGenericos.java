package POO_32_Programacion_Parametros_Comodin;

public class HerenciaGenericos {

	public static void main(String[] args) {
	
	/*	Empleado Empleado15248;
		Jefe Sara = new Jefe("Sara", 27, 3750);
		
		// Jefe hereda de Empleado.
		Empleado15248 = Sara; 
   */
		
		VariosTipos<Empleado> Empleado15248 = new VariosTipos<Empleado>();
		VariosTipos<Jefe> Sara = new VariosTipos<Jefe>();
		
		//Empleado15248 = Sara;
		
		VariosTipos.imprimirTrabajador(Empleado15248);
//El metodo no puede imprimri a Sara porque en genericos no funciona la herencia
// por eso se usa el parametro comodin ? extends y ya vale para cualquier clase
// que herede de empleado		
		VariosTipos.imprimirTrabajador(Sara);
		
	}

}
