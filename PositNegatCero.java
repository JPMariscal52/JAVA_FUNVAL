package practica_Java_1;

import java.util.Scanner;

public class PositNegatCero {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el numero a evaluar: ");
        int numero = input.nextInt();
        
        if(numero != 0) {
        	
        	if(numero > 0) {
        		System.out.println("El número "+numero +" es positivo");
        	}
        	else {
        		System.out.println("El número "+numero +" es negativo");
        	}
        }
        else {
        	System.out.println("Este número es "+ numero);
        }

        input.close();

	}

}
