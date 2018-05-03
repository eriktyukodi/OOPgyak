/**
 * 
 */

/**
 * @author Én
 *
 */
public class Pi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Wallis-formula
				double pi = 1;
				int darab = 100000 / 2;
				
				for (int i = 1; i <=darab; i++) {
					pi *= 2.0 * i / (2 * i -1);
					pi *= 2.0 * i / (2 * i +1);
				}
				
				System.out.println("Wallis-formula");
				System.out.println("pi/2 értéke " + pi);
				System.out.println("pi: " + pi * 2);
				
				//Leibniz-formula
				pi = 0;
				darab *= 4;
				int elojel = 1;
				
				for (int i = 1; i <= darab; i+=2) {
					pi += elojel * 1.0 / i;
					elojel *= -1;
				}
				System.out.println("Leibniz-formula");
				System.out.println("pi/4 értéke " + pi);
		System.out.println("pi: " + pi * 4);
	}

}
