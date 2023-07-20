package ejercicios_clase;

import java.util.Scanner;

public class TresNumeros {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el primer número:");
        int n1 = input.nextInt();
		
        System.out.println("Ingrese el primer número:");
        int n2 = input.nextInt();
        
        System.out.println("Ingrese el primer número:");
        int n3 = input.nextInt();
        
        if (n1 > n2 && n1 > n3) {
        	
        	if(n2 > n3) {
        		
        		double residuo = n1 % n2;
        		
        		if (residuo == 0) {
        			
        			System.out.print("El residuo de "+n1+"/"+n2+ " es cero");
        		}
        		else {
        			System.out.println("El residuo de "+n1+"/"+n2+ " es " + residuo);
        			System.out.print("La suma del numero menor es más el residuo es: "+ (n3+residuo));
        		}
        	}
        	else {
        		double residuo = n1 % n3;
        		
        		if (residuo == 0) {
        			
        			System.out.print("El residuo de "+n1+"/"+n3+ " es cero");
        		}
        		else {
        			System.out.println("El residuo de "+n1+"/"+n3+ " es " + residuo);
        			System.out.print("La suma del numero menor es más el residuo es: "+ (n2+residuo));
        		}
        	
        	}
        }
        
        if (n2 > n1 && n2 > n3) {
        	
        	if(n1 > n3) {
        		
        		double residuo = n2 % n1;
        		
        		if (residuo == 0) {
        			
        			System.out.print("El residuo de "+n2+"/"+n1+ " es cero");
        		}
        		else {
        			System.out.println("El residuo de "+n2+"/"+n1+ " es " + residuo);
        			System.out.print("La suma del numero menor es más el residuo es: "+ (n3+residuo));
        		}
        	}
        	else {
        		double residuo = n2 % n3;
        		
        		if (residuo == 0) {
        			
        			System.out.print("El residuo de "+n2+"/"+n3+ " es cero");
        		}
        		else {
        			System.out.println("El residuo de "+n2+"/"+n3+ " es " + residuo);
        			System.out.print("La suma del numero menor es más el residuo es: "+ (n1+residuo));
        		}
        	
        	}
        }
		
        if (n3 > n1 && n3 > n2) {
        	
        	if(n1 > n2) {
        		
        		double residuo = n3 % n1;
        		
        		if (residuo == 0) {
        			System.out.print("El residuo de "+n3+"/"+n1+ " es cero");
        		}
        		else {
        			System.out.println("El residuo de "+n3+"/"+n1+ " es " + residuo);
        			System.out.print("La suma del numero menor es más el residuo es: "+ (n2+residuo));
        		}
        	
        	}
        	else {
        		double residuo = n3 % n2;
        		
        		if (residuo == 0) {
        			System.out.print("El residuo de "+n3+"/"+n2+ " es cero");
        		}
        		else {
        			System.out.println("El residuo de "+n3+"/"+n2+ " es " + residuo);
        			System.out.print("La suma del numero menor es más el residuo es: "+ (n1+residuo));
        		}
        	
        	}
        }
		
		
		
		input.close();
	}

}

