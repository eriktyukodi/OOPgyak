package galaxis;

public class Bolygo extends Egitest {

	private float keringési_idõ;
	private int átmérõ;
	
	
	public Bolygo(String név, float keringési_idõ, int átmérõ) {
		super(név);
		this.keringési_idõ = keringési_idõ;
		this.átmérõ = átmérõ;
	}


	public float getKeringési_idõ() {
		return keringési_idõ;
	}


	public int getÁtmérõ() {
		return átmérõ;
	}


	@Override
	public String toString() {
		return "Bolygo [keringési_idõ=" + keringési_idõ + ", átmérõ=" + átmérõ + ", getNév()=" + getNév() + "]";
	}
	
	public boolean összehasonlít (Bolygo másikbolygó) {
		if(this.átmérõ>másikbolygó.átmérõ) {
			return true;
		}else {
			return false;
		}
	}
	
	public static Bolygo rövidebbKeringés (Bolygo egyik, Bolygo kettõ) {
		if (egyik.getKeringési_idõ() < kettõ.getKeringési_idõ()) {
			return egyik;
		}else {
			return kettõ;
		}
	
	}

		  static double tomb[] = new double[]{0.78, 0.39, 2.65, 1.17, 1.05, 1.23};
		 
	@Override
	public float átszámít(int földi_tömeg) {
		switch (getNév()) {
		case "Venus":
			return (float)(földi_tömeg* tomb[0]);
		case "Mars":
			return (float)(földi_tömeg* tomb[1]);
		case "Jupiter":
			return (float)(földi_tömeg* tomb[2]);
		case "Saturn":
			return (float)(földi_tömeg* tomb[3]);
		case "Neptune":
			return (float)(földi_tömeg* tomb[4]);
		}
			
		return földi_tömeg;
	}
	
	
	
	

	}

