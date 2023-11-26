package xe_chuyenxe;

import java.util.Scanner;

public class Xe {
	private String soxe;
	private String loai;
	private String ngay;
	private char tthai;
	
	public Xe() {
		soxe = new String();
		loai = new String();
		ngay = new String();
		tthai = 'C';
	}
	
	public Xe(Xe o) {
		soxe = new String(o.soxe);
		loai = new String(o.loai);
		ngay = new String(o.ngay);
		tthai = o.tthai;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so xe: ");
		soxe = sc.nextLine();
		System.out.print("Nhap loai xe: ");
		loai = sc.nextLine();
		System.out.print("Nhap ngay: ");
		ngay = sc.nextLine();
		System.out.print("Nhap trang thai (C/K): ");
		tthai = sc.next().charAt(0);
	}
	
	public void in() {
		System.out.println("So xe: " + soxe);
		System.out.println("Loai xe: " + loai);
		System.out.println("Ngay: " + ngay);
		System.out.println("Trang thai: " + tthai);
	}
	
	public char getTthai() {
		return tthai;
	}
	
	public String getThangNam() {
		return ngay.substring(ngay.indexOf('-') + 1);
	}
	
	public String getLoai() {
		return loai;
	}
	
	public static void main(String[] args) {
		Xe x1 = new Xe();
		System.out.println("Nhap thong tin cho x1:");
		x1.nhap();
		
		Xe x2 = new Xe(x1);
		System.out.println("Thong tin cua x2: ");
		x2.in();
	}
}
