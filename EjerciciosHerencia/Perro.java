package herencia;

public class Perro extends Animal{

	private String raza;
	private float peso;
	
	
	public Perro(String nombre, String alimentacion, int edad, String raza, float peso) {
		super(nombre, alimentacion, edad);

		this.raza = raza;
		this.peso = peso;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void imprimir() {
		System.out.println(getNombre()+" - "+getAlimentacion()+" - "+getEdad()+" - "+getRaza()+" - "+getPeso());
	}
	
	
	
	

}
