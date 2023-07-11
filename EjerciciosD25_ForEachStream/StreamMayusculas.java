package practica_Java_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class StreamMayusculas {

	public static void main(String[] args) {
		
		 String texto;
			
		 List<String> textos = new ArrayList<>();
		 
		 JOptionPane.showMessageDialog(null, "Programa para convertir las cadenas de texto a mayusculas");
		 
		 for(int i=0;i<5;i++) {
			 texto = JOptionPane.showInputDialog((i+1)+".-Escriba un texto: ");
			 textos.add(texto);
		 }
		 
		 List<String> textosMayuscula = textos.stream().map(String::toUpperCase).collect(Collectors.toList());

		 System.out.println("Estas son las cadenas de texto en mayusculas: ");
		 
		 for(String p: textosMayuscula) {
			 System.out.println("-"+p);
		 }
		    }
		


	}
