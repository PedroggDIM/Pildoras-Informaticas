package POO_31_Herencia_Interfaces;
public class Alumnos extends Personas{    
	private String a_optativas;
	private String aula;	
	// constructor
	public Alumnos(String nombre, String optativas, String aula) {
		super(nombre);
		this.a_optativas = optativas;
		this.aula = aula;
	}	
    // metodo que sobreescribe de la clase Personas
	@Override
	public String dameDescripcion() {		
		return "El alumno " + this.getNombre() + " está en el aula " + 
	    aula + " ha escogido la asignatura " + a_optativas;
	}
}
