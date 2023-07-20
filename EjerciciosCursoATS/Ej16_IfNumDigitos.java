package programacion_ats;

import java.util.Scanner;

public class Ej16_IfNumDigitos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número entre 0 y 99999: ");
        int numero = teclado.nextInt();

        // Validar que el número esté dentro del rango permitido
        if (numero >= 0 && numero <= 99999) {
        	
            int cantidadDigitos = contarDigitos(numero);
            System.out.println("El número ingresado tiene " + cantidadDigitos + " dígitos.");
            
        } else {
        	
            System.out.println("El número ingresado está fuera del rango permitido.");
        }

        teclado.close();
    }

    public static int contarDigitos(int numero) {
    	
        // Caso especial para el número 0, ya que el método log10 no funciona para 0
        if (numero == 0) {
        	
            return 1;
        }
        
        else {
        	
        	// Utilizamos la fórmula: cantidad de dígitos = piso(log10(numero)) + 1
            int cantidadDigitos = (int) Math.floor(Math.log10(numero)) + 1;
            return cantidadDigitos;
        	
        }

        
    }
}
