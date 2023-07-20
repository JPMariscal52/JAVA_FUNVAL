package programacion_ats;

import javax.swing.JOptionPane;

public class Ej13_SwitchCase {

	public static void main(String[] args) {


		int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del 1-5"));
		
		switch(dato) {
		case 1: 
			JOptionPane.showMessageDialog(null, "El numero ingresado es 1");
			break;
		case 2: 
			JOptionPane.showMessageDialog(null, "El numero ingresado es 2");
			break;
		case 3: 
			JOptionPane.showMessageDialog(null, "El numero ingresado es 3");
			break;
		case 4: 
			JOptionPane.showMessageDialog(null, "El numero ingresado es 4");
			break;
		case 5: 
			JOptionPane.showMessageDialog(null, "El numero ingresado es 5");
			break;
		default:
			JOptionPane.showMessageDialog(null, "El numero ingresado no está entre 1-5");
		
		}

	}

}
