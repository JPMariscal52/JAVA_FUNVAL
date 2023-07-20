package programacion_ats;

import javax.swing.JOptionPane;

public class Ej22_WhilePrintNumPos {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Programa para imprimir numeros positivos");
		int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero:"));

			while(num >= 0) {
				
				System.out.println("El numero es: "+num);
				
				num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
			}
			System.out.println("El numero es negativo");
		}

	}


