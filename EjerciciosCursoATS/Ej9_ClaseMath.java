package programacion_ats;

public class Ej9_ClaseMath {

	public static void main(String[] args) {

		//Calcular la raiz cuadrada con el metodo sqrt()
		//Este metodo debe ser almacenado en un dato tipo double
		double raiz = Math.sqrt(9);
		System.out.println("La raiz cuadrada de"+" 9 es: "+raiz);
		//Puedes trasformar el dato de double a int con la siguiente sintaxis
		//int raiz = (int) Math.sqrt()
		//Esto sería factible usarlo si tus raices son enteras, asi que recomendado usar double
		
		//Calcular la potencia con el metodo pow()
		//Este metodo debe ser almacenado en un dato tipo double
		double potencia = Math.pow(5, 2);
		System.out.println("El numero 5 elevado al cuadrado es: "+potencia);
		
		//Redondear un numero con el metodo round()
		//Si vas a redondear un dato double, la variable que recibe el resultado debe ser long
		double num = 5.236;
		long redondeo = Math.round(num);
		System.out.println("El redondeo de "+num+" es "+redondeo+"(double/long)");
		//Si vas a redondear un dato float, la variable que recibe el resultado debe ser int
		float num2 = 5.236f;
		int redondeo2 = Math.round(num2);
		System.out.println("El redondeo de "+num+" es "+redondeo2+"(float/int)");
		
		//Obtener un numero aleatorio por medio del metodo random()
		double numero = Math.random();
		System.out.println("El numero aleatorio es "+numero);
	}

}
