package myproducts.run;

// import myproducts.Product;
// import myproducts.Bread;
import myproducts.*;

public class Run {

	public static void main(String[] args) {
		Product prod_obj = new Product ("Product", 20, 27);
		Bread bread_obj = new Bread("Bread", 100, 15, 0.5);
	
	System.out.println("A termékék adatai:");
	System.out.println(prod_obj);
	System.out.println(bread_obj);
	System.out.println();
	
	int melyik_dragabb = prod_obj.összehasonlítás(bread_obj);
	
		if (melyik_dragabb > 0) {
			System.out.println("aru a dragabb\n" + prod_obj);
		}
		else if (melyik_dragabb < 0) {
			System.out.println("kenyer a dragabb\n" + bread_obj);			
		}
		else {
			System.out.println("egyforma a bruttóár");
		}
		
		Product product2 = new Bread ("bread2", 210, 15, 1);
		System.out.println("product2.toString() eredménye: ");
		System.out.println(product2);
		
		System.out.println(((Bread) product2).getMennyiseg());
	}
}

