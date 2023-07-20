package programacion_ats;

import javax.swing.JOptionPane;

public class Ej36_ArregloUno {

	public static void main(String[] args) {
		
		int tamano;
		
		tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo:"));
		
		String[] nombres = new String[tamano];

		for(int i=0; i<tamano;i++) {
			nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre "+(i+1)+" :");
		}
		
		for(int i=0; i<tamano;i++) {
			System.out.println("El nombre es: "+nombres[i]);  
		}
		
	}

}
