package practica_Java_1;

import java.util.Scanner;

public class ConversionMonedas {
	
	public static void main(String[] args) {
	
	
	Scanner input = new Scanner(System.in);
	TipoMoneda moneda1 = new TipoMoneda();
	TipoMoneda moneda2 = new TipoMoneda();
	TipoMoneda moneda3 = new TipoMoneda();
	TipoMoneda moneda4 = new TipoMoneda();
	
	
	System.out.println("Calculadora de conversión de monedas");
	System.out.println("Selecciona la moneda a ingresar: ");
	System.out.println("1-Soles");
	System.out.println("2-Pesos");
	System.out.println("3-Dolares");
	System.out.println("4-Quetzales");
	
	int moneda = input.nextInt();
	
	System.out.println("Ingrese el monto a convertir");
	double monto = input.nextDouble();
	
	if (moneda < 5 && moneda > 0) {
		if(moneda == 1) {
			moneda1.mensaje();
			int opcion = input.nextInt();
			moneda1.conversion(opcion, monto);
		}//1 Soles
		else if(moneda == 2) {
			moneda2.mensaje();
			int opcion = input.nextInt();
			moneda2.conversion2(opcion, monto);	
		}//2 Pesos
		else if(moneda == 3) {
			moneda3.mensaje();
			int opcion = input.nextInt();
			moneda3.conversion3(opcion, monto);
		}//3 Dolares
		else if(moneda == 4) {
			moneda4.mensaje();
			int opcion = input.nextInt();
			moneda4.conversion4(opcion, monto);
		}//4 Quetzales
		
	}
	
	else {
		System.out.println("Introduzca una opción valida");
	}

    input.close();
}
}
