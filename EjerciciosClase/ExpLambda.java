package ejercicios_clase;

import java.util.Scanner;
import java.util.function.Function;

public class ExpLambda {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String palabra;
		
		System.out.println("Ingresa un palabra en mayusculas: ");
		palabra = teclado.nextLine();
		
		Function<String, String> cambio = (word) -> word.toLowerCase();
		String minuscula = cambio.apply(palabra);
		
		System.out.println("La palabra en minuscula es:" + minuscula);

		teclado.close();
	}

}
