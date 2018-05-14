package bank;

public class CreditCard extends Card {

	private int hitelkeret;

	public CreditCard(String tulaj_neve, int egyenleg) {
		super(tulaj_neve, egyenleg);
		this.hitelkeret = 100000;
	}

	public CreditCard(String tulaj_neve, int egyenleg, int hitelkeret) {
		super(tulaj_neve, egyenleg);
		this.hitelkeret = hitelkeret;
	}

	@Override
	public boolean pénzFelvetel(int osszeg) {
		if (hitelkeret + getEgyenleg() >= osszeg) {
			if (getEgyenleg() >= osszeg) {
				super.pénzFelvetel(osszeg);	
			}else if((hitelkeret - osszeg) >= 0)  {
				hitelkeret -= osszeg;
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "CreditCard [hitelkeret=" + hitelkeret + ", getEgyenleg()=" + getEgyenleg() + ", getTulaj_neve()="
				+ getTulaj_neve() + "]";
	}

	public int getHitelkeret() {
		return hitelkeret;
	}

	public void setHitelkeret(int hitelkeret) {
		this.hitelkeret = hitelkeret;
	}
	
	
	
	
	
}
