package sajat;

import java.io.*;

public class proba3 {

	public static void main(String[] args) {
		int meret = 5;
		int[] tomb = new int[meret];
		
		//InputStreamReader �s BufferedReader-rel val� ki�r�s
	
		for (int i = 0; i < tomb.length; i++)
			{	
			
			try {
				InputStreamReader inputread = new InputStreamReader(System.in);
				BufferedReader read  = new BufferedReader(inputread);
				
				//String sztring = read.readLine();
				
				boolean wrongData = true;
				
				do {
					/* kiv�telkezel�s */
					try {
						//tomb[i] = Integer.parseInt(input.nextLine());
						tomb[i] = Integer.valueOf(read.readLine()).intValue();
						wrongData = false;
					} catch (NumberFormatException e) {
						System.out.println("nem sz�m hallo :P");
					}
				} while (wrongData);
	
			} catch (IOException e) {
				// TODO: handle exception
			}
			
				
			}
		///input.close();
		
		System.out.println("A beolvasott �rt�kek: \n");
		for (int i = 0; i < tomb.length; i++) 
			{
				System.out.println(tomb[i]);
			}
		
	}

}
