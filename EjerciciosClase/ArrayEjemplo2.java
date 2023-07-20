package ejercicios_clase;

import java.util.Scanner;

public class ArrayEjemplo2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numero = new int[10];
        
        System.out.println("Ingresar 10 números");
        
        int i = 0;

        while( i < 10 ) {
            System.out.println("Ingrese el numero en la posisión " + i +" :");
            numero[i] = scanner.nextInt();
            i++;
        }

        
        scanner.close();

        //Ingreasr 10 numeros en un array numeros positivos y negativos
        //acomodar de menor a mayor
        //cual es el numero mayor y cual es el menor
    }

}
//Dar la opción para que busque el numero que ingreso, si existe o no existe
