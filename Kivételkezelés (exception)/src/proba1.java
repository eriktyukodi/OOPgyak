

import java.util.*;

public class proba1 {

	public static void main(String[] args) {
		int meret = 5;
		int[] tomb = new int[meret];
		
		//NextInt-tel való kiírás
		
		/*ha a Scanner osztályt a cikluson kívül 
		definiálom akkor a cikluson kívülre kell az
		input.close () */
		
		/* a finally opcionális lépés de ha van az biztos lefog futni */
		/* a do while ciklussal kilehet küszöbölni azt a hibát
		 * hogy az kivételnél ne 0-át adjon hanem újrakérje a számot */
		
		/* több catch blokkot is írhatunk de a legelején a speciális eseteket
		 * szerepeltessük, hátrébb az általános esetek legyenek.
		 */
		
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < tomb.length; i++)
			{	
				boolean wrongData = true;
				
				do {
					/* kivételkezelés */
					try {
						tomb[i] = input.nextInt();
						wrongData = false;
					} catch (InputMismatchException e) {
						System.out.println("elkaptuk ezeket a speckókat :P");
						System.out.println("INPUT MISS");
					} catch (NumberFormatException e) {
						System.out.println("nem szám hallo :P");
				
					} catch (Exception e) {
						System.out.println("elrontottam :P");
					
					}finally {
						input.nextLine();
					}
				} while (wrongData);
				
			}
		input.close();
	}
}
		