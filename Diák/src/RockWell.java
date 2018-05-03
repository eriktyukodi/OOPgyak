
public class RockWell {

	public static void main(String[] args) {
		int i = 0;
		OvatosDiak Student1 = new OvatosDiak( "Erik", 10000, 1500);
		
		while (Student1.sorozik(300)) {
		i++;		
		}
		
		System.out.println(i + ". sör");
		System.out.println("Pénzmag:" + Student1.student_money);
		
	}
	
}
