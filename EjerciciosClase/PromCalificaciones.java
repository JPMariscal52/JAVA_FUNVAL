package ejercicios_clase;

import java.util.Scanner;

public class PromCalificaciones {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//double new_numero = 0;
 
		//double[] numeros = {6.35, 8.59, 7.74, 8.23, 9.41, 6.36, 7.23, 5.58, 8.85, 7.99, 9.02, 7.58, 9.32, 8.21, 8.89};
		//for(int i = 0; i < numeros.length; i++) {
			
			//double numero = numeros[i];
			//System.out.println("El número es:"+numero);	
			
			//double total = new_numero + numero;
			//System.out.println("El número es:"+total);
		//}

		for (int i = 0; i <= 10; i++) {
			
			System.out.println("Ingrese el primer número:");
	        int year = input.nextInt();
	        
	        System.out.println("El numero es"+ year);
	        
	        input.close();
			
		}

	}

}
