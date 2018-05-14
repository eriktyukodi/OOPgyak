package bank;

public class Card {

		private String tulaj_neve;
		private int egyenleg;
		
		public Card(String tulaj_neve, int egyenleg) {
			super();
			this.tulaj_neve = tulaj_neve;
			this.egyenleg = egyenleg;
		}

		public int getEgyenleg() {
			return egyenleg;
		}

		public void setEgyenleg(int egyenleg) {
			this.egyenleg = egyenleg;
		}

		public String getTulaj_neve() {
			return tulaj_neve;
		}
		
		public boolean pénzFelvetel (int osszeg) {
			if (egyenleg - osszeg >= 0) {
				egyenleg =- osszeg;
				return true;
			}else{
				return false;
			}
		}

		@Override
		public String toString() {
			return "Card [tulaj_neve=" + tulaj_neve + ", egyenleg=" + egyenleg + "]";
		}
		
		
		
}
