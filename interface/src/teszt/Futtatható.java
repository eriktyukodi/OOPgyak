package teszt;

import java.awt.Color;

import masik.SzinesPont;

import sajat.I_Sz�nezhet�;

public class Futtathat� {

	public static void main(String[] args) {

		I_Sz�nezhet� szinespont = new SzinesPont(Color.BLUE);
		System.out.println(szinespont);
		
		szinespont.setAlapertelmezett(Color.GREEN);
		System.out.println(szinespont);
		
		atszinez(szinespont);
		System.out.println(szinespont);
	}
	
	public static void atszinez(I_Sz�nezhet� objektum) {
		objektum.setAlapertelmezett(objektum.alapertelmezett);
	}

	
	
}
