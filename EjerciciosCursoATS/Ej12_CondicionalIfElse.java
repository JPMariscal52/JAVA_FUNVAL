package programacion_ats;

import javax.swing.JOptionPane;

public class Ej12_CondicionalIfElse {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero a evaluar:"));
		
		if (numero == 5) {
			
			JOptionPane.showMessageDialog(null, "El numero es 5");
			
		}
		else {
			
			JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
		}

	}

}
