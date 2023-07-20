package programacion_ats;

import javax.swing.JOptionPane;

public class Ej23_DoWhileAdivNum {

	public static void main(String[] args) {
		
		int aleatorio, numero, contador = 0;
		
		aleatorio = (int) (Math.random()*100);
		
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu opcion"));
			
			if(aleatorio > numero) {
				System.out.println("Numero es menor, digite un numero mayor");
			}
			else {
				System.out.println("Numero es mayor, digite un numero menor");
			}
			contador++;
		} while(aleatorio != numero);

		System.out.println("Felicidades! Has adivinado, el numero aleatorio era "+aleatorio+" Intentos: "+contador);
	}

}
