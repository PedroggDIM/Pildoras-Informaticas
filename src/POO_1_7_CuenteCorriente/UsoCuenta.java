package POO_1_7_CuenteCorriente;

public class UsoCuenta {

	public static void main(String[] args) {
		
       CuentaCorriente Cuenta1 = new CuentaCorriente("Antonio",1500);
       CuentaCorriente Cuenta2 = new CuentaCorriente("Juan", 2500);
       
       CuentaCorriente.transferenciaCuentas(Cuenta1, Cuenta2, 200);
       System.out.println(Cuenta1.getDatosgenerales());
       System.out.println(Cuenta2.getDatosgenerales());

	}

}
