package szgep.teszt;

import java.util.Scanner;

import szgep.Adathordozo;
import szgep.Merevlemez;

public class Taroloteszt {

	public static void main(String[] args) {
		
		int size = 2;
		
		Merevlemez[] tomb = new Merevlemez[size];
		
		Scanner read = new Scanner(System.in);
		
		for (int i = 0; i < tomb.length; i++) {
			System.out.println("Adja meg az adatokat!");
			System.out.println("márka");
				String marka = read.nextLine();
				System.out.println("kapacitás");
				int kapacitas = Integer.parseInt(read.nextLine());
				System.out.println("foglalt");
				int foglalt_terulet =  Integer.parseInt(read.nextLine());
				tomb[i] = new Merevlemez(marka, kapacitas, foglalt_terulet);
		}
		
		int maxindex = 0;
		for (int i = 1; i < tomb.length; i++) {
			if(tomb[maxindex].getKapacitas() < tomb[i].getKapacitas()) {
				maxindex = i;
			} 
		}
		System.out.println(tomb[maxindex].toString());
		
		int darab = 0;
		for (int i = 0; i < tomb.length; i++) {
			if(tomb[i].getFoglalt_terulet() < tomb[i].getszabadHely()) {
				darab++;
			}
		}
		System.out.println("darab");
		System.out.println(darab);
		
		for (Merevlemez x : tomb) {
			System.out.println(x.toString());
		}
		
	}

}
