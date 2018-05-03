package myproducts;
//net_value = nettó ár
//áfakulcs = VAT_value
public class Product {

		private String productname;
		private int net_value;
		private int VAT_value;
		private int new_VAT;
		
		public Product(String productname, int net_value, int VAT_value) {
			this.productname = productname;
			this.net_value = net_value;
			this.VAT_value = VAT_value;
			this.new_VAT = new_VAT;
			
		}
		
		public int brutto_value() {
			return (int) ((1+ VAT_value / 100.0) * net_value);
			
		}

		@Override
		public String toString() {
			return "Product [productname=" + productname + ", brutto_value()="
					+ brutto_value() + "]";
		}
		
		public int  nettoNoveles() {
			return net_value = (int) (net_value * (1+ VAT_value / 100.0));	
		}
		
		public int összehasonlítás(Product other) {
			if (brutto_value() > other.brutto_value()) {
				return 1;
			}else if (brutto_value() < other.brutto_value()){
				return 0;
			}
			else{
				return -1;
			}
		}	
}
