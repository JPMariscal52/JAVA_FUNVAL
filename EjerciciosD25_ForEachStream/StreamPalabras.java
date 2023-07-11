package practica_Java_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class StreamPalabras {

	public static void main(String[] args) {
		
		 String palabra;
		
		 List<String> palabras = new ArrayList<>();
		 
		 JOptionPane.showMessageDialog(null, "Programa para filtrar palabras de mas de 4 caracteres");
		 
		 for(int i=0;i<5;i++) {
			 palabra = JOptionPane.showInputDialog((i+1)+".-Escriba una palabra: ");
			 palabras.add(palabra);
		 }
		 
		 long contadorPalabras = palabras.stream().filter(p -> p.length() > 4).count();
		 List<String> palabrasFiltro = palabras.stream().filter(p -> p.length() > 4).collect(Collectors.toList());

		 System.out.println("Cantidad de palabras con más de cuatro caracteres: " + contadorPalabras);
		 
		 for(String p: palabrasFiltro) {
			 System.out.println("-"+p);
		 }
		    }
		


	}


