package programacion_ats;

import javax.swing.JOptionPane;

public class Ej14_IfMayorMenor {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Bienvenido al programa para evaluar dos numeros a>b");
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
		
		if (a > b) {
			
			JOptionPane.showMessageDialog(null, "El numero mayor es: "+a);
		}
		else {
			if (b > a) {
				
				JOptionPane.showMessageDialog(null, "El numero mayor es: "+b);
			}
			else {
				JOptionPane.showMessageDialog(null, "Los dos numeros son iguales");
			}
		}

	}

}
