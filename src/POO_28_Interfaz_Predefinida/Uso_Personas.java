package POO_28_Interfaz_Predefinida;
import java.util.Arrays;
import java.util.Date;
public class Uso_Personas {

	public static void main(String[] args) {

	    Empleados losEmpleados[] =new Empleados[5];
	    
	    losEmpleados[0] = new Empleados("Juan", new Date(652145), 2500);
	    losEmpleados[1] = new Empleados("María", new Date(652145), 1500);
	    losEmpleados[2] = new Empleados("Ana", new Date(652145), 3500);
	    losEmpleados[3] = new Empleados("Sandra", new Date(652145), 6000);
	    losEmpleados[4] = new Empleados("Antonio", new Date(652145), 2100);
	    
	    Arrays.sort(losEmpleados);
	    
	    for(Empleados e: losEmpleados) {
	    	System.out.println(e.dameDescripcion());
	    }	    
	}
}
