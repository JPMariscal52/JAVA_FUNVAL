package herencia;

public class Factura extends Precio {
	
	private String producto;
	private int cantidad;

	public Factura(String cliente, float precio, String producto, int cantidad) {
		super(cliente, precio);
		
		this.producto = producto;
		this.cantidad = cantidad;
		
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public void imprimirFactura() {
		System.out.println(getCliente()+ " - "+getProducto()+" - "+getPrecio()+" - "+getCantidad());
	}

}
