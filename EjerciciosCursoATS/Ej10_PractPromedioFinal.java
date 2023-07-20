package programacion_ats;

import java.util.Scanner;

public class Ej10_PractPromedioFinal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		double participacion, examP1, examP2, examFinal, promedio;
		//double a, b, c, d;
		
		System.out.println("Ingresa el valor de tu participacion (puntos/20): ");
		participacion = teclado.nextDouble();
		
		System.out.println("Ingresa el valor de tu primer Examen Parcial (puntos/10): ");
		examP1 = teclado.nextDouble();
		
		System.out.println("Ingresa el valor de tu segundo Examen Parcial (puntos/10): ");
		examP2 = teclado.nextDouble();
		
		System.out.println("Ingresa el valor de tu Examen final (puntos/10): ");
		examFinal = teclado.nextDouble();
		
		//a = (participacion/20)*10;
		//b = (examP1/10)*25;
		//c = (examP2/10)*25;
		//d = (examFinal/10)*40;
		
		participacion *= 0.1;
		examP1 *= 0.25;
		examP2 *= 0.25;
		examFinal *= 0.40;
		
		//promedio = a+b+c+d;
		
		promedio = participacion + examP1 + examP2 + examFinal;
		
		System.out.println("Tu calificacion final es: "+promedio);
		
		teclado.close();

	}

}
