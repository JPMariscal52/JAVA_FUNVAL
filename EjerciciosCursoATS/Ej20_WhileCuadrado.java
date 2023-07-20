package programacion_ats;

import javax.swing.JOptionPane;

public class Ej20_WhileCuadrado {

	public static void main(String[] args) {
		
		int numero, cuadrado;
		
		JOptionPane.showMessageDialog(null, "Programa para elevar numeros al cuadrado");
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero a elevar: "));
		
		while(numero >= 0) {
			
			cuadrado = (int) Math.pow(numero, 2);
			
			JOptionPane.showMessageDialog(null, "El cuadrado de "+numero+" es "+cuadrado);
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero a elevar: "));
		}

	}

}
