package programacion_ats;

import javax.swing.JOptionPane;

public class Ej21_WhileNumNegPos {

	public static void main(String[] args) {
		
		int num;
		
		JOptionPane.showMessageDialog(null, "Bienvenido para evaluar si un numero es positvio o negativo");
		num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero a evaluar:"));
		
		while (num !=0) {
			
			if (num > 0) {
				
				JOptionPane.showMessageDialog(null, "El numero es positivo");
			}
			
			else {
				
				JOptionPane.showMessageDialog(null, "El numero es negativo");
			}
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero a evaluar: "));
		}
	}

}
