package masik;

import java.awt.Color;

import sajat.I_Sz�nezhet�;

public class SzinesPont extends Pont implements I_Sz�nezhet� {

	private Color sz�n;
	
	public SzinesPont(int x, int y, Color sz�n) {
		super(x, y);
		this.sz�n = sz�n;
	}
	
	public SzinesPont(Color sz�n) {
		super(0, 0);
		this.sz�n = sz�n; 
		
	}
	

	@Override
	public String toString() {
		return "SzinesPont [sz�n=" + sz�n + ", toString()=" + super.toString()
				+ "]";
	}



	@Override
	public Color getAlapertelmezett() {
		return alapertelmezett;
	}

	@Override
	public void setAlapertelmezett(Color sz�n) {
		this.sz�n = sz�n;
	}	

	public Color getSz�n() {
		return sz�n;
	}

	public void setSz�n(Color sz�n) {
		this.sz�n = sz�n;
	}

	
}