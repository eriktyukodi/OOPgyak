package galaxis;

public abstract class Egitest {
	private String név;

	public Egitest(String név) {
		super();
		this.név = név;
	}

	public String getNév() {
		return név;
	}
	
	public abstract float átszámít(int tömeg);
}
