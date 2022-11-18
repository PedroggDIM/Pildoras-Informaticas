package fundamentEstrucBasicas;

public class Video33_for {

	 public static void main(String args[]){
	        
	        for(int i=0;i<10;i++){
	            System.out.println("Pedro");
	           
	            //break; // con esta instrucción imprimiría Pedro la primera vez y se saldría.
	            // if(i==6) break; // le digo que cuando se cumpla esa condición se salga por 
	                               // lo que me imprimiría 0 2 4 6  
	        }
	    }
	}
	/*Sabiendo que i es 0, ejecuta lo que hay dentro del bucle for 10 veces, pues sabiendo que 
	empieza en cero y me lo vas sumando 1 en cada vuelta del bucle hasta que llegue al 10

	TAMBIÉN SE PUEDE ESCRIBIR:

	for(int i=10;i>0;i--) 
	La primera vez vale 10, luego 9, luego 8 y así hasta que valga >0 y ejecuta lo que se ponga 
	dentro del bucle esas veces.

	TAMBIÉN SE PUEDE ESCRIBIR:

	for(int i=0;i<20;i+=2){
	System.out.println("Pedro");}
	Empezando por 20 ejecuta lo que hay en el bucle 10 veces pues resta de dos en do

	*/