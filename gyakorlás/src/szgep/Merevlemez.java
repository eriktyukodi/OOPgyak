package szgep;

public class Merevlemez extends Adathordozo {

	@Override
	double szabadHely() {
		double szabadHely = getKapacitas() - foglalt_terulet;
		return 0;
	}
	
	private double foglalt_terulet;

	public Merevlemez(String marka, int kapacitas, double foglalt_terulet) {
		super(marka, kapacitas);
		this.foglalt_terulet = foglalt_terulet;
	}

	public double getFoglalt_terulet() {
		return foglalt_terulet;
	}

	@Override
	public String toString() {
		return "Merevlemez [szabadHely()=" + szabadHely() + ", getFoglalt_terulet()=" + getFoglalt_terulet()
				+ ", getKapacitas()=" + getKapacitas() + ", getMarka()=" + getMarka() + "]";
	}
	
	public boolean tobbHely (Merevlemez masikMerevlemez) {
		return szabadHely() > masikMerevlemez.szabadHely();
	}
	//osztályszintû metódus
	public static Adathordozo MelyikANagyobb (Adathordozo Merevlemez1, Adathordozo Merevlemez2) {
		if (Merevlemez1.getKapacitas() > Merevlemez2.getKapacitas()) {
			return Merevlemez1;
		}else return Merevlemez2;
	}
	

	

	
	

}
