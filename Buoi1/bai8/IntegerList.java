package bai8;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerList {
	int []list;
	int n;
	
	public void enterList() {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap so phan tu: ");
		n = sc.nextInt();
		list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public void printList() {
		for (int i : list) {
			System.out.print(i + " ");
		}
	}
	
	public int countX(int x) {
		int cnt = 0;
		for (int i : list) {
			if (i == x) cnt++;
		}
		return cnt;
	}
	
	public void sortUp() {
		Arrays.sort(list);
	}
}
