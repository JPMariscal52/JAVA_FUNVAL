package programacion_ats;

import javax.swing.JOptionPane;

public class Ej25_WhileSumaNum {

	public static void main(String[] args) {
		
		int numero, sumatoria = 0;
		
		JOptionPane.showMessageDialog(null, "Programa para sumar los numeros ingresados");
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero positivo"));
		
		while(numero > 0) {
			System.out.println("El numero es: "+numero);
			
			sumatoria += numero;
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero positivo"));
		}
		System.out.println("La suma total de los numeros ingresados es: "+sumatoria);
	}

}
