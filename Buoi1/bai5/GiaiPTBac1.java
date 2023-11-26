package bai5;

public class GiaiPTBac1 {
	public void GiaiPT (float a, float b) {
		if (a == 0 && b != 0) {
			System.out.println("phuong trinh vo nghiem");
		} else if (a == 0 && b == 0) {
			System.out.println("phuong trinh vo so nghiem");
		} else {
			System.out.println("phuong trinh bac 1 co nghiem duy nhat");
			System.out.println("x = " + ((-b) / a));
		}
	}
}
