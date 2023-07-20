package aControlador;

import aOperaciones.Operaciones;
import aVista.VentanaCatalogo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operaciones misOperaciones = new Operaciones();
		VentanaCatalogo ventana = new VentanaCatalogo(misOperaciones);
		ventana.setVisible(true);
	}

}
