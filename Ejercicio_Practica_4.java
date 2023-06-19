package practica_Java_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio_Practica_4 {
public static void main (String[] arg) {
		
		//Ejercicio-Calculo del área de un circulo

		Scanner input = new Scanner(System.in);
		
		System.out.print("Ingrese la longitud del radio: ");
		double radio = input.nextDouble();
		
		double area = Math.PI * Math.pow(radio, 2);
		
		DecimalFormat formato = new DecimalFormat("#.00");
        String area_2d = formato.format(area);
        
        System.out.print("El área del circulo es: " + area_2d + " m2");

	}

}
