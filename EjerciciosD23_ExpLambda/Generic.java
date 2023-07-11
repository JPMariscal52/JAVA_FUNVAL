package practica_Java_1;

//Asignacion de clase generica con corchetes angulares
public class Generic <T>{
	
	//Campo de clase encapsulado tipo T
	private T valor;
	
	//Constructor con el campo de clase
	//El objeto tendra un campo de clase "valor" inicializado en "null"
	public Generic(){
		
		valor = null;
		
	}
	
	
	public void setValor(T valorNuevo) {
		
		valor = valorNuevo;
		
	}
	
	public T getValor() {
		return valor;
	}

}
