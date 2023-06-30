package practica_Java_1;

import java.util.Scanner;

public class FactorialDoWhileDos {

    int numero;
    int i;
    int display;
    
    public void pedirNumero() {
    	Scanner teclado = new Scanner(System.in);
        System.out.println("Cálculo de factorial");
        System.out.println("Ingresa el número para calcular su factorial");
        numero = teclado.nextInt();
        i=numero;
        display = numero;
        teclado.close();
        
    }

    public void calculoFactorial() {    
    	
    	pedirNumero();

        do {        
           	
        	procesoFactorial();
        	
        } while (i > 1 );
        
        System.out.println("El factorial de "+display+" es "+numero);
    }
    
    public void procesoFactorial() {
    	
    	i--;
    	numero *= i;
    	
    }

}

