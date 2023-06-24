package practica_Java_1;

public class divisionNumeros {

	public static void main(String[] args) {
    	//Variables declaradas
    	//Tipo-nombre de variable = Dato de la variable
        int dividendo = 17;
        int divisor = 3;
        
        Division division = rdivision(dividendo, divisor);
        
        //Comando de salida de texto
        System.out.println("Dividendo es "+dividendo);
        System.out.println("Divisor es " + divisor);
        System.out.println("Cociente = " + division.getCociente());
        System.out.println("Resto = "+division.getResto());
        System.out.println("Respuesta = " +division.getRespuesta());
    }

    //Creación del metodo "rdivision"
    public static Division rdivision(int dividendo, int divisor) {
        //Operacion cociente
    	//Se declara la variable de nombre "cociente"
    	//Tipo-Nombre variable = operación usando los argumentos dividendo/divisor
        int cociente = dividendo / divisor;

        //Operacion resto
        //Se declara la variable de nombre "resto"
    	//Tipo-Nombre variable = operación usando los argumentos dividendo % divisor
        int resto = dividendo % divisor;

        //Operacion división
        //Se declara la variable de nombre "respuestaDiv"
    	//Tipo-Nombre variable = operación usando los argumentos dividendo*divisor
        double respuesta = (double) dividendo / divisor;

        //Se retornan valores de las variables creadas en el metodo
        return new Division(cociente, resto, respuesta);
    }
}
	//Creacion de la clase
    class Division{
    	
    	//Declaracion de la variables de instancia
        private int cociente;
        private int resto;
        private double respuesta;

        public Division(int cociente, int resto, double respuesta) {
            this.cociente = cociente;
            this.resto = resto;
            this.respuesta = respuesta;
        }
        
        //Retorno de valores de las operaciones
        public int getCociente() {
            return cociente;
        }
        public int getResto() {
            return resto;
        }
        public double getRespuesta() {
            return respuesta;
        }


}