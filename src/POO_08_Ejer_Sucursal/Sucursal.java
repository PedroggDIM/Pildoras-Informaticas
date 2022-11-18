package POO_08_Ejer_Sucursal;

public class Sucursal {
	/*Enunciado
	 * Programa que simule una empresa de envío de paquetes. Dicha empresa tiene
	 * varias sucursales y puede enviar paquetes con diferente peso y diferente
	 * prioridad. 
	 * Clase Sucursal. Encargada de construir objetos de tipo Sucursal
	 *      Propiedades: ▪ Número de sucursal ▪ Dirección ▪ Ciudad 
	 *      Constructor: establece la dirección, ciudad y nº de sucursal 
	 *      Métodos: ▪ 3 getters para obtener nº de sucursal, dirección y ciudad 
	 *               ▪ Método setter calcula precio. Este método recibe por parámetro un objeto de tipo Paquete y
	 *                 calcula el precio del envío del paquete en función del peso del mismo y la
	 *                 prioridad del envío (0, 1 o 2 siendo estos 0=normal, 1=Alta y 2=Urgente).
	 *                   Prioridad 0 el precio no se altera. 
	 *                   Prioridad 1 el precio se incremente 10 €.
	 *                   Prioridad 2 el precio se incrementa 20 €.
	 */
	
	private int numeroSucursal;
	private String direccion;
	private String ciudad;
	
	// constructor
	public Sucursal(String direccion, String ciudad, int numeroSucursal) {		
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.numeroSucursal = numeroSucursal;		
	}
	
	// metodo setter calcula precio
		public void setCalculaPrecio(Paquete p) {
			double precio = 0;   // en funcion del peso y prioridad
			if(p.getPrioriEnvio() == 0) {
				p.setPrecio(0);
			}else if(p.getPrioriEnvio() == 1 ){
				p.setPrecio(precio +=10);
			}else if(p.getPrioriEnvio() == 2 ){
				p.setPrecio(precio +=20);
			}else {		
			} 		
		}
	// metodos accesores
	public int getNumeroSucursal() {
		return numeroSucursal;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	
	public double getPrecio(Paquete p) {
		return p.getPrecio();
	}
	
	protected void setNumeroSucursal(int numeroSucursal) {
		this.numeroSucursal = numeroSucursal;
	}
	protected void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	protected void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	@Override
	public String toString() {
		return "Sucursal [numeroSucursal=" + numeroSucursal + ", direccion=" + direccion + ", ciudad=" + ciudad + "]";
	}	
}
