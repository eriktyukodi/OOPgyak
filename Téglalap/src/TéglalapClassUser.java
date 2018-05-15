
public class TéglalapClassUser {
	public static void main(String[] args) {
		Teglalap a_obj = new Teglalap(2);
		Teglalap b_obj = new Teglalap(3, 5);
		Teglalap c_obj = a_obj;
		
		System.out.println(a_obj);
		System.out.println(b_obj);
		System.out.println(c_obj);
		
		a_obj.setOldalak(6); //getter / setter meghívás
		
		System.out.println(a_obj);
		System.out.println(b_obj);
		System.out.println(c_obj);
		
		a_obj.setOldalak(3, 5);
		
		System.out.println(a_obj);
		System.out.println(b_obj);
		System.out.println(c_obj);
		
		System.out.println(a_obj == b_obj);
		System.out.println(a_obj == c_obj);
		System.out.println(a_obj.nagyobbAzOldala(b_obj));
		
	}

}
