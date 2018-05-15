package sajat;

import java.io.*;

public class proba3 {

	public static void main(String[] args) {
		int meret = 5;
		int[] tomb = new int[meret];
		
		//InputStreamReader és BufferedReader-rel való kiírás
	
		for (int i = 0; i < tomb.length; i++)
			{	
			
			try {
				InputStreamReader inputread = new InputStreamReader(System.in);
				BufferedReader read  = new BufferedReader(inputread);
				
				//String sztring = read.readLine();
				
				boolean wrongData = true;
				
				do {
					/* kivételkezelés */
					try {
						//tomb[i] = Integer.parseInt(input.nextLine());
						tomb[i] = Integer.valueOf(read.readLine()).intValue();
						wrongData = false;
					} catch (NumberFormatException e) {
						System.out.println("nem szám hallo :P");
					}
				} while (wrongData);
	
			} catch (IOException e) {
				// TODO: handle exception
			}
			
				
			}
		///input.close();
		
		System.out.println("A beolvasott értékek: \n");
		for (int i = 0; i < tomb.length; i++) 
			{
				System.out.println(tomb[i]);
			}
		
	}

}
