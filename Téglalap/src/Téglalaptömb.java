// math.random v�letlensz�mot gener�l 0-99 k�z�tt
public class T�glalapt�mb {
	public static void main(String[] args){
		int size = 10;
		Teglalap [] t�glalapok /*de ide is j�het a []*/ = new Teglalap[size];
		
		for (int i = 0; i<t�glalapok.length; i++)
		{
			t�glalapok[i] = new Teglalap((int)(Math.random() * 9)+2);
			System.out.println(t�glalapok[i]);
		}
		
	// ki�rni a legkisebb ter�let� t�glalapot, minimum keres�s
		int minterulet = 0;
		for(int i=1; i<t�glalapok.length; i++){
			if (t�glalapok[minterulet].nagyobbTer�let�Mint(t�glalapok[i])) {
				minterulet = i;
			}
		}
		System.out.println(t�glalapok[minterulet]);
	}
}

