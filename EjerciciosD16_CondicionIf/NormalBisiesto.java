package ejercicios_clase;

import java.util.Scanner;

public class NormalBisiesto {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el primer número:");
        int year = input.nextInt();
        
        double division = year % 4; 
        
        if(division == 0) {
        	
        	System.out.print("El año " +year +" es bisiesto");
        	
        }
        
        else {
        
        	System.out.print("El año " +year +" es no es bisiesto");
        }
     	 
        input.close();
	}

}
