package programacion_ats;

import javax.swing.JOptionPane;

public class Ej15_IfParImpar {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Programa de paridad o imparidad");
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero (a):"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero (b):"));
		
		if (a%2 == 0 && b%2 == 0) {
			JOptionPane.showMessageDialog(null, "Ambos numeros(a y b) son pares");
		}
		
		else {
			if(a%2 != 0 && b%2 != 0) {
				JOptionPane.showMessageDialog(null, "Ambos numeros(a y b) son impares");
			}
			else {
				if (a%2 != 0) {
					JOptionPane.showMessageDialog(null, a+" es impar y "+b+" par");
				}
				else {
					JOptionPane.showMessageDialog(null, a+" es par y "+b+" impar");
				}
			}
		}
		

	}

}
