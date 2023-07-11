package practica_Java_1;

import java.util.Scanner;

public class Ejercicio_Practica_6 {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int n1 = input.nextInt();

        System.out.println("Ingrese el segundo número:");
        int n2 = input.nextInt();

        System.out.println("Ingrese el tercer número:");
        int n3 = input.nextInt();

        int numero_mayor = valor_Mayor(n1, n2, n3);
        int numero_menor = valor_Menor(n1, n2, n3);
        
        System.out.println("El número mayor es: " + numero_mayor);
        System.out.println("El número menor es: " + numero_menor);
        
        input.close();

}
	
	 public static int valor_Mayor(int a, int b, int c) {
	        int mayor = a;

	        if (b > mayor) {
	            mayor = b;
	        }

	        if (c > mayor) {
	            mayor = c;
	        }

	        return mayor;
	    }
	 
	 public static int valor_Menor(int a, int b, int c) {
	        int menor = a;

	        if (b < menor) {
	            menor = b;
	        }

	        if (c < menor) {
	            menor = c;
	        }

	        return menor;
	    }
	 
}
