package myproducts;

public class Bread extends Product {
		private double mennyiseg;

		public Bread(String productname, int net_value, int VAT_value,
				double mennyiseg) {
			super(productname, net_value, VAT_value);
			this.mennyiseg = mennyiseg;
		}
		
	@Override
		public String toString() {
			return "Bread [" + super.toString() + ", egységár: " + brutto_value()/ mennyiseg + "]"; 
		
		}

		public double getMennyiseg() {
			return mennyiseg;
		}

		public static boolean elso_kenyer_nagyobb_egysegar(Bread elso_kenyer, Bread masodik_kenyer) {
			if (elso_kenyer.brutto_value() / elso_kenyer.mennyiseg > masodik_kenyer.brutto_value() / masodik_kenyer.mennyiseg) {
				return true;
			}else
				return false;
				
			}
		}
		


	

