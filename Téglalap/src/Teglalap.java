public class Teglalap {
	private int a_oldal;
	private int b_oldal;
	
	//KONSTRUKTOR = speciális method aminek a neve megegyezik a Class nevével
		//void típusú de nem írjuk ki(mert nincs visszatérési értéke)
		//super = õsnek a konstruktorát hívja meg, ott is maradhat de sok vizet nem zavar. Minden osztály õse az Object.
		//this.valami = erre akarunk hivatkozni a methodban
	
	public Teglalap(int a_oldal, int b_oldal) {
		setOldalak(a_oldal, b_oldal);
	}
	
	//POLIMORFIZMUS = több alakuság
		/* egy method túl is terhelhetõ, egy method-ot többször is meglehet adni különbözõ adattagokkal(method overloading) 
			de ezt különbözõ paraméterszigmatúrával kell definiálni.*/
		// korai kötés
		// a fordítás alatt összeköti a methodokat a paraméterek alapján
	
	//mi van ha négyzet az a téglalap
	public Teglalap(int oldalhossz) {
		//a_oldal = oldalhossz;
		//setOldalak(oldalhossz)<-- ez is megfelelõ
		this (oldalhossz,oldalhossz);
		
	}

	public int terulet()
	{
		int terulet = a_oldal * b_oldal;
		return terulet;
	}

	@Override // felüldefiniálás az õsben is felülírja a methodot 
				// polimorfizmushoz kapcsolódik
	public String toString() {
		return a_oldal + ", " + b_oldal
				+ ", "+ terulet();
	}

	public void setOldalak(int a_oldal, int b_oldal) {
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}
	public void setOldalak(int oldalhossz){
		setOldalak(oldalhossz,oldalhossz);
		
	}
	
	public boolean nagyobbTerületûMint(Teglalap masikTeglalap) {
		return terulet() > masikTeglalap.terulet();
	}
	public boolean nagyobbAzOldala(Teglalap masikTeglalap) {
		return a_oldal == masikTeglalap.a_oldal && b_oldal == masikTeglalap.b_oldal;
		
	}
	
}
