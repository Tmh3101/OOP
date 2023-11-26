package bai2;

public class SDDate {
	public static void main(String[] args) {
		Date date = new Date(31, 1, 2004);
		date.printDate();
		System.out.println("Cap nhat date...");
		date.enterDate();
		System.out.println("Date da duoc cap nhat...");
		date.printDate();
		System.out.println("Ngay hom sau: " + date.nextDay());
		
		System.out.println("20 ngay sau la ngay: " + date.addDate(20));
	}
}
