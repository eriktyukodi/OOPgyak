package sajat;

public abstract class Has�b {
	
	protected int magassag;

	public Has�b(int magassag) {
		this.magassag = magassag;
	}

	public int getMagassag() {
		return magassag;
	}
	
	public abstract int getAlapterulet();
		
	public int getTerfogat() {
		return getAlapterulet() * magassag;
	}

	public boolean �sszehasol�t�s(Has�b masik){
		return (getTerfogat() > masik.getTerfogat());

	}

}
