package POO_1_6_Constructor;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Vehiculos {
	
	private int ruedas; // private solo accesible desde la propia clase.
	private String color;
	private int largo;
	private double ancho;
	private int peso;
	private  boolean climatizador;
	private boolean tapiceria_cuero;
	private boolean gps;
      
	// metodo constructor
	public Vehiculos(int ruedas ) {
		this.ruedas = ruedas;
		largo = 2;
		ancho = 1;
		peso = 2;
		color = "sin color"; //Por defecto sin color.
		
	}
	//Sobrecarga de constructores (diferente numero de parametros)
	public Vehiculos(int ruedas, int largo, double ancho, int peso ) {
		this.ruedas = ruedas;
		this.largo = largo;
		this.ancho = ancho;
		this.peso = peso;
		color = "sin color";
		
	}
	
	
	
	
	//Video 8 sobrecarga de metodos
	//Si no pongo nada la variable boolean tiene valor false
	public void setExtra(boolean climatizador) {
		this.climatizador = climatizador;
	}
	//Es posible la sobrecarga de métodos siempre y cuando recitan un número diferente de argumentos.
	public void setExtra(boolean gps, boolean climatizador, boolean tapiceria_cuero) {
		this.gps = gps;
		this.climatizador = climatizador;
		this.tapiceria_cuero = tapiceria_cuero;
	}
	
	
	protected String getExtra() {
		if(climatizador && gps == false && tapiceria_cuero == false) {//climatizador es boolean y hay decimos lo mismo que (climatizador == true)
			return "Tu coche tiene el pack 1 de extras";
		}else if(climatizador && gps  && tapiceria_cuero ){
			return "Tu coche tiene el pack 2 de extras";
		}else {
			return "La combinación de extras no se admite";
		}	
			
	}
	protected void setClimatizador(boolean climatizador) {
		this.climatizador = climatizador;
	}
	// metodo de acceso setter
	public void setColor(String color) {
		this.color = color;  //this se refiere al campo de clase.
	}
	// metodo de acceso getter
	public String getColor() {
		return color;
	}
	public String getDatosVehiculo() {		
		return "Tu vehículo tiene " + ruedas + " ruedas. Además tiene " + largo + " m. de largo";
	}
	
}
