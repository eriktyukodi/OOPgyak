package galaxis.teszt;

import java.util.Scanner;

import galaxis.Bolygo;

public class BolygoTeszt {

	public static void main(String[] args) {
		Bolygo tombi[] = new Bolygo[8];

		tombi[0] = new Bolygo("Merkur", (float)0.24, 4878);
		tombi[1] = new Bolygo("Vénusz", (float)0.62, 12104);
		tombi[2] = new Bolygo("Föld", (float)1, 12756);
		tombi[3] = new Bolygo("Mars", (float)1.88, 6794);
		tombi[4] = new Bolygo("Jupiter", (float)11.86, 142800);
		tombi[5] = new Bolygo("Saturnus", (float)29.46, 120000);
		tombi[6] = new Bolygo("Uranusz", (float)84.01, 50800);
		tombi[7] = new Bolygo("Neptunusz", (float)164.79, 48600);
		
		
		
		int legkisebbIndex = 0;
	for (int i = 1; i < tombi.length; i++) {
		if (tombi[legkisebbIndex ].getÁtmérõ() > tombi[i].getÁtmérõ()) {
			legkisebbIndex = i;
			
		}//if
		
	}//for
		
	System.out.println(tombi[legkisebbIndex].toString());
		
	int darab = 0;
	for (int i = 0; i < tombi.length; i++) {
		if(tombi[2].getKeringési_idõ() > tombi[i].getKeringési_idõ()) {
			darab++;
		}
	}
		System.out.println(darab);
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 3; i < 6; i++) { //mindegy h mettõl meddig csak 3 legyen
			int földi_tömeg = 0;
		System.out.println("Kérem a földi tömeget:");
		
		földi_tömeg = scanner.nextInt();
		System.out.println(tombi[i].átszámít(földi_tömeg));
		}
		
		for (Bolygo x : tombi) {
			System.out.println(x.toString());
		}
		
	}//main

	
	
}//class




