package practica_Java_1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListPalabras {

	public static void main(String[] args) {
		
		
		String nombre, palabra;
		int opcion, indice;

		ArrayList<String> nombres = new ArrayList<>();
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opcion deseada"+
																"\n1.-Ingresar Nombre"+
																"\n2.-Verificar nombre"+
																"\n3.-Salir"));
		
		while (opcion != 3) {
			
			switch(opcion) {
			case 1:
				nombre = JOptionPane.showInputDialog("Ingrese un nombre");
				nombres.add(nombre);
				
				break;
			case 2:
				palabra = JOptionPane.showInputDialog("Ingrese el nombre a verificar");
				boolean verificado = nombres.contains(palabra);
				
				if(verificado) {
					JOptionPane.showMessageDialog(null, "El nombre: "+ palabra+" ya está en la lista");
					for (int i = 0; i < nombres.size(); i++) {
						if (nombres.get(i).equalsIgnoreCase(palabra)) {
							
							System.out.println(i+".-"+nombres.get(i));
						}
						
					}
					indice = Integer.parseInt(JOptionPane.showInputDialog("¿Cual elemento repetido desea borrar?"+
																			"Ingrese el indice del elemento"));
					nombres.remove(indice);
					
				}
				else {
					JOptionPane.showMessageDialog(null, "El nombre: "+ palabra+" no estába en la lista");
				}
				break;
				
						
					
				}
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opcion deseada"+
																	"\n1.-Ingresar Nombre"+
																	"\n2.-Verificar nombre"+
																	"\n3.-Salir"));
				
			}
			
			
		}

	}


