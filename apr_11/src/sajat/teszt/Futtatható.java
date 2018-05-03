package sajat.teszt;

import sajat.*;

public class Futtatható {
	
	
	public static void main(String[] args) {
	
	Henger henger1 = new Henger(2,5);
	Hasáb henger2 = new Henger(3,7);
	
	System.out.println(henger1);
	System.out.println(henger1.getTerfogat());
	
	Téglatest teglatest = new Téglatest(3,6,5);
	System.out.println(teglatest);
	
	//melyik a nagyobb térfogatú?
	
	System.out.println("Melyik a nagyobb térfogatú?");
	if(henger1.összehasolítás(teglatest))
		{
			System.out.println("henger1 nagyobb");
		}
	else
		{
			System.out.println("teglatest a nagyobb");
		}

	}
}
	

