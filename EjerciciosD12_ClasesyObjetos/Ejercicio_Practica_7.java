package practica_Java_1;

import java.util.Scanner;

public class Ejercicio_Practica_7 {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = input.nextLine();

        System.out.println("Ingrese su edad:");
        int edad = input.nextInt();

        Persona persona = new Persona(nombre, edad);

        persona.saludo();

        input.close();
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludo() {
        System.out.println("¡Hola, " + nombre + " tienes " + edad + " años de edad! " + "¡Saludos!");
    }
}

