package programacion_ats;

public class Ej7_OperadoresAritAsignacion {

	public static void main(String[] args) {
		
		int num1, num2, num3, num4;
		
		num1 = 15;
		num2 = 15;
		num3 = 15;
		num4 = 15;
		
		System.out.println("El numero a evaluar es 15 en operacion con 5");
		num1 += 5; // esta expresion de asignacion es igual que si lo escribimos num1 = num1 + 5
		System.out.println("Asignacion += es "+num1 +" = (num1 = num1 + 5) ");
		num2 -= 5; // esta expresion de asignacion es igual que si lo escribimos num1 = num1 - 5
		System.out.println("Asignacion -= es "+num2 +" = (num1 = num1 - 5) ");
		num3 *= 5; // esta expresion de asignacion es igual que si lo escribimos num1 = num1 * 5
		System.out.println("Asignacion *= es "+num3 +" = (num1 = num1 * 5) ");
		num4 /= 5; // esta expresion de asignacion es igual que si lo escribimos num1 = num1 / 5
		System.out.println("Asignacion /= es "+num4 +" = (num1 = num1 / 5) ");
		// Tambien puede ser usada con el modulo y se escreibiría  (num %= 5) = (num = num % 5)
		

	}

}
