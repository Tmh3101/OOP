package bai5;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		
		GiaiPTBac2 giaiPT = new GiaiPTBac2();
		giaiPT.GiaiPT(a, b, c);
		
		sc.close();
	}
}
