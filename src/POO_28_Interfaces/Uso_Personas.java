package POO_28_Interfaces;
import java.util.Date;
public class Uso_Personas {

	public static void main(String[] args) {
// NO SEPUEDE INSTANCIAR UNA CLASE ABSTRACTA, LO SIGUIENTE DARÍA ERROR//		
		//Personas juan = new Personas("Juan");
		
		//Si se puede hacer Personas Juan.
		
	Empleados Juan = new Empleados("Juan", new Date(5465454), 2500);
	System.out.println(Juan.getNombre());
	System.out.println(Juan.dameDescripcion());

	Jefes Ana = new Jefes("Ana", new Date(654546), 3500);
	System.out.println(Ana.getNombre());
	System.out.println(Ana.dameDescripcion());
	
	Ana.setCargo("Directora Comercial");
	System.out.println(Ana.getCargo());
	
	
	Alumnos Maria = new Alumnos("María", "Dibujo", "Aula 5");
	System.out.println(Maria.getNombre());	
	System.out.println(Maria.dameDescripcion());
	
	Jefes David = new Jefes("David", new Date (654165), 4800);
	David.setCargo("Director  RRHH");
	System.out.println(David.getNombre());
	System.out.println(David.dameDescripcion() + David.getCargo());
	
	
	}
}
