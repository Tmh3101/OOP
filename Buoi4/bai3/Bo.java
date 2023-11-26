package bai3;

public class Bo extends ConVat{
	
	public Bo() {
		super();
	}
	
	public Bo(String giong, String mauLong, float canNang) {
		super(giong, mauLong, canNang);
	}
	
	public Bo(Bo other) {
		super(other);
	}
	
	public void Keu() {
		System.out.println("moo moo");
	}
}
 