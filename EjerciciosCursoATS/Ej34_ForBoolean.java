package programacion_ats;

import javax.swing.JOptionPane;

public class Ej34_ForBoolean {

		public static void main(String[] args) {
			
			
			int calificacion;
			boolean suspenso = false;
			
			for (int i=0;i<5;i++) {
				
				calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la calificacion "+(i+1)));
				
				if (calificacion <= 5) {
					
					suspenso = true;
				}
				
			}
			
			if (suspenso) {
				JOptionPane.showMessageDialog(null, "Hay estudiantes suspensos");
			}
			else {
				JOptionPane.showMessageDialog(null, "No hay estudiantes suspensos");
			}

		}

	}	
	