package bai1;

import java.util.Scanner;

public class SDGach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so loai gach: ");
		int n = sc.nextInt();
		
		Gach []dsGach = new Gach[n];
		for(int i = 0; i < n; i++) {
			dsGach[i] = new Gach();
			System.out.println("nhap loai gach " + (i + 1) + " :");
			dsGach[i].enter();
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Loai gach " + (i + 1) + " :");
			dsGach[i].print();
		}
		int maxIndex = 0;
		for(int i = 1; i < n; i++) {
			if ((1.0f * dsGach[i].getCost() / dsGach[i].acreage()) > (1.0f * dsGach[maxIndex].getCost() / dsGach[maxIndex].acreage())) maxIndex = i;
		}
		System.out.println("loai gach co chi phi thap nhat(gai tien / don vi dien tich): " + dsGach[maxIndex]);
		for(int i = 0; i < n; i++) {
			System.out.println("Loai gach " + (i + 1) + " : " + dsGach[i].soLuongHopGach(5, 20) * dsGach[i].getCost());
		}
		
		sc.close();
	}
}
