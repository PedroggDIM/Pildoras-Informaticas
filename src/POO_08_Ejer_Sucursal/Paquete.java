package POO_08_Ejer_Sucursal;

public class Paquete {
	/*
	 * Encargada de construir objetos de tipo Paquete:
	 *  Propiedades: ▪ Referencia del envío ▪ Peso ▪ DNI del remitente
	 *               ▪ Prioridad del envío puede ser 0, 1 y 2 (Normal, Alta, Urgente).
	 *  Constructor:  Encargado de establecer las propiedades a los valores elegidos
	 *  Métodos: ▪ 2 setters para modificar (si se quiere) peso y prioridad 
	 *           ▪ 2 getters para obtener peso y prioridad.
	 */
	
	private String referEnvio;
	private double peso;
	private String dni;
	private int prioriEnvio;
	private double precio;
	
	// constructor 	
	public Paquete(String referEnvio, double peso, String dni, int prioriEnvio) {		
		this.referEnvio = referEnvio;
		this.peso = peso;
		this.dni = dni;
		this.prioriEnvio = prioriEnvio;
	}
	// metodos de acceso
	protected void setPeso(double peso) {
		this.peso = peso;
	}	
	public double getPeso() {
		return peso;
	}
	
	protected void setPrioriEnvio(int prioriEnvio) {
		this.prioriEnvio = prioriEnvio;
	}

	protected int getPrioriEnvio() {
		return prioriEnvio;
	}

	@Override
	public String toString() {
		return "Paquete [referEnvio=" + referEnvio + ", peso=" + peso + ", dni=" + dni + ", prioriEnvio=" + prioriEnvio
				+ "]";
	}


	protected double getPrecio() {
		return precio;
	}

	protected void setPrecio(double precio) {
		this.precio = precio;
	}
		
	//public String getPrioriEnvio() {
	//	if(prioriEnvio == 0) {
	//		return "Normal";
	//	}else if(prioriEnvio == 1 ){
	//		return "Prioridad de envio alta";
	//	}else if(prioriEnvio == 2 ){
	//		return "Prioridad de envio urgente";
	//	}else {
	//		return "Introduce una prioridad No valida";
	//	}
	//}	
}
