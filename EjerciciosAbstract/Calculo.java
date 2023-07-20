package claseAbstract;

public class Calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangulo calculosTriangulo = new Triangulo("Triangulo escaleno", 5, 8, 4);
		calculosTriangulo.calcularArea();
		calculosTriangulo.calcularPerimetro();
		
		Circulo calculosCirculo = new Circulo("Circulo", 8);
		calculosCirculo.calcularArea();
		calculosCirculo.calcularPerimetro();
		
		Cuadrado calculosCuadrado = new Cuadrado("Cuadrado", 9);
		calculosCuadrado.calcularArea();
		calculosCuadrado.calcularPerimetro();
		
		
		

	}

}

	//---Se crea la clase abstracta figura
	abstract class Figura{
		
		//---Se declara el atributo nombre
		protected String nombre;
		
		public Figura(String nombre) {
			this.nombre = nombre;
		}
		
		//---Se declaran los metodos calcularArea y calcularPerimetro
		public abstract void calcularArea();
		
		public abstract void calcularPerimetro();

}
	
	class Triangulo extends Figura{
		
		
		private int ladoA, ladoB, ladoC;
		
		public Triangulo(String nombre, int ladoA, int ladoB, int ladoC) {
			super(nombre);
			
			this.ladoA = ladoA;
			this.ladoB = ladoB;
			this.ladoC = ladoC;
				
		}
		
		public void calcularArea() {
			float area = (ladoA * ladoB)/2;
			System.out.println("El area del "+nombre+" es: "+area);
		}
		
		public void calcularPerimetro() {
			int perimetro = ladoA + ladoB + ladoC;
			System.out.println("El perimetro del "+nombre+" es: "+perimetro);
		}
			
	}
	
	class Circulo extends Figura{
		
		
		private int radio;
		
		public Circulo(String nombre, int radio) {
			super(nombre);
			
			this.radio = radio;
				
		}
		
		public void calcularArea() {
			float area = (float) (Math.PI *Math.pow(radio, 2));
			System.out.println("El area del "+nombre+" es: "+area);
		}
		
		public void calcularPerimetro() {
			int perimetro = (int) (Math.PI*(radio*2));
			System.out.println("El perimetro del "+nombre+" es: "+perimetro);
		}
			
	}
	
class Cuadrado extends Figura{
		
		
		private int lado;
		
		public Cuadrado(String nombre, int lado) {
			super(nombre);
			
			this.lado = lado;
				
		}
		
		public void calcularArea() {
			int area = lado * lado;
			System.out.println("El area del "+nombre+" es: "+area);
		}
		
		public void calcularPerimetro() {
			int perimetro = lado * 4;
			System.out.println("El perimetro del "+nombre+" es: "+perimetro);
		}
			
	}
