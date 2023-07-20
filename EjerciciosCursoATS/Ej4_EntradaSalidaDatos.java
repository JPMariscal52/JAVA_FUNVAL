package programacion_ats;

import java.util.Scanner;

public class Ej4_EntradaSalidaDatos {

	public static void main(String[] args) {
		
		//Declaramos tipo de variables a introducir por medio del usuario
		
		int numero;
		String texto;
		double decimal;
		
		//Introducimos informacion por medio de la funcion "Scanner"
		
		Scanner usuario = new Scanner(System.in);
		
		System.out.println("Introduce el numero: ");
		numero = usuario.nextInt();
		 usuario.nextLine();
		 
		 //Otras formas de capturar texto
		 //usuario.next() Esta funcion solo va a guardar la primer palabra de toda la cadena
		 //usuario.next().charAt(0) Esta funcion solo va a guardar el primer caracter
		
		System.out.println("Introduce el numero decimal");
		decimal = usuario.nextDouble();
		//Esta funcion sirve para que el Scanner pueda consumir otra linea que ingrese datos
		usuario.nextLine();
		
		System.out.println("Introduce el texto: ");
		texto = usuario.nextLine();
		
		
		
		System.out.println(numero);
		System.out.println(texto);
		System.out.println(decimal);
		
		usuario.close();      

	}

}
