package POO_32_Programacion_Clases_Genericas;

public class UsoGenericaMia {
	public static void main(String[] args) {
		
// de primeras GenericaMia maneja un objeto de tipo String	
		//Aquí en el constructor le doy el valor null al crear el objeto
      GenericaMia<String> miObjeto1 = new GenericaMia<String>(); 
     //establezco un nuevo valor 
      miObjeto1.setObjeto("Juan");      
      System.out.println(miObjeto1.getObjeto());
      
  // ahora un objeto Persona // abajo creo la clase Persona   
      GenericaMia<Persona> miObjeto2 = new GenericaMia<Persona>();
      Persona ella = new Persona("Maria");
      miObjeto2.setObjeto(ella);
      System.out.println(miObjeto2.getObjeto());      
	}
}
// creo la clase Persona
class Persona{
		private String nombre;
	
	public Persona(String nombre) {	
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}	
}
