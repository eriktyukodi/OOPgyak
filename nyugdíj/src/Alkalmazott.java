public class Alkalmazott {

	private String nev;
	private int kor;
	private long fizetes;
	private int mennyivan;

	private static int nyugdijkorhatar = 65;

	public Alkalmazott(String nev, int kor, long fizetes) {
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}
	
	public Alkalmazott(String nev, int kor) {
		this.nev = nev;
		this.kor = kor;
		this.fizetes = kor * 15000;
	}
	
	public int mennyivan (){
		return kor - nyugdijkorhatar; // mivel a nyugdijkorhatar int típusú ezért a returnhoz nem kell zárójelbe kiírni az intet, mert az típuskonverzió
	}

	@Override
	public String toString() {
		return "Alkalmazott [nev=" + nev + ", kor=" + kor + ",\t fizetes="
				+ fizetes + ",\t mennyivan()=" + mennyivan() + "]";
	}

	public static void setNyugdijkorhatar(int nyugdijkorhatar) {
		Alkalmazott.nyugdijkorhatar = nyugdijkorhatar;
	}
	
	public static Alkalmazott tobbEveVanHatra(Alkalmazott elsoAlkalmazott, Alkalmazott masodikAlkalmazott) {
		if (elsoAlkalmazott.mennyivan()>masodikAlkalmazott.mennyivan()) {
			return elsoAlkalmazott;
		} else {
			return masodikAlkalmazott;
		}
	}

	public static int getNyugdijkorhatar() {
		return nyugdijkorhatar;
	}
	
	
		
}