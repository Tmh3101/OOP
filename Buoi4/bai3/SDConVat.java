package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class SDConVat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong con vat: ");
		int n = sc.nextInt();
		
		ArrayList<ConVat> ds = new ArrayList<ConVat>();
		for(int i = 0; i < n; i++) {
			ConVat cv = new ConVat();
			int choice;
			
			System.out.println("*** Con vat thu " + (i + 1) +" :");
			do {
				System.out.println("1. Bo");
				System.out.println("2. Heo");
				System.out.println("3. De");
				System.out.println("4. Ga");
				System.out.print("--> Nhap lua chon: ");
				choice = sc.nextInt();
			
				if(choice == 1) cv = new Bo();
				else if(choice == 2) cv = new Heo();
				else if(choice == 3) cv = new De();
				else if(choice == 4) cv = new Ga();
				else {
					System.out.println("Lua chon khong hop le, nhap lai lua chon");
				}
			} while(choice < 1 || choice > 4);
			
			cv.nhap();
			ds.add(cv);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print("Con vat thu " + (i + 1) + " : ");
			ds.get(i).Keu();
		}
		
	}
}
