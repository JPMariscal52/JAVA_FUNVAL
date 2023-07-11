package practica_Java_1;

import java.util.Scanner;

public class PromedioNumerosF {
	
	double promedio;
	
	public void promedioN(double n1, double n2, double n3, double n4, double n5) {
		promedio = (n1 + n2 + n3 + n4 + n5) / 5;
	}
	
public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in);
		
		PromedioNumerosF promedio = new PromedioNumerosF();
		
		System.out.println("Ingrese el primer número:");
        double n1 = input.nextDouble();
        
        System.out.println("Ingrese el segundo número:");
        double n2 = input.nextDouble();
        
        System.out.println("Ingrese el tercer número:");
        double n3 = input.nextDouble();
        
        System.out.println("Ingrese el cuarto número:");
        double n4 = input.nextDouble();
        
        System.out.println("Ingrese el quinto número:");
        double n5 = input.nextDouble();
        
        promedio.promedioN(n1, n2, n3, n4, n5);
        
        System.out.println("El promedio de los 5 valores ingresados es: " + promedio.promedio);
        
        input.close();
}      

}
	


