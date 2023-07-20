package programacion_ats;

public class Ej8_OpIncrementoDecremento {

	public static void main(String[] args) {
		
		int numero = 2;
		int numero2 = 2;
		int numero3 = 2;
		int numero4 = 2;
		
		//El resultado del incremento x++ no se vera reflejado ya que el operador matematico 
		//es un sufijo(Va despues de la variable)
		int x = numero++;
		//El operador matematico está como un prefijo ++x asi que se verá reflejada su funcion de
		//incremento en la variable
		int y = ++numero2;
		int a = numero3--;
		int b = --numero4;
		
		
		
		System.out.println("Variable numero vale: "+numero);
		System.out.println("Variable x(numero++) vale: "+x);
		System.out.println("Variable y(++numero) vale: "+y);
		System.out.println("Variable x(numero--) vale: "+a);
		System.out.println("Variable y(--numero) vale: "+b);

	}

}
