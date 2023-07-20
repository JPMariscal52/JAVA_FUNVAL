package ejercicios_clase;

public class FizzBuzz {

	public static void main(String[] args) {
		
		int multiplo1 = 1;
		int multiplo2 = 1;
		int multiplo3 = 5;
		int multiplo4 = 3;
		int division;
		int division2;
		
		for(int i=1; i<101;i++) {
			division = i/3;
			division2= i/5;

			
			if (division==multiplo3 && division2==multiplo4) {
				System.out.println(i+" FizzBuzz");
				multiplo3+=5;
				multiplo4+=3;
				multiplo1++;
				multiplo2++;
			}
			else {
				if (division==multiplo1 ) {
					System.out.println(i+" Fizz ");
					multiplo1++;
				}
				else {
					if(division2==multiplo2) {
						System.out.println(i+" Buzz ");
						multiplo2++;
					}
					else {
						System.out.println(i);
					}
				}
			}

		}

	}

}
