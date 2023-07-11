package practica_Java_1;

public class NumerosPares1al30 {

	public static void main(String[] args) {
		
		System.out.println("Numeros Pares del 1 al 30");

		for(int i = 1; i < 31; i++) {
			
			double num = i % 2;
			
			if (num == 0 ) {
				
				System.out.println("El numero par es "+i);
				
			}
		
		}

	}

}
