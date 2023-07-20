package programacion_ats;

import java.util.Scanner;

public class Ej6_OperadoresAritmeticos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float num1, num2, suma, resta, mult, div, rest;
		
		System.out.println("Ingrese numero 1: ");
		num1 = teclado.nextFloat();
		
		System.out.println("Ingrese numero 2: ");
		num2 = teclado.nextFloat();
		
		suma = num1 + num2;
		resta = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		rest = num1 % num2;
		
		System.out.println("El resultado de suma es: " + suma);
		System.out.println("El resultado de resta es: " + resta);
		System.out.println("El resultado de multiplicacion es: " + mult);
		System.out.println("El resultado de division es: " + div);
		System.out.println("El resultado de residuo es: " + rest);
		
		teclado.close();
	}

}
