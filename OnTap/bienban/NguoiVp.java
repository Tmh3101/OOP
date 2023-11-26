package bienban;

import java.util.Scanner;

public class NguoiVp {
	private String cccd, hten, dchi, ngaysinh;
	
	public NguoiVp() {
		cccd = new String();
		hten = new String();
		dchi = new String();
		ngaysinh = new String();
	}
	
	public NguoiVp(NguoiVp o) {
		cccd = new String(o.cccd);
		hten = new String(o.hten);
		dchi = new String(o.dchi);
		ngaysinh = new String(o.ngaysinh);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap CCCD: ");
		cccd = sc.nextLine();
		System.out.print("Nhap ho ten: ");
		hten = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		dchi = sc.nextLine();
		System.out.print("Nhap ngay sinh (dd-MM-yyy): ");
		ngaysinh = sc.nextLine();
	}
	
	public void in() {
		System.out.println("CCCD: " + cccd);
		System.out.println("Ho ten: " + hten);
		System.out.println("Dia chi: " + dchi);
		System.out.println("Ngay sinh: " + ngaysinh);
	}
	
	public int layNamSinh() {
		return Integer.valueOf(ngaysinh.substring(ngaysinh.lastIndexOf('-') + 1).trim());
	}
	
	public static void main(String[] args) {
		NguoiVp vp1 = new NguoiVp();
		System.out.println("***Nhap thong tin nguoi vi pham vp1:");
		vp1.nhap();
		System.out.println("***Thong tin nguoi vi pham vp1:");
		vp1.in();
		
		NguoiVp vp2 = new NguoiVp(vp1);
		System.out.println("***Thong tin nguoi vi pham vp2:");
		vp1.in();

		
		
	}
}
