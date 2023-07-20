package ejercicios_clase;

public class AreaFormas {

	//Creación del metodo Area Rectangulo
    public static Area1 opArea1(double n1, double n2) {

        double resultado = n1*n2;
        return new Area1(resultado);
    }
}
	//Creacion de la clase Producto
    class Area1{
    	
        private double resultado;
        
        public Area1(double resultado) {
            this.resultado = resultado;
        }
        
        public double getResultado() {
            return resultado;
        }
        
        //Creación del metodo Area Triangulo
        public static Area2 opArea2(double n1, double n2) {

	        double resultado = (n1*n2)/2;
	        return new Area2(resultado);
	    }
	}
		//Creacion de la clase Producto
	    class Area2{
	    	
	        private double resultado;
	        
	        public Area2(double resultado) {
	            this.resultado = resultado;
	        }
	        
	        public double getResultado() {
	            return resultado;
	        }


        
}
