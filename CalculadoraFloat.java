package practica_Java_1;

import java.util.Scanner;

public class CalculadoraFloat {
	
	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in);
		
		Operaciones operacion = new Operaciones();
		
		System.out.println("Ingrese el primer número:");
        double numero1 = input.nextDouble();
        System.out.println("Ingrese el primer número:");
        double numero2 = input.nextDouble();
		
		operacion.suma(numero1, numero2);
		operacion.resta(numero1, numero2);
		operacion.multiplicacion(numero1, numero2);
		operacion.division(numero1, numero2);
		
		System.out.println("El resultado de la suma es: "+ operacion.suma);
		System.out.println("El resultado de la resta es: "+ operacion.resta);
		System.out.println("El resultado de la multiplicacion es: "+ operacion.multiplicacion);
		System.out.println("El resultado de la division es: "+ operacion.division);
		
		input.close();
		
	}

}
