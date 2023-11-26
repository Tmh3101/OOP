package model;

import java.util.Scanner;

public class KhachHang {
	private String cccd, hten;
	private int nsinh;

	public KhachHang() {
		cccd = new String();
		hten = new String();
		nsinh = 0;
	}

	public KhachHang(KhachHang kh) {
		cccd = new String(kh.cccd);
		hten = new String(kh.hten);
		nsinh = kh.nsinh;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap CCCD: ");
		cccd = sc.nextLine();
		System.out.print("Nhap Ho Va Ten: ");
		hten = sc.nextLine();
		System.out.print("Nhap Nam Sinh: ");
		nsinh = sc.nextInt();
	}
	
	public void in() {
		System.out.println("CCCD: " + cccd);
		System.out.println("Ho Va Ten: " + hten);
		System.out.println("Nam Sinh: " + nsinh);
	}
	public float layTlegiam() {
		return 0;
	}
}
