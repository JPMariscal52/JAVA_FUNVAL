package ejercicios_clase;

public class MatrizBidimensional {

	public static void main(String[] args) {

		
        String[][] personas = new String[2][3];
        
        personas[0][0] = "Pablo";
        personas[0][1] = "Juan";
        personas[0][2] = "Pedro";
        personas[1][0] = "32";
        personas[1][1] = "25";
        personas[1][2] = "19";
        

        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[0].length; j++) {
                System.out.print(personas[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}


