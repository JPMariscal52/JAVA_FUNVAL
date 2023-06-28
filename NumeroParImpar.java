package practica_Java_1;

import java.util.Scanner;

public class NumeroParImpar {

	public static void main(String[] args) {

Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el numero a evaluar: ");
        int numero = input.nextInt();
        
        double cociente = numero % 2;
        
        if(cociente == 0) {
        	System.out.println("El número "+numero+" es par");
        }
        else {
        	System.out.println("El número "+numero+" es impar");
        }
		
        
        
        
        
        
        
        input.close();
	}

}
