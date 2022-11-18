package POO_23_Clases_Abstractas;

// clase abstractas (tiene almenos 1 método abstracto)
public abstract class Personas {
	private String nombre;
    // constructor
	public Personas(String nombre) {		
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
    // metodo abstracto que solo se define, no se construye
	// hace a la clase abstracta
	public abstract String dameDescripcion();	
}
