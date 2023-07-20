package programacion_ats;

public class Ej35_Arreglos {

	public static void main(String[] args) {
		
		//Un arreglo es un contenedor de datos del mismo tipo con un tamaño (cantidad de espacios) ya definido
		
		//La declaracion de un arreglo es la siguiente:
		//Tipo_de_variable[] + Nombre_del_arreglo = new Tipo_de_variable[Dimension]
		
		//Ejemplos
		int[] edad = new int[5]; //Tambien se puede llenar de manera directa int[] edad = {1,2,3,4,5}
		//long[] edades = new long[8];
		//float[] calificaciones = new float[10];
		//double[] alturas = new double[4];
		//boolean[] aceptados = new boolean[10];
		//char[] grupos = new char[15];
		//String[] nombres = new String[7];
		
		
		edad[0] = 10;
		edad[1] = 20;
		edad[2] = 30;
		edad[3] = 40;
		edad[4] = 50;
		
		for (int i=0; i < 5;i++) {
			System.out.println("El numero en la posicion "+i+" es: "+edad[i]);
		}
		//System.out.println("El resultado es "+resultado + " el valor del indice i es " + numeros[i] +" y el valor del indice j es "+numeros[j]);

	}

}