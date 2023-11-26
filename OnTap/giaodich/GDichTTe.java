package giaodich;

import java.util.ArrayList;
import java.util.Scanner;

public class GDichTTe extends GDich{
	private float dgia;
	private int sluong;
	private char loai;
	private float tgia;
	
	public GDichTTe() {
		super();
		dgia = 0.0f;
		sluong = 0;
		loai = 'a';
		tgia = 0.0f;
	}
	
	public GDichTTe(GDichTTe gdtt) {
		super(gdtt);
		dgia = gdtt.dgia;
		sluong = gdtt.sluong;
		loai = gdtt.loai;
		tgia = gdtt.tgia;
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap don gia: ");
		dgia = sc.nextFloat();
		System.out.print("Nhap so luong: ");
		sluong = sc.nextInt();
		System.out.print("Nhap loai: ");
		loai = sc.next().charAt(0);
		System.out.print("Nhap ti gia: ");
		tgia = sc.nextFloat();
	}
	
	public void in() {
		super.in();
		System.out.println("- Don gia: " + dgia);
		System.out.println("- So luong: " + sluong);
		System.out.println("- Loai: " + loai);
		System.out.println("- Ti gia: " + tgia);
	}
	
	public char getLoai() {
		return loai;
	}
	
	public float getGiaTriGiaoDich() {
		return dgia * sluong * tgia;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		GDich []ds = new GDich[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Giao Dich(0)/ Giao Dich Tien Te(1): ");
			int choice = sc.nextInt();
			
			if(choice == 0) ds[i] = new GDich();
			else ds[i] = new GDichTTe();
			
			ds[i].nhap();
		}
		
		System.out.print("Cac ma so giao dich tien te co gia tri tren 100.000 VND:");
		for(int i = 0; i < n; i++) {
			if(ds[i].getLoai() == 'V' && ds[i].getGiaTriGiaoDich() >= 100000) {
				System.out.print(ds[i].getMgd() + ", ");
			}
		}
		System.out.println();
		
		
		System.out.println("Thong ke so tien theo thang nam:");
		ArrayList<String> dsThangNam = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			String thangNam = ds[i].getThangNam();
			if(!dsThangNam.contains(thangNam)) dsThangNam.add(thangNam);
		}
	
		
		for (String thangNam : dsThangNam) {
			float soTien = 0.0f;
			for(int i = 0; i < n; i++) {
				if(ds[i].getThangNam().equals(thangNam)) {
					soTien += ds[i].getGiaTriGiaoDich();
				}
			}
			System.out.println("- " + thangNam + " : " + soTien);
		}
		
	}
}
