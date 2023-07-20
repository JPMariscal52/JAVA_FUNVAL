package programacion_ats;

import java.util.Scanner;

public class Ej32_ForTablasMult {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Bienvenido al programa de tablas de multiplicar");
		System.out.println("Ingrese un numero del 1 al 10 para imprimir su tabla: ");
		numero = teclado.nextInt();
		
		
		do {
			
			if(numero >= 1 && numero <=10) {
				for(int i=1; i < 11;i++) {
					System.out.println(numero +" x "+i+ " = "+ (i*numero));
				}
			}
			else {
				System.out.println("Ingrese un numero valido");
			}
			
			System.out.println("Ingrese un numero del 1 al 10 para imprimir su tabla: ");
			numero = teclado.nextInt();
		}
		
		while(numero != 0);
		
		teclado.close();

	}

}
