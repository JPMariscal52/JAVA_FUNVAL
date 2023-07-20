package ejercicios_clase;

public class PruebaTecnica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador=0;
		int resultado;
		int[] numeros = {5,1,2,7,5,3,8,4,2};
		//int[] numeros = {5,1,2,3,2,4,3,2,4,1};
		
		for(int i=0; i<numeros.length;i++) {
			for(int j=0; j<numeros.length;j++) {
				if (i != j) {
					resultado = numeros[i]+numeros[j];
					if (resultado == 10) {
						contador++;
					}
			
				}
			}
		}
		
		if (contador > 0) {
			System.out.println("Si hay elementos que sumados den como resultado 10");
		}
		else {
			System.out.println("No hay elementos que sumados den 10");
		}

		
		

	}

}
