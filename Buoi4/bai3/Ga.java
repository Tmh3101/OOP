package bai3;

public class Ga extends ConVat{

	public Ga() {
		super();
	}
	
	public Ga(String giong, String mauLong, float canNang) {
		super(giong, mauLong, canNang);
	}
	
	public Ga(Ga other) {
		super(other);
	}
	
	public void Keu() {
		System.out.println("cuc tat");
	}
}
