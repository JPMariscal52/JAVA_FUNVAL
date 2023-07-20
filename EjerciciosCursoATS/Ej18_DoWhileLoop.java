package programacion_ats;

public class Ej18_DoWhileLoop {

	public static void main(String[] args) {
		
		//El ciclo do-while se ejecutará una vez aunque la condicion no sea verdadera ya que
		//en este ciclo la condicion es evaluada al final del ciclo, contrario al ciclo while
		int i=0;
		
		do {
			System.out.println(i);
			i++;
		} while(i==10);

	}

}
