import java.util.Random;
import java.util.Scanner;


public class Futtathat� {

	/**
	 * @param args
	 */
	public static void main(String[] args) { //beolvas�s
		// int size = 3;
		Scanner beolv = new Scanner(System.in);
		
		int size = beolv.nextInt();
		
		Alkalmazott alkalmazottak [] = new Alkalmazott[size];
		Random veletlenszam = new Random();
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott("XYZ" + (i + 1), veletlenszam.nextInt(Alkalmazott.getNyugdijkorhatar()));
			
			System.out.println(alkalmazottak[i]);
		
		}
		
		System.out.println("A megv�ltoztatott korhat�rral:");
		Alkalmazott.setNyugdijkorhatar(60);
		
		for (Alkalmazott alkalmazott : alkalmazottak) {
			System.out.println(alkalmazott);
		}
		
		beolv.close();
	}
	
}