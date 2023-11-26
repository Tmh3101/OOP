package giaodich;

import java.util.Scanner;

public class GDich {
	private int mgd;
	private String hten;
	private String ngay;
	private boolean tthai;
	
	public GDich() {
		mgd = 0;
		hten = new String();
		ngay = new String();
		tthai = false;
	}
	
	public GDich(GDich gd) {
		mgd = gd.mgd;
		hten = new String(gd.hten);
		ngay = new String(gd.ngay);
		tthai = gd.tthai;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap MGD: ");
		mgd = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap HoTen: ");
		hten = sc.nextLine();
		System.out.print("Nhap Ngay: ");
		ngay = sc.nextLine();
		tthai = true;
	}
	
	public void in() {
		System.out.println("- MGD: " + mgd);
		System.out.println("- HoTen: " + hten);
		System.out.println("- Ngay: " + ngay);
		System.out.println("- TrangThai: " + tthai);
	}
	
	public char getLoai() {
		return 'a';
	}
	
	public float getGiaTriGiaoDich() {
		return 0;
	}
	
	public int getMgd() {
		return mgd;
	}
	
	public String getThangNam() {
		return ngay.substring(ngay.indexOf('-') + 1);
	}

	public static void main(String[] args) {
		GDich gd1 = new GDich();
		System.out.println("Nhap giao dich 1: ");
		gd1.nhap();
		
		GDich gd2 = new GDich(gd1);
		System.out.println("Giao dich 2: ");
		gd2.in();
	}
	
}
