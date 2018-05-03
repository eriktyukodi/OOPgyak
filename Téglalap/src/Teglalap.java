public class Teglalap {
	private int a_oldal;
	private int b_oldal;
	
	//KONSTRUKTOR = speci�lis method aminek a neve megegyezik a Class nev�vel
		//void t�pus� de nem �rjuk ki(mert nincs visszat�r�si �rt�ke)
		//super = �snek a konstruktor�t h�vja meg, ott is maradhat de sok vizet nem zavar. Minden oszt�ly �se az Object.
		//this.valami = erre akarunk hivatkozni a methodban
	
	public Teglalap(int a_oldal, int b_oldal) {
		setOldalak(a_oldal, b_oldal);
	}
	
	//POLIMORFIZMUS = t�bb alakus�g
		/* egy method t�l is terhelhet�, egy method-ot t�bbsz�r is meglehet adni k�l�nb�z� adattagokkal(method overloading) 
			de ezt k�l�nb�z� param�terszigmat�r�val kell defini�lni.*/
		// korai k�t�s
		// a ford�t�s alatt �sszek�ti a methodokat a param�terek alapj�n
	
	//mi van ha n�gyzet az a t�glalap
	public Teglalap(int oldalhossz) {
		//a_oldal = oldalhossz;
		//setOldalak(oldalhossz)<-- ez is megfelel�
		this (oldalhossz,oldalhossz);
		
	}

	public int terulet()
	{
		int terulet = a_oldal * b_oldal;
		return terulet;
	}

	@Override // fel�ldefini�l�s az �sben is fel�l�rja a methodot 
				// polimorfizmushoz kapcsol�dik
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
	
	public boolean nagyobbTer�let�Mint(Teglalap masikTeglalap) {
		return terulet() > masikTeglalap.terulet();
	}
	public boolean nagyobbAzOldala(Teglalap masikTeglalap) {
		return a_oldal == masikTeglalap.a_oldal && b_oldal == masikTeglalap.b_oldal;
		
	}
	
}
