package bai3;

import java.util.Scanner;

public class ConVat {
	private String giong, mauLong;
	private float canNang;
	
	public ConVat() {
		giong = new String();
		mauLong = new String();
		canNang = 0.0f;
	}
	
	public ConVat(String giong, String mauLong, float canNang) {
		this.giong = new String(giong);
		this.mauLong = new String(mauLong);
		this.canNang = canNang;
	}
	
	public ConVat(ConVat other) {
		this.giong = new String(other.giong);
		this.mauLong = new String(other.mauLong);
		this.canNang = other.canNang;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap giong: ");
		giong = sc.nextLine();
		System.out.print("Nhap mau long: ");
		mauLong = sc.nextLine();
		System.out.print("Nhap can nang: ");
		canNang = sc.nextFloat();
	}
	
	public void hienThi() {
		System.out.println("Giong: " + giong);
		System.out.println("Mau long: " + mauLong);
		System.out.println("Can nang: " + canNang);
	}
	
	public String toString() {
		return " | Giong: " + giong + " | Mau long: " + mauLong + " | Can nang: " + canNang;
	} 
	
	public void Keu() {}
}
