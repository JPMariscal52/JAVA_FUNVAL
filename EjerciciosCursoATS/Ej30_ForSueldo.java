package programacion_ats;

import javax.swing.JOptionPane;

public class Ej30_ForSueldo {

	public static void main(String[] args) {
		
		int sueldo, sumaSueldo = 0, conteoSueldo = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el total del sueldo "+i));
			
			if (sueldo > 1000) {
				
				conteoSueldo ++;
				
			}
			
			System.out.println("El sueldo es: "+sueldo);
			sumaSueldo += sueldo;		
			
		}
		
		System.out.println("La suma de los 10 sueldos es: "+sumaSueldo);
		System.out.println("Tenemos "+conteoSueldo+" sueldos mayor a 1000");

	}

}
