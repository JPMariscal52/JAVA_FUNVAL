package practica_Java_1;

import java.util.Scanner;

public class SwtMenuDos {

	String platillo;
	int menu;
	
	public void solicitarDatosMenu() {
		
		Scanner teclado = new Scanner(System.in);
        System.out.println("Selecciona el menu que deseas: ");
        System.out.println("1-Desayuno");
        System.out.println("2-Comida");
        System.out.println("3-Especial");
        System.out.println("4-Ligero");
        System.out.println("5-Cena");
        menu = teclado.nextInt();
        
        teclado.close();
		
	}
	
	public void seleccionMenu() {
		
		solicitarDatosMenu();
		
		switch (menu) {
		
		case 1:
            platillo = "Pan dulce, huevo con tocino y jugo de naranja";
            break;
        case 2:
        	platillo = "Arroz, Chilaquiles, agua de horchata";
            break;
        case 3:
        	platillo = "Spaguetti, filete de res con papas y refresco";
            break;
        case 4:
        	platillo = "Ensalada Cesar con pollo y agua de limon con chia";
            break;
        case 5:
        	platillo = "Hamburguesa con papas y refresco";
            break;
        
    }
    
    System.out.println("El menu consiste en:");
    System.out.println(platillo);
    System.out.println("¿Estas listo para ordenar?");
		
	}

}
