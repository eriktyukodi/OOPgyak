package szgep;
import java.util.*;

public abstract class Adathordozo {

	private String marka;
	private int kapacitas;
	
	public Adathordozo(String marka, int kapacitas) {
		super();
		this.marka = marka;
		this.kapacitas = kapacitas;
	}

	public int getKapacitas() {
		return kapacitas;
	}

	public String getMarka() {
		return marka;
	}
	
	abstract double szabadHely();
	
	
	
}
