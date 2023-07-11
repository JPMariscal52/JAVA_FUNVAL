package practica_Java_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class StreamPares {

	public static void main(String[] args) {
		
		int numero;
		ArrayList<Integer> numeros = new ArrayList<>();
		
		JOptionPane.showMessageDialog(null, "Programa para filtrar numeros pares");
		
		for(int i=0;i<10;i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog((i+1)+".-Ingrese un numero entero"));
			numeros.add(numero);
		}

		List<Integer> pares = numeros.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());

		System.out.println(pares);
		
		
		

	}

}
