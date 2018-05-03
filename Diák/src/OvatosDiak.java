
public class OvatosDiak extends Diak {

	int travel_expenses;

	public OvatosDiak(String student_name, int student_money, int travel_expenses) {
		super(student_name, student_money);
		this.travel_expenses = travel_expenses;
	}

	@Override
	public boolean sorozik(int beer_price) {
			if (getStudent_money() > travel_expenses + beer_price) {
				return super.sorozik(beer_price);
			} else {
				return false;
			}
		
	}

	@Override
	public String toString() {
		return "OvatosDiak [travel_expenses=" + travel_expenses + ", getStudent_money()=" + getStudent_money() + "]";
	}
	
}
