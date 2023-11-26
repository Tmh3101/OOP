package cnguoi_cthu;

import java.util.Scanner;

public class CNguoi {
	private String id;
	private String hten;
	private String ngay;
	private char phai;
	
	public CNguoi() {
		id = new String();
		hten = new String();
		ngay = new String();
		phai = 'M';
	}
	
	public CNguoi(CNguoi cn) {
		id = new String(cn.id);
		hten = new String(cn.hten);
		ngay = new String(cn.ngay);
		phai = cn.phai;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ID: ");
		id = sc.nextLine();
		System.out.print("Nhap ho ten: ");
		hten = sc.nextLine();
		System.out.print("Nhap ngay sinh: ");
		ngay = sc.nextLine();
		System.out.print("Nhap phai: ");
		phai = sc.next().charAt(0);
	}
	
	public void in() {
		System.out.println("ID: " + id);
		System.out.println("HoTen: " + hten);
		System.out.println("Ngay Sinh: " + ngay);
		System.out.println("Phai: " + phai);
	}
	
	public String getHten() {
		return hten;
	}
	
	public long tinhLuong() {
		return 0;
	}
	
	public String getClbo() {
		return "";
	}
	
	public String getMua() {
		return "";
	}
	
	public int getTuoi() {
		return 2023 - Integer.valueOf(ngay.substring(ngay.lastIndexOf('-') + 1));
	}
	
	public long getBthang() {
		return 0;
	}
	
	
	public static void main(String[] args) {
		CNguoi c1 = new CNguoi();
		System.out.println("Nhap thong tin cho c1:");
		c1.nhap();
		
		CNguoi c2 = new CNguoi(c1);
		System.out.println("Thong tin c2:");
		c2.in();
	}
	
}
