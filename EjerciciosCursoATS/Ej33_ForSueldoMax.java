package programacion_ats;

import java.util.Scanner;

public class Ej33_ForSueldoMax {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int iteraciones, i=0;
		float sueldo, sueldoMayor = 0;
		
		System.out.println("¿Cuantos sueldos desea capturar?");
		iteraciones = teclado.nextInt();
		
		while (i < iteraciones) {
			
			System.out.println("Ingrese sueldo "+(i+1)+":");
			sueldo = teclado.nextFloat();
			
			if (sueldoMayor < sueldo) {
				sueldoMayor = sueldo;
			}
			
			i++;
		}
		
		System.out.println("El sueldo mayor es: $"+sueldoMayor);
		
		teclado.close();
		

	}

}
