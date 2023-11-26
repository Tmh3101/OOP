package bai3;

public class De extends ConVat{
	
	public De() {
		super();
	}
	
	public De(String giong, String mauLong, float canNang) {
		super(giong, mauLong, canNang);
	}
	
	public De(De other) {
		super(other);
	}
	
	public void Keu() {
		System.out.println("bee bee");
	}
}
