package bai6;

import java.util.Scanner;
import java.util.Stack;

public class Bai_6 {
	
	static void nt(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.println(n + " khong phai la so nguyen to");
				return;
			}
		}
		System.out.println(n + " la so nguyen to");
	}
	
	static void printBinaryOf(int n) {
		if (n == 0) {
			System.out.println("binary of " + n + " : " + n);
			return;
		}
		Stack<Integer> binary = new Stack<Integer>();
		int tmp = n;
		while (n > 0) {
			binary.push(n % 2);
			n /= 2;
		}
		System.out.print("binary of " + tmp + " : ");
		while (binary.size() > 0) {
			System.out.print(binary.pop());
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		nt(n);
		printBinaryOf(n);
		sc.close();
	}
}
