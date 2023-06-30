package practica_Java_1;

import java.util.Scanner;

public class NumeroNegDos {
	
	
	
	public void numeroNegativo() {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero = 1;
		
		while (numero > 0 || numero < -5) {
			
			System.out.println("Ingresa un número: ");
			numero = teclado.nextInt();
			
			System.out.println("Bien por el numero "+numero);
		}
		
		teclado.close();
	}
	
		

}
