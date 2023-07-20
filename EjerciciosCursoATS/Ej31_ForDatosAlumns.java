package programacion_ats;

import java.util.Scanner;

public class Ej31_ForDatosAlumns {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int edad, cont_alt = 0, cont_edad = 0;
		float altura, suma_alt = 0, suma_edad = 0, media_alt, media_edad;
		
		for (int i=0; i<5;i++) {
			
			System.out.println("Ingrese edad de alumno "+(i+1)+":");
			edad = teclado.nextInt();
			System.out.println("Ingrese altura de alumno "+(i+1)+":");
			altura = teclado.nextFloat();
			
			if (edad >18) {
				cont_edad++;
			}
			if (altura > 1.75) {
				cont_alt++;
			}
			
			suma_alt += altura;
			suma_edad += edad;
			
		}
		
		media_alt = suma_alt/5;
		media_edad = suma_edad/5;
		
		System.out.println("Hay "+cont_edad+" alumnos mayores de 18 años");
		System.out.println("Hay "+cont_alt+" alumnos mayores de 1.75 m");
		System.out.println("La media de edad es: "+media_edad);
		System.out.println("La media de altura es: "+media_alt);
		
		teclado.close();

	}

}
