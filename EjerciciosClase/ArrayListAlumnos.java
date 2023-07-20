package ejercicios_clase;

//import java.util.List;

import javax.swing.JOptionPane;

import java.util.ArrayList;


public class ArrayListAlumnos {

	public static void main(String[] args) {

		String nombre, grupoS;
		int calificacion;
		char grupo;
		
		ArrayList<String> nombres = new ArrayList<>();
		ArrayList<Integer> calificaciones = new ArrayList<>();
		ArrayList<Character> grupos = new ArrayList<>();
		
		for(int i = 0; i <5;i++) {
			nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno: ");
			calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese calificación:"));
			grupoS = JOptionPane.showInputDialog("Ingrese el grupo del alumno: ");
			grupo = grupoS.charAt(0);
			
			nombres.add(nombre);
            calificaciones.add(calificacion);
            grupos.add(grupo);
            
            if (calificaciones.get(i) >= 95 && calificaciones.get(i) <=100) {
            	
            	System.out.println("Nombre: "+nombres.get(i) +" Grupo: "+grupos.get(i)+" Puntaje: "+ calificaciones.get(i)+" Nota: A");
            	
            }
            else if (calificaciones.get(i) < 95 && calificaciones.get(i) >= 80) {
            	
            	System.out.println("Nombre: "+nombres.get(i) +" Grupo: "+grupos.get(i)+" Puntaje: "+ calificaciones.get(i)+" Nota: B");
            	
            }
            else if (calificaciones.get(i) < 80) {
            	
            	System.out.println("Nombre: "+nombres.get(i) +" Grupo: "+grupos.get(i)+" Puntaje: "+ calificaciones.get(i)+" Nota: C");
            	
            }

			
		}
	}

}
