package programacion_ats;

public class Ej2_TiposDatos {

	public static void main(String[] args) {

		//Tipos de datos primitivos
		
		double numerod;
		float numerof;
		int numeroi;
		byte numerob;
		char palabrac;
		boolean condiciont;
		boolean condicionf;
		
		numerod = 65.256; //Este tipo de dato ocupa una gran cantidad en memoria.
		numerof = 45.23f; //Los números tipo float deben tener la "f" escrita al final.

		numeroi = 546; //Dato tipo int acepta valores grandes
		numerob = 127; //Dato tipo byte no puede sobrepasar el valor de 127
		
		palabrac = 'a'; //Char solo puede aceptar un caracter
		
		condiciont = true; //True hace verdadera un condicion, tipo de dato booleano.
		condicionf = false; //False hace falsa una condicion, tipo de dato booleano.
		
		System.out.println("Este es el numero decimal tipo double: "+numerod);
		System.out.println("Este es el numero decimal tipo float: "+numerof);
		
		System.out.println("Este es el numero entero tipo int: "+numeroi);
		System.out.println("Este es el numero entero tipo byte: "+numerob);
		
		System.out.println("Este es un dato de texto tipo char: "+palabrac);
		
		System.out.println("Este es dato booleano: "+condiciont);
		System.out.print("Este es un dato booleano: "+condicionf);

	}

}
