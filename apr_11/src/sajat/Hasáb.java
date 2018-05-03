package sajat;

public abstract class Hasáb {
	
	protected int magassag;

	public Hasáb(int magassag) {
		this.magassag = magassag;
	}

	public int getMagassag() {
		return magassag;
	}
	
	public abstract int getAlapterulet();
		
	public int getTerfogat() {
		return getAlapterulet() * magassag;
	}

	public boolean összehasolítás(Hasáb masik){
		return (getTerfogat() > masik.getTerfogat());

	}

}
