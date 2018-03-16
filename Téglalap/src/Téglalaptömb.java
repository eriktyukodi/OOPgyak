// math.random véletlenszámot generál 0-99 között
public class Téglalaptömb {
	public static void main(String[] args){
		int size = 10;
		Teglalap [] téglalapok /*de ide is jöhet a []*/ = new Teglalap[size];
		
		for (int i = 0; i<téglalapok.length; i++)
		{
			téglalapok[i] = new Teglalap((int)(Math.random() * 9)+2);
			System.out.println(téglalapok[i]);
		}
		
	// kiírni a legkisebb területû téglalapot, minimum keresés
		int minterulet = 0;
		for(int i=1; i<téglalapok.length; i++){
			if (téglalapok[minterulet].nagyobbTerületûMint(téglalapok[i])) {
				minterulet = i;
			}
		}
		System.out.println(téglalapok[minterulet]);
	}
}

