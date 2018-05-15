package galaxis;

public class Bolygo extends Egitest {

	private float kering�si_id�;
	private int �tm�r�;
	
	
	public Bolygo(String n�v, float kering�si_id�, int �tm�r�) {
		super(n�v);
		this.kering�si_id� = kering�si_id�;
		this.�tm�r� = �tm�r�;
	}


	public float getKering�si_id�() {
		return kering�si_id�;
	}


	public int get�tm�r�() {
		return �tm�r�;
	}


	@Override
	public String toString() {
		return "Bolygo [kering�si_id�=" + kering�si_id� + ", �tm�r�=" + �tm�r� + ", getN�v()=" + getN�v() + "]";
	}
	
	public boolean �sszehasonl�t (Bolygo m�sikbolyg�) {
		if(this.�tm�r�>m�sikbolyg�.�tm�r�) {
			return true;
		}else {
			return false;
		}
	}
	
	public static Bolygo r�videbbKering�s (Bolygo egyik, Bolygo kett�) {
		if (egyik.getKering�si_id�() < kett�.getKering�si_id�()) {
			return egyik;
		}else {
			return kett�;
		}
	
	}

		  static double tomb[] = new double[]{0.78, 0.39, 2.65, 1.17, 1.05, 1.23};
		 
	@Override
	public float �tsz�m�t(int f�ldi_t�meg) {
		switch (getN�v()) {
		case "Venus":
			return (float)(f�ldi_t�meg* tomb[0]);
		case "Mars":
			return (float)(f�ldi_t�meg* tomb[1]);
		case "Jupiter":
			return (float)(f�ldi_t�meg* tomb[2]);
		case "Saturn":
			return (float)(f�ldi_t�meg* tomb[3]);
		case "Neptune":
			return (float)(f�ldi_t�meg* tomb[4]);
		}
			
		return f�ldi_t�meg;
	}
	
	
	
	

	}

