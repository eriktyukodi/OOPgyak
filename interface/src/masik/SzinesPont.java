package masik;

import java.awt.Color;

import sajat.I_Színezhetõ;

public class SzinesPont extends Pont implements I_Színezhetõ {

	private Color szín;
	
	public SzinesPont(int x, int y, Color szín) {
		super(x, y);
		this.szín = szín;
	}
	
	public SzinesPont(Color szín) {
		super(0, 0);
		this.szín = szín; 
		
	}
	

	@Override
	public String toString() {
		return "SzinesPont [szín=" + szín + ", toString()=" + super.toString()
				+ "]";
	}



	@Override
	public Color getAlapertelmezett() {
		return alapertelmezett;
	}

	@Override
	public void setAlapertelmezett(Color szín) {
		this.szín = szín;
	}	

	public Color getSzín() {
		return szín;
	}

	public void setSzín(Color szín) {
		this.szín = szín;
	}

	
}