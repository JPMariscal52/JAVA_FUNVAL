package practica_Java_1;

import java.util.Scanner;

public class Ejercicio_Practica_2 {

	public static void main (String[] arg) {
		
		//Ejercicio-Conversión de temperatura

		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese la temperatura en grados Celsius: ");
        double grados_c = input.nextDouble();

        double grados_f = (grados_c * (9 / 5)) + 32;

        System.out.println("La temperatura en grados Fahrenheit es: " + grados_f);
	}

}