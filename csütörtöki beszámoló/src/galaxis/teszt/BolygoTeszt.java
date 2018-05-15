package galaxis.teszt;

import java.util.Scanner;

import galaxis.Bolygo;

public class BolygoTeszt {

	public static void main(String[] args) {
		Bolygo tombi[] = new Bolygo[8];

		tombi[0] = new Bolygo("Merkur", (float)0.24, 4878);
		tombi[1] = new Bolygo("V�nusz", (float)0.62, 12104);
		tombi[2] = new Bolygo("F�ld", (float)1, 12756);
		tombi[3] = new Bolygo("Mars", (float)1.88, 6794);
		tombi[4] = new Bolygo("Jupiter", (float)11.86, 142800);
		tombi[5] = new Bolygo("Saturnus", (float)29.46, 120000);
		tombi[6] = new Bolygo("Uranusz", (float)84.01, 50800);
		tombi[7] = new Bolygo("Neptunusz", (float)164.79, 48600);
		
		
		
		int legkisebbIndex = 0;
	for (int i = 1; i < tombi.length; i++) {
		if (tombi[legkisebbIndex ].get�tm�r�() > tombi[i].get�tm�r�()) {
			legkisebbIndex = i;
			
		}//if
		
	}//for
		
	System.out.println(tombi[legkisebbIndex].toString());
		
	int darab = 0;
	for (int i = 0; i < tombi.length; i++) {
		if(tombi[2].getKering�si_id�() > tombi[i].getKering�si_id�()) {
			darab++;
		}
	}
		System.out.println(darab);
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 3; i < 6; i++) { //mindegy h mett�l meddig csak 3 legyen
			int f�ldi_t�meg = 0;
		System.out.println("K�rem a f�ldi t�meget:");
		
		f�ldi_t�meg = scanner.nextInt();
		System.out.println(tombi[i].�tsz�m�t(f�ldi_t�meg));
		}
		
		for (Bolygo x : tombi) {
			System.out.println(x.toString());
		}
		
	}//main

	
	
}//class




