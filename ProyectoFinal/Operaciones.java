package aOperaciones;

import java.util.ArrayList;

import aModelo.Automovil;


public class Operaciones {

	static ArrayList<Automovil> listaAutos;
	
	
	
	public Operaciones() {
		listaAutos = new ArrayList<Automovil>();
	}

	public void setDataBase(Automovil auto) {
		
		System.out.println(auto);
		listaAutos.add(auto);
		System.out.println("Se registra en BD");
		System.out.println(listaAutos);
		
	}

	public void llenarTablaAutos(String nombre, String marca, int modelo, String version, int cilindros, String potencia,
			String color, int precio, String direccion) {
		
		Automovil auto = new Automovil();
		
		auto.setNombre(nombre);auto.setMarca(marca);auto.setModelo(modelo);auto.setVersion(version);auto.setCilindros(cilindros);
		auto.setPotencia(potencia);auto.setColor(color);auto.setPrecio(precio);auto.setDireccion(direccion);
		
		listaAutos.add(auto);
		System.out.println(auto);
		System.out.println(listaAutos);
	}
	
	

	public ArrayList<Automovil> getListaAutos() {
		// TODO Auto-generated method stub
		return listaAutos;
	}

	

}


