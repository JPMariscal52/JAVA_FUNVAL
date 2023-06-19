package practica_Java_1;

import java.util.Scanner;

public class Ejercicio_Practica_3 {
public static void main (String[] arg) {
		
		//Ejercicio-Calculo del área de un rectangulo

		Scanner input = new Scanner(System.in);
		System.out.print("Introduce el valor del lado A: ");
		double lado_a = input.nextDouble();
		System.out.print("Introduce el valor del lado B: ");
		double lado_b = input.nextDouble();
		
		double area = lado_a * lado_b;
		
		System.out.print("El área del rectangulo es: " + area + "m2");
		

	}
}