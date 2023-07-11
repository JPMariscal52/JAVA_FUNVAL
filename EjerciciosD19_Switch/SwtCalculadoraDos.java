package practica_Java_1;

import java.util.Scanner;

public class SwtCalculadoraDos {

	double n1, n2, resultado;
	int operacion;
	String mensaje;
	
	public void solicitarDatos() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bienvenido a tu calculadora Switch");
		
		System.out.println("Ingresa en primer numero: ");
		n1 = teclado.nextDouble();
		System.out.println("Ingresa en primer numero: ");
		n2 = teclado.nextDouble();
		
        System.out.println("Selecciona el menu que deseas: ");
        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicacion");
        System.out.println("4-Division");
        operacion = teclado.nextInt();
        
        teclado.close();
		
	}
	
	public void calculos() {
		
		solicitarDatos();
		
		switch (operacion) {
		
		case 1:
            suma();
            break;
        case 2:
        	resta();
            break;
        case 3:
        	multiplicacion();
            break;
        case 4:
        	division();
            break;
        
    }
    
    System.out.println(mensaje);
    System.out.println(resultado);
 
		
	}
	
	public void suma() {
		resultado = n1 + n2;
		mensaje = "El resultado de la suma es:";
	}
	
	public void resta() {
		resultado = n1 - n2;
		mensaje = "El resultado de la resta es:";
	}
	
	public void multiplicacion() {
		resultado = n1 * n2;
		mensaje = "El resultado de la multiplicacion es:";
	}
	
	public void division() {
		resultado = n1 / n2;
		mensaje = "El resultado de la division es:";
	}

}