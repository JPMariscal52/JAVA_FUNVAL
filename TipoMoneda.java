package practica_Java_1;

public class TipoMoneda {
	
	double resultado;

	
	public void mensaje() {
	System.out.println("Selecciona una moneda");
	System.out.println("1-Soles");
	System.out.println("2-Pesos");
	System.out.println("3-Dolares");
	System.out.println("4-Quetzales");
	}
	
	public void conversion(int opcion, double monto) {
		if (opcion < 5 && opcion > 0) {
			if(opcion == 1) {
				resultado = monto * 1;
				System.out.println("Su monto total en Soles es: $" + resultado);	
			}//1
			else if(opcion == 2) {
				resultado = monto * 4.71;
				System.out.println("Su monto total en Pesos es: $" + resultado);
			}//2
			else if(opcion == 3) {
				resultado = monto * 0.28;
				System.out.println("Su monto total en Dolares es: $" + resultado);
			}//3
			else if(opcion == 4) {
				resultado = monto * 2.61;
				System.out.println("Su monto total en Quetzales es: $" + resultado);
			}//4
			
		}
		
		else {
			System.out.println("Introduzca una opción valida");
		}

	}
	
	public void conversion2(int opcion, double monto) {
		if (opcion < 5 && opcion > 0) {
			if(opcion == 1) {
				resultado = monto * 0.21;
				System.out.println("Su monto total en Soles es: $" + resultado);	
			}//1
			else if(opcion == 2) {
				resultado = monto * 1;
				System.out.println("Su monto total en Pesos es: $" + resultado);
			}//2
			else if(opcion == 3) {
				resultado = monto * 0.058;
				System.out.println("Su monto total en Dolares es: $" + resultado);
			}//3
			else if(opcion == 4) {
				resultado = monto * 0.46;
				System.out.println("Su monto total en Quetzales es: $" + resultado);
			}//4
			
		}
		
		else {
			System.out.println("Introduzca una opción valida");
		}

	}
	
	public void conversion3(int opcion, double monto) {
		if (opcion < 5 && opcion > 0) {
			if(opcion == 1) {
				resultado = monto * 3.63;
				System.out.println("Su monto total en Soles es: $" + resultado);	
			}//1
			else if(opcion == 2) {
				resultado = monto * 17.5;
				System.out.println("Su monto total en Pesos es: $" + resultado);
			}//2
			else if(opcion == 3) {
				resultado = monto * 1;
				System.out.println("Su monto total en Dolares es: $" + resultado);
			}//3
			else if(opcion == 4) {
				resultado = monto * 7.84;
				System.out.println("Su monto total en Quetzales es: $" + resultado);
			}//4
			
		}
		
		else {
			System.out.println("Introduzca una opción valida");
		}

	}
	public void conversion4(int opcion, double monto) {
		if (opcion < 5 && opcion > 0) {
			if(opcion == 1) {
				resultado = monto * 0.47;
				System.out.println("Su monto total en Soles es: $" + resultado);	
			}//1
			else if(opcion == 2) {
				resultado = monto * 2.18;
				System.out.println("Su monto total en Pesos es: $" + resultado);
			}//2
			else if(opcion == 3) {
				resultado = monto * 0.13;
				System.out.println("Su monto total en Dolares es: $" + resultado);
			}//3
			else if(opcion == 4) {
				resultado = monto * 1;
				System.out.println("Su monto total en Quetzales es: $" + resultado);
			}//4
			
		}
		
		else {
			System.out.println("Introduzca una opción valida");
		}

	}
}
