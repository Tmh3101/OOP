package bai3;

public class Bai_3 {

	public static void main(String[] args) {
		float tmp, sum = 0, max = Float.MIN_VALUE;
		for (String s : args) {
			try {
				tmp = Float.parseFloat(s);
			} catch (Exception e) {
				tmp = 0;
			}
			sum += tmp;
			if (tmp > max) max = tmp;
		}
		System.out.println("sum = " + sum);
		System.out.println("max = " + max);
	}
}