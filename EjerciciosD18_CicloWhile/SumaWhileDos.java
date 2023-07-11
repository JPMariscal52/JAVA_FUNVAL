package practica_Java_1;

import java.util.Scanner;

public class SumaWhileDos {
	
	
	public void sumaCiclo() {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Bienvenido a la calculadora While");

		int suma = 1;
		
		while (suma > 0) {
			
			System.out.println("Ingresa el primer número: ");
			int numUno = teclado.nextInt();
			System.out.println("Ingresa el segundo número: ");
			int numDos = teclado.nextInt();
			
			suma = numUno + numDos;
			
			System.out.println("El resultado es: "+ suma);
			System.out.println("");
			
		}
		teclado.close();
		
	}

}
