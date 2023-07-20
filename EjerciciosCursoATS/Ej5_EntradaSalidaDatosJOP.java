package programacion_ats;

import javax.swing.JOptionPane;

public class Ej5_EntradaSalidaDatosJOP {

	public static void main(String[] args) {
		
		char caracter;
		int numero;
		double decimal;
		
		//Recuerda colocar la funcion charAt() para que pueda convertir el dato String a char
		caracter = JOptionPane.showInputDialog("Introduzca caracter").charAt(0);
		
		//Recuerda colocar la funcion Integer.parseInt para convertir el dato String a numerico
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero entero"));
		
		//Recuerda colocar la funcion Double.parseDouble para convertir el dato String a decimal
		decimal = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el numero decimal"));
		
		JOptionPane.showMessageDialog(null, "El caracter es: "+caracter);
		JOptionPane.showMessageDialog(null, "El numero entero es: "+numero);
		JOptionPane.showMessageDialog(null, "El numero decimal es: "+decimal);
		
	}

}
