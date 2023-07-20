package ejercicios_clase;

public class CicloFor {

	public static void main(String[] args) {

		String[] numeros = {"10","9","8","7","6","5","4","3","2","1"};



		for(int i = 0; i < numeros.length; i++) {
			
			String numero = numeros[i];
			System.out.println("El número es:"+numero);			
		}

		for(int i = 11; i >= 0 ; i--) {

		System.out.println("El número es:"+i);			
		}
		

		}
	}

