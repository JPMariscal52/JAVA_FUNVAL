package practica_Java_1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import javax.swing.JOptionPane;

public class ExpGenerics {

	public static void main(String[] args) {

		
		List<Generic<Integer>> numeros = new ArrayList<>();
		
		//Expresion Lambda para calcular el promedio de los numeros
		Function<Integer, Float> prom = n -> (float)n / numeros.size();
		
		int numero, totalNums; 
		int suma = 0;
		Generic<Integer> num;
		float promedio;
		
		totalNums = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a capturar: "));
		
		for(int i=0; i<totalNums;i++) {
		
		num = new Generic<Integer>();
		numero = Integer.parseInt(JOptionPane.showInputDialog((i+1)+".-Ingrese un numero entero "));
		
		num.setValor(numero);
		numeros.add(num);
		
		}
		
		for (Generic<Integer> n: numeros) {
			suma += n.getValor();
		}
		promedio = prom.apply(suma);
		
		System.out.println("El promedio de todos los numeros es: "+promedio);
		
		//Ejemplo para utlizar por segunda ocasion la expresion lambda
		int ejemplo = 5;
		float promedioDos = prom.apply(ejemplo);
		System.out.println("El promedio del segundo ejemplo es: "+promedioDos);
	}

}
