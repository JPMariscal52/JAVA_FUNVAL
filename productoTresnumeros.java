package practica_Java_1;

//Importación del paquete Scanner
import java.util.Scanner;

//Se declara el nombre de la clase
public class productoTresnumeros {

	//Creación del metodo Main
	public static void main(String[] args) {
		
		//Creación del objeto input para leer los datos de entrada
		Scanner input = new Scanner(System.in);
		
		//Salida de texto con mensaje de bienvenida
		System.out.println("Bienvenido al programa para hallar el producto de 3 numeros enteros");
		
		//Ingreso del primer valor
		System.out.println("Ingrese el primer número:");
        int n1 = input.nextInt();

        //Ingreso del segundo valor
        System.out.println("Ingrese el segundo número:");
        int n2 = input.nextInt();

        //Ingreso del tercer valor
        System.out.println("Ingrese el tercer número:");
        int n3 = input.nextInt();
        
        //Creación de la instancia producto en la que se ingresan los tres valores
        Producto producto = opProducto(n1, n2, n3);
        
        //Salida de texto con el resultado de la operación
        System.out.println("El resultado es: " +producto.getResultado());
        
        //Cierre del scanner
        input.close();
    }

	//Creación del metodo opProducto con retorno de datos
    public static Producto opProducto(int n1, int n2, int n3) {

    	//Operación para obtener el producto de 3 numeros
        int resultado = n1*n2*n3;

        //Retorno del valor de la operación
        return new Producto(resultado);
    }
}
	//Creacion de la clase Producto
    class Producto{
    	
    	//Creacion variable de instancia resultado
        private int resultado;

        //Creación del constructor Producto
        public Producto(int resultado) {
            this.resultado = resultado;
        }
        
        //Creación del metodo getResultado
        public int getResultado() {
            return resultado;
        }


}
