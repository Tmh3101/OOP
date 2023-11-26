package bai4;

import java.util.Scanner;

public class Bai_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		String tmp1 = "", tmp2 = "";
		boolean check;
		do {
			check = true;
			tmp1 = sc.nextLine();
			tmp2 = sc.nextLine();
			try {
				a = Integer.parseInt(tmp1);
				b = Integer.parseInt(tmp2);
			} catch (Exception e) {
				System.out.println("error, nhap lai !");
				check = false;
			}
		} while (check == false);
		System.out.println((a + b));
		sc.close();
	}
}
