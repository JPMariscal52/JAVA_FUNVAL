package programacion_ats;

public class Ej37_ForEachLoop {

	public static void main(String[] args) {
		
		String[] nombres = {"Pablo","Samuel", "Heriberto", "Eliseo", "Patricio"};
		
		//El ciclo for-each va a iterar automaticamente todos los espacios del arreglo sin necesidad de poner rangos ni incrementos
		for(String nombre:nombres) {
			System.out.println(nombre);
		}

	}

}
