package ejercicios_clase;

public class ArregloNormalaBidimensional {

		    public static void main(String[] args) {
		    	
		        int[] numeros = {1, 2, 3, 4, 5, 6};
		        
		        int fila = 2;
		        int columna = 3;
		        
		        int[][] arregloBidimensional = new int[fila][columna];

		        int index = 0;
		        
		        for (int i = 0; i < 2; i++) {
		            for (int j = 0; j < 3; j++) {
		            	
		                arregloBidimensional[i][j] = numeros[index];
		                index++;
		            }
		        }

		        // Imprimir el arreglo bidimensional
		        for (int a = 0; a < 2; a++) {
		            for (int b = 0; b < 3; b++) {
		                System.out.println(arregloBidimensional[a][b] + " en punto "+"("+a+","+b+")");
		            }
		           // System.out.println();
		        }
		    }
		


	}


