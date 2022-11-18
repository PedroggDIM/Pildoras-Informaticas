package fundamentEstrucBasicas;

import java.util.Scanner;

public class Video22_if_ordena3num {

	 public static void main(String[] args) {
	     //Pedir 3 num y mostrarlos ordenados de mayor a menor
	     Scanner teclado=new Scanner(System.in);
	        double num1, num2,num3;
	                
	        System.out.println("Introduzca el num1: ");
	        num1=teclado.nextDouble();
	        System.out.println("Introduzca el num2: ");
	        num2=teclado.nextDouble();
	        System.out.println("Introduzca el num3: ");
	        num3=teclado.nextDouble();
	        
	        if(num1>num2&&num2>num3){
	            System.out.println("------------------------------------");
	            System.out.println("Números ordenados de mayor a menor: ");
	            System.out.println(num1); 
	            System.out.println(num2);
	            System.out.println(num3);
	        }if(num2>num1&&num1>num3){
	             System.out.println("------------------------------------");
	             System.out.println("Números ordenados de mayor a menor: ");
	            System.out.println(num2); 
	            System.out.println(num1);
	            System.out.println(num3);
	        }if(num3>num2&&num2>num1){
	             System.out.println("------------------------------------");
	            System.out.println("Números ordenados de mayor a menor: ");
	            System.out.println(num3); 
	            System.out.println(num2);
	            System.out.println(num1);
	       }    
	    }

}
