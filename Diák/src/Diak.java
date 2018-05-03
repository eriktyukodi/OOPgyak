
public class Diak {
	
	String student_name;
	int student_money;
	
	public Diak(String student_name, int student_money) {
		super();
		this.student_name = student_name;
		this.student_money = student_money;
	}

	public int getStudent_money() {
		return student_money;
	}

	public boolean sorozik (int beer_price) {
		if (student_money >= beer_price) {
			student_money = student_money - beer_price;
			return true;
		} else {
			return false;
		}
	}
		
}
