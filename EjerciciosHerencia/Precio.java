package herencia;

public class Precio {
	
	private String cliente;
	private float precio;
	
	public Precio(String cliente, float precio) {
		
		this.cliente = cliente;
		this.precio = precio;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
