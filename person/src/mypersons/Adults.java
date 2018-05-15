package mypersons;

public class Adults extends Person {
	
	private String workplace;

	public Adults(String name, int age, String workplace) {
		super(name, age);
		this.workplace = workplace;
	}

	@Override
	public String toString() {
		return "Adults [workplace=" + workplace + ", toString()="
				+ super.toString() + "]";
	}
	
	public String getWorkplace() {
		return workplace;
	}
	
	

}

