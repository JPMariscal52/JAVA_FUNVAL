package ejercicios_clase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Ingresa la calificación: ");
		        int calificacion = scanner.nextInt();
		        
		        String mensaje;
		        String nota;
		        
		        switch (calificacion) {
		            case 10:
		                mensaje = "Excelente";
		                nota = "Felicidades";
		                break;
		            case 9:
		                mensaje = "Excelente";
		                nota = "Felicidades";
		                break;
		            case 8:
		                mensaje = "Deseable";
		                nota = "Bien hecho";
		                break;
		            case 7:
		                mensaje = "Deseable";
		                nota = "Requiere asesoría";
		                break;
		            case 6:
		                mensaje = "No satisfactorio";
		                nota = "Requiere asesoría y curso extra";
		                break;
		            default:
		                mensaje = "No aprobatorio";
		                nota = "Requiere examen extraordinario";
		                break;
		        }
		        
		        System.out.println("Tu calificación es: " + mensaje);
		        System.out.println(nota);
		        
		        scanner.close();

	}

}
