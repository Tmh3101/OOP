package bai5;

public class GiaiPTBac2 {
	public void GiaiPT (float a, float b, float c) {
		if (a == 0) {
			GiaiPTBac1 giai = new GiaiPTBac1();
			giai.GiaiPT(b, c);
		} else {
			float delta = b*b - 4*a*c;
			if (delta > 0) {
				System.out.println("phuong trinh bac 2 co 2 nghiem phan biet");
				System.out.println("x1 = " + (((-b) + Math.sqrt(delta))/(2 * a)));
				System.out.println("x2 = " + (((-b) - Math.sqrt(delta))/(2 * a)));
			} else if (delta == 0) {
				System.out.println("phuong trinh 2 co nghiem kep");
				System.out.println("x1 = x2 = " + ((-b)/(2 * a)));
			} else {
				System.out.println("phuong trinh vo nghiem");
			}
		}
	}
}
