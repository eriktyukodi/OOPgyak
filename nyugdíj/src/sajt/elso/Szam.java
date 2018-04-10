package sajt.elso;

public class Szam {

	private static final double tures = 0.001;
	private double szam;
	
	public Szam(double szam){
		this.szam = szam;
	}

	public double getSzam() {
		return szam;
	}

	public void setSzam(double szam) {
		this.szam = szam;
	}
	
	public boolean szamTureshataronBelulVanE(int szam){
		return Math.abs(this.szam - szam) < tures; 
	}

}
