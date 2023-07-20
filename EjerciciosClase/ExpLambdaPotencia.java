package ejercicios_clase;

import java.util.Scanner;
import java.util.function.Function;

public class ExpLambdaPotencia {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Ingresa un número entero: ");
		numero = teclado.nextInt();
		
		Function<Integer, Integer> doble = (num) -> (int) Math.pow(num, 2);
		int exp = doble.apply(numero);
		
		System.out.println("El número multiplicado por si mismo es: " + exp);

		teclado.close();

	}

}
