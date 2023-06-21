package practica_Java_1;

import java.util.Scanner;

public class Ejercicio_Practica_5 {
	
	private int numero;
	
	public void incrementarNumero() {
		numero++;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Ejercicio_Practica_5 identificador = new Ejercicio_Practica_5();
		
		System.out.print("Ingresa el valor inicial: ");
        identificador.numero = scanner.nextInt();
		
		
		System.out.println("El valor inicial es " + identificador.numero);
		
		identificador.incrementarNumero();
		
		System.out.println("El valor actualizado es " + identificador.numero);
		
		scanner.close();	
	}
}
