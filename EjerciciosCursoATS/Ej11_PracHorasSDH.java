package programacion_ats;

import java.util.Scanner;

public class Ej11_PracHorasSDH {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int horasTotales, semanas, dias, horas;
		
		System.out.println("Ingrese el total de horas: ");
		horasTotales = teclado.nextInt();
		
		semanas = horasTotales / 168;
		dias = horasTotales%168 / 24;
		horas = horasTotales%24;
		
		System.out.println("El total de semanas son: "+semanas);
		System.out.println("El total de dias son: "+dias);
		System.out.println("El total de horas son: "+horas);
		
		teclado.close();

	}

}
