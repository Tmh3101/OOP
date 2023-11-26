package bai3;

public class Heo extends ConVat{
	
	public Heo() {
		super();
	}
	
	public Heo(String giong, String mauLong, float canNang) {
		super(giong, mauLong, canNang);
	}
	
	public Heo(Heo other) {
		super(other);
	}
	
	public void Keu() {
		System.out.println("un in");
	}
}
