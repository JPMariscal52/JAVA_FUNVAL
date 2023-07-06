package practica_Java_1;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;

import javax.swing.JOptionPane;

public class ArrayNumerosAsc {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
       
		int numero;

        for (int i = 0; i < 5; i++) {
        	
        	JOptionPane.showMessageDialog(null, "Ingrese 5 numeros de manera aleatoria");
        	numero = Integer.parseInt(JOptionPane.showInputDialog((i + 1) +".-Ingresar número: "));
        	numeros.add(numero);
        }
        
        JOptionPane.showMessageDialog(null, "Se imprimirá la lista desordenada en la consola");
        System.out.println("Números desordenados:");
        for (int num : numeros) {
            System.out.println(num);
        }
            
        Collections.sort(numeros);

        JOptionPane.showMessageDialog(null, "Se imprimirá la lista ordenada en la consola");
        System.out.println("Números ordenados ascendentemente:");
        for (int n : numeros) {
            System.out.println(n);
        }
    }


}


