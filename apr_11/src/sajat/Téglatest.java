package sajat;

public class Téglatest extends Hasáb {

	private int a_oldal;
	private int b_oldal;
	
	public Téglatest(int magassag, int a_oldal, int b_oldal) {
		super(magassag);
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}	

	@Override
	public int getAlapterulet() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Téglatest [a_oldal=" + a_oldal + ", b_oldal=" + b_oldal
				+ ", getMagassag()=" + getMagassag() + "]";
	}

}

