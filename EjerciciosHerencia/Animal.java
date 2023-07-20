package herencia;

public class Animal {
	
	private String nombre, alimentacion;
	private int edad;
	
	public Animal(String nombre, String alimentacion, int edad) {
		
		this.nombre = nombre;
		this.alimentacion = alimentacion;
		this.edad = edad;
		
	}
	
	//---Nombre del animal
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//---Alimentacion del animal
	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}
	
	//---Edad del animal
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
