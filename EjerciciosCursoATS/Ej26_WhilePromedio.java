package programacion_ats;

import javax.swing.JOptionPane;

public class Ej26_WhilePromedio {

	public static void main(String[] args) {
		
		int numero,suma = 0, denominador = 0;
		float promedio;
		
		JOptionPane.showMessageDialog(null, "Programa para calcular promedio");
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero: "));
		
		while(numero > 0) {
			
		System.out.println("El numero ingresado es: "+numero);
		denominador++;
		suma += numero; 
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
		
		}
		
		if(denominador <= 0) {
			System.out.println("Error en la operacion, introduzca valores validos");
		}
		else {
			
			promedio = (float) suma/denominador;
			System.out.println("El promdio final es: "+suma+"/"+denominador+" = "+promedio);
			
		}
	}

}
