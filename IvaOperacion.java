package practica_Java_1;

public class IvaOperacion {
	
	double total;
	double totalDescuento;
	
	
	public void operacion(double precio) {
		if(precio > 0 && precio <= 50 ) {
			total = precio + (precio*.16);
			totalDescuento = total - (total*0.05);
			System.out.println("El total de su compra con IVA es $" + total);
			System.out.println("El total de su compra con descuento del 5% es: $" + totalDescuento);
		}
		else if(precio > 0 && precio > 50 ){
			total = precio + (precio*0.16);
			totalDescuento = total - (total*0.10);
			System.out.println("El total de su compra con IVA es $" + total);
			System.out.println("El total de su compra con descuento del 10% es: $" + totalDescuento);
		}
	}

}
