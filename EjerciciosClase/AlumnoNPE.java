package ejercicios_clase;

public class AlumnoNPE {

	private String nombre;
	private int edad;
	private float promedio;
	
	
	public AlumnoNPE(String n, int e, float p) {
		
		nombre = n;
		edad = e;
		promedio = p;
		
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public float getPromedio() {
		return promedio;
	}


	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}
	
	
	
}
