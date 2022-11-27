package POO_32_Programacion_Clases_Genericas;

public class UsoGenericaMia {

	public static void main(String[] args) {
		
      GenericaMia<String> miObjeto1 = new GenericaMia<String>();     
      miObjeto1.setObjeto("Juan");      
      System.out.println(miObjeto1.getObjeto());
      
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
