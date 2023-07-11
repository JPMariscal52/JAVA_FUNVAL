package practica_Java_1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import javax.swing.JOptionPane;

public class LambdaEmpleados {

	public static void main(String[] args) {
		
		String nombre = "";
		int edad = 0;
		
		//ArrayList de tipo "LambdaEmpleadosDos"
		List<LambdaEmpleadosDos> personas = new ArrayList<>();
		
		//Expresion Lambda para filtrar edad mayor a 30
		Function<Integer, Boolean> limite = (age) -> age > 30;
		
		for(int i=1;i < 3;i++) {
			nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona "+i);
			edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona "+i));
			
			//Se crea la instancia "persona"
			LambdaEmpleadosDos persona = new LambdaEmpleadosDos(nombre, edad);
			
			//Se agrega el objeto persona al ArrayList
		    personas.add(persona);	
		}
	       
		//Se va a iterar el ArrayList personas, se crea una variable "p" de tipo "LambdaEmpleadosDos" para hacer la iteracion
	    for (LambdaEmpleadosDos p : personas) {
	    	
	    	//Se crea una variable primitiva tipo boolean de nombre resultado para albergar el dato que sale de la 
	    	//aplicacion de la exp Lambda "age>30
            boolean resultado = limite.apply(p.getEdad());

            //Se crea un if para evaluar el resultado de la exp Lambda y asi imprimir o no el nombre y edad de la persona
            if (resultado) {
            	//Se utiliza la variable "p" para obtener la informacion del objeto a traves del los getters
                System.out.println("Nombre: "+p.getNombre()+" Edad: "+p.getEdad());
            }
        }
    }
}
