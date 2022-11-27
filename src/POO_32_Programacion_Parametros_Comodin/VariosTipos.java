package POO_32_Programacion_Parametros_Comodin;

public class VariosTipos<T> {
	
	private T primero;
	
	public VariosTipos() {
		primero = null;
	}
/*	
	public static void imprimirTrabajador(VariosTipos<Empleado> e) {		
		Empleado primero = e.getPrimero();
		System.out.println(primero);
	}
*/	
	// le digo que puedo pasar por parámetro no solo objetos de la clase Empleado
	// sino cualquier tipo que herede de Empleado.
	public static void imprimirTrabajador(VariosTipos<? extends Empleado> e) {		
		Empleado primero = e.getPrimero();
		System.out.println(primero);
	}
	
	public void setPrimero(T nuevoValor) {
		primero = nuevoValor;
	}
	
	public T getPrimero() {
		return primero;
	}	
 
}
