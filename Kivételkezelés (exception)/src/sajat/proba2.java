package sajat;

import java.util.*;

public class proba2 {

	public static void main(String[] args) {
		int meret = 5;
		int[] tomb = new int[meret];
		
		//NextLine-nal val� ki�r�s
		
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < tomb.length; i++)
			{	
				boolean wrongData = true;
				
				do {
					/* kiv�telkezel�s */
					try {
						tomb[i] = Integer.parseInt(input.nextLine());
						wrongData = false;
					} catch (InputMismatchException e) {
						System.out.println("elkaptuk ezeket a speck�kat :P");
						System.out.println("INPUT MISS");
					} catch (NumberFormatException e) {
						System.out.println("nem sz�m hallo :P");
				
					} catch (Exception e) {
						System.out.println("elrontottam :P");
					}	
				} while (wrongData);
			}
		input.close();
		
		System.out.println("A beolvasott �rt�kek: \n");
		for (int i = 0; i < tomb.length; i++) 
			{
				System.out.println(tomb[i]);
			}
		
	}

}

