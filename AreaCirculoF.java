package practica_Java_1;

import java.util.Scanner;

public class AreaCirculoF {
	
	double area;
	
	public void areacirculo(double radio) {
		area = Math.PI * Math.pow(radio, 2);
	}
	
public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in);
		
		AreaCirculoF circulo = new AreaCirculoF();
		
		System.out.println("Ingrese el primer número:");
        double radio = input.nextDouble();
        
        circulo.areacirculo(radio);
        
        System.out.println("El area del circulo es:" + circulo.area);
        
        input.close();
}      

}
