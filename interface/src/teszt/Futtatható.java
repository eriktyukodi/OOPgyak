package teszt;

import java.awt.Color;

import masik.SzinesPont;

import sajat.I_Színezhetõ;

public class Futtatható {

	public static void main(String[] args) {

		I_Színezhetõ szinespont = new SzinesPont(Color.BLUE);
		System.out.println(szinespont);
		
		szinespont.setAlapertelmezett(Color.GREEN);
		System.out.println(szinespont);
		
		atszinez(szinespont);
		System.out.println(szinespont);
	}
	
	public static void atszinez(I_Színezhetõ objektum) {
		objektum.setAlapertelmezett(objektum.alapertelmezett);
	}

	
	
}
