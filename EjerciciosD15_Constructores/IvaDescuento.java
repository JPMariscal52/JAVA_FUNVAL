package practica_Java_1;

import java.util.Scanner;

public class IvaDescuento {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		IvaOperacion descuento = new IvaOperacion();
		
		System.out.print("Ingresa el precio del articulo: ");
		double precio = input.nextDouble();
		
		descuento.operacion(precio);
		
		input.close();
	}

}
