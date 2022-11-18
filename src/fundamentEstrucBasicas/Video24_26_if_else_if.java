package fundamentEstrucBasicas;
import java.util.Scanner;

public class Video24_26_if_else_if {
	 public static void main(String[] args) {
	       
	        Scanner teclado=new Scanner(System.in);
	        
	        System.out.println("Introduzca su edad por favor: ");
	        
	        int edad;
	        edad=teclado.nextInt();
	        
	        //if(distancia > 10 && renta < 20000)   // En este caso entraría en el if si las dos 
	                                               // condiciones se cumplen  con el && (y lógico)
	        
	        //if(distancia > 10 || renta<20000 || hermanos>=2)   //En este caso con el || (o lógico) con que
	                                                            //cumpla una de las tres opciones entra en el if     
	      
	        //if(!(distancia > 10 || renta<20000 || hermanos>=2)){	        
	          								//Con el ! antes del paréntesis hemos INVERTIDO el sentido 
	                                        //de la condición de forma que aquí decimos mira si la 
	        								//distancia al colegio NO es superior a 10 o la renta NO es superior a 2000
	                                        // o los hermanos NO son >=2
	        
	        /* El && o || si la primera condición se cumple o no, ya no pasa a las siguientes.
	         * El & o el | es igual pero evalúa todas las condiciones (se usan más en operaciones de bit a bit). 
	         */
	        
	        if(edad<18){
	            System.out.println("Es Ud. mayor de edad.");
	        }else if(edad<40){  
	            System.out.println("Eres maduro.");
	        }else if(edad<70){
	            System.out.println("Eres Senior."); //  tantos else if como quiera
	        }else{
	            System.out.println("Eres jubilado. Cuídate.");
	        }
	        
	    }    
}
