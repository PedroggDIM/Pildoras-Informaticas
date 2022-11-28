package POO_32_Programacion_Clases_Genericas;

// A partir del video 5.

public class GenericaMia<T> {
  
    private T objeto;
     		
	public GenericaMia() {
		objeto = null;
	}	
	public void setObjeto(T nuevoValor) {
		objeto = nuevoValor;
	}

	// metodo get devuelve un generico T
	public T getObjeto() {
		return objeto;
	}
	
	
	

	
}
