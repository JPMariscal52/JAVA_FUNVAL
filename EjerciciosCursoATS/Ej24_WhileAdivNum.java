package programacion_ats;

import javax.swing.JOptionPane;

public class Ej24_WhileAdivNum {

	public static void main(String[] args) {
		
		int aleatorio, numero, contador = 0;
		
		JOptionPane.showMessageDialog(null, "Juego-Adivina el numero");
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero:"));
		aleatorio = (int)(Math.random()*100);
				
		while(aleatorio != numero) {
			
			if (numero < aleatorio) {
				System.out.println(numero+" es menor, digite un numero mayor");
			}
			else {
				System.out.println(numero+" es mayor, digite un numero menor");
			}  
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero:"));
			contador++;
			
		}
		
		System.out.println("Felicidades el numero a adivinar era "+aleatorio+". Intentos: "+contador);

	}

}
