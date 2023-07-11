package practica_Java_1;

import java.util.Scanner;

public class SwtDiasSemanaDos {
	
	String dia;
	int opcion;
	
	public void solicitarDatos() {
		
		Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa el numero de día: ");
        opcion = teclado.nextInt();
        
        teclado.close();
		
	}
	
	public void seleccionDias() {
		
		solicitarDatos();
		
		switch (opcion) {
		
		case 1:
            dia = "Domingo";
            break;
        case 2:
            dia = "Lunes";
            break;
        case 3:
            dia = "Martes";
            break;
        case 4:
            dia = "Miercoles";
            break;
        case 5:
            dia = "Jueves";
            break;
        case 6:
            dia = "Viernes";
            break;
        default:
            dia = "Sabado";
            
            break;
    }
    
    System.out.println("Has escogido el dia: " + dia);
    System.out.println("¿Que vas a hacer hoy?");
		
	}

}
