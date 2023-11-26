package model;

import java.util.Scanner;

public class HangHoa {
	private String mso, ten, nsxuat;
	
	public HangHoa() {
		mso = new String();
		ten = new String();
		nsxuat = new String();
	}
	
	public HangHoa(String mso, String ten, String nsxuat) {
		this.mso = new String(mso);
		this.ten = new String(ten);
		this.nsxuat = new String(nsxuat);
	}
	
	
	
	public HangHoa(HangHoa hh) {
		mso = new String(hh.mso);
		ten = new String(hh.ten);
		nsxuat = new String(hh.nsxuat);
	}
	
	
	
	public String getMso() {
		return mso;
	}

	public String getTen() {
		return ten;
	}

	public String getNsxuat() {
		return nsxuat;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Ma So Hang Hoa: ");
		mso = sc.nextLine();
		System.out.print("Nhap Ten Hang Hoa: ");
		ten = sc.nextLine();
		System.out.print("Nhap Noi San Xuat: ");
		nsxuat = sc.nextLine();
	}
	
	public void in() {
		System.out.println("Ma So Hang Hoa: " + mso);
		System.out.println("Ten Hang Hoa: " + ten);
		System.out.println("Noi San Xuat: " + nsxuat);
	}
}
