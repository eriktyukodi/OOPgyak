package sajat.teszt;

import sajat.*;

public class Futtathat� {
	
	
	public static void main(String[] args) {
	
	Henger henger1 = new Henger(2,5);
	Has�b henger2 = new Henger(3,7);
	
	System.out.println(henger1);
	System.out.println(henger1.getTerfogat());
	
	T�glatest teglatest = new T�glatest(3,6,5);
	System.out.println(teglatest);
	
	//melyik a nagyobb t�rfogat�?
	
	System.out.println("Melyik a nagyobb t�rfogat�?");
	if(henger1.�sszehasol�t�s(teglatest))
		{
			System.out.println("henger1 nagyobb");
		}
	else
		{
			System.out.println("teglatest a nagyobb");
		}

	}
}
	

