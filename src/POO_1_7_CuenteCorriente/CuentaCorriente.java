package POO_1_7_CuenteCorriente;

import java.util.Random;

public class CuentaCorriente {
    // atributos 
	private double saldo;
    private String nombreTitular;
    private long numeroCuenta;
 
 // genero numero aleatorio para numeroCuenta 
 Random numAleatorio = new Random(); 
 // Numero entero entre 25000 y 75750000000
 Long n = (long) (numAleatorio.nextInt(750000000-25000+1) + 25000);
    
    // constructor con dos parámetros
	public CuentaCorriente(String nombreTitular, double saldo) {
		this.nombreTitular = nombreTitular;
		this.saldo = saldo;		
		numeroCuenta = n;
	}
	
	// metodo de acceso setter de ingreso
		public void setIngreso(double ingreso) {			 
			if(saldo < 0) {
				System.out.println("No es posible ingresar negativos");				
			}
			saldo += ingreso;
			//saldo = saldo + ingreso;			  
		}
    // metodo para sacar dinero    
		public void setReintegro(double reintegro) {
			if(reintegro < saldo) {
				saldo -= reintegro;
				//saldo = saldo - reintegro;
			}else {
				System.out.println("No es posible el reintegro.");
			}			
		}
		
		// metodos getter
		public String getSaldo() {
			return "El saldo es: " + saldo;
		}
		
		public String getDatosgenerales() {
			return "Nombre " + nombreTitular + "\n Saldo: " + saldo + "\n Numero cuenta: "+ numeroCuenta; 
		}
        // metodo para transferencias de una cuenta a otra
		// el metodo es static porque pertenece a la propia clase.
		public static void transferenciaCuentas(CuentaCorriente titu1, CuentaCorriente titu2, double cantidad) {
			titu1.saldo = titu1.saldo - cantidad;  // titu1.saldo -= cantidad;
			titu2.saldo = titu2.saldo + cantidad;
		}
 
}
