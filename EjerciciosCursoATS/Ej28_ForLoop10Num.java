package programacion_ats;

import javax.swing.JOptionPane;

public class Ej28_ForLoop10Num {

	public static void main(String[] args) {
		
		int suma = 0, num;
		
		JOptionPane.showMessageDialog(null, "Programa para sumar numeros con For Loop");
		
		for(int i = 1;i<=10;i++) {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+i+":"));
			suma += num;
			
		}
		
		JOptionPane.showMessageDialog(null, "La suma de todos los numero ingresados es: "+suma);

	}

}
