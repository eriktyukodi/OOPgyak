

import java.util.*;

public class proba1 {

	public static void main(String[] args) {
		int meret = 5;
		int[] tomb = new int[meret];
		
		//NextInt-tel val� ki�r�s
		
		/*ha a Scanner oszt�lyt a cikluson k�v�l 
		defini�lom akkor a cikluson k�v�lre kell az
		input.close () */
		
		/* a finally opcion�lis l�p�s de ha van az biztos lefog futni */
		/* a do while ciklussal kilehet k�sz�b�lni azt a hib�t
		 * hogy az kiv�teln�l ne 0-�t adjon hanem �jrak�rje a sz�mot */
		
		/* t�bb catch blokkot is �rhatunk de a legelej�n a speci�lis eseteket
		 * szerepeltess�k, h�tr�bb az �ltal�nos esetek legyenek.
		 */
		
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < tomb.length; i++)
			{	
				boolean wrongData = true;
				
				do {
					/* kiv�telkezel�s */
					try {
						tomb[i] = input.nextInt();
						wrongData = false;
					} catch (InputMismatchException e) {
						System.out.println("elkaptuk ezeket a speck�kat :P");
						System.out.println("INPUT MISS");
					} catch (NumberFormatException e) {
						System.out.println("nem sz�m hallo :P");
				
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
		