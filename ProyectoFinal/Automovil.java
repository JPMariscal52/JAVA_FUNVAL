package aModelo;

public class Automovil {
	
	
	private String nombre;
	private String marca;
	private int modelo;
	private String version;
	private int cilindros;
	private String potencia;
	private String color;
	private int precio;
	private String direccion;
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Automovil [nombre=" + nombre + ", marca=" + marca + ", modelo=" + modelo + ", version=" + version
				+ ", cilindros=" + cilindros + ", potencia=" + potencia + ", color=" + color + ", precio=" + precio
				+ ", direccion=" + direccion + "]";
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public int getCilindros() {
		return cilindros;
	}
	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
