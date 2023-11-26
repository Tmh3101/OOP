package chibo_dangvien;

import java.util.ArrayList;
import java.util.Scanner;

public class DangVien {
	private String sothe, hoten, ngaysinh;
	private float heso;
	private ChiBo chibo;
	
	public DangVien() {
		sothe = new String();
		hoten = new String();
		ngaysinh = new String();
		heso = 0;
		chibo = new ChiBo();
	}
	
	public DangVien(DangVien o) {
		sothe = new String(o.sothe);
		hoten = new String(o.hoten);
		ngaysinh = new String(o.ngaysinh);
		heso = o.heso;
		chibo = new ChiBo(o.chibo);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so the Dang vien: ");
		sothe = sc.nextLine();
		System.out.print("Nhap ho ten Dang vien: ");
		hoten = sc.nextLine();
		System.out.print("Nhap ngay sinh: ");
		ngaysinh = sc.nextLine();
		System.out.print("Nhap he so: ");
		heso = sc.nextFloat();
		System.out.println("- Nhap chi bo:");
		chibo.nhap();
	}
	
	public void in() {
		System.out.println("So the Dang vien: " + sothe);
		System.out.println("Ho ten Dang vien: " + hoten);
		System.out.println("Ngay sinh: " + ngaysinh);
		System.out.println("He so: " + heso);
		System.out.println("- Thong tin chi bo:");
		chibo.in();
	}
	
	public int layNamSinh() {
		return Integer.valueOf(ngaysinh.substring(ngaysinh.lastIndexOf('-') + 1).trim());
	}
	
	public String layHoTen() {
		return hoten;
	}
	
	public float layHeSo() {
		return heso;
	}
	
	public ChiBo layChiBo() {
		return chibo;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong Dang vien: ");
		int n = sc.nextInt();
		ArrayList<DangVien> ds = new ArrayList<DangVien>();
		
		for(int i = 0; i < n; i++) {
			DangVien dv = new DangVien();
			System.out.println("--------------------");
			System.out.println("***Nhap thong tin cho Dang vien thu " + (i + 1) + ":");
			dv.nhap();
			ds.add(dv);
		}
		
		for(int i = 0; i < ds.size(); i++) {
			System.out.println("--------------------");
			System.out.println("***Thong tin cho Dang vien thu " + (i + 1) + ":");
			ds.get(i).in();
		}
		
		System.out.println("--------------------");
		System.out.println("***Cac Dang vien sinh sau nam 1975:");
		for (DangVien dv : ds) {
			if(dv.layNamSinh() > 1975) System.out.println("- " + dv.layHoTen());
		}
		
		System.out.println("--------------------");
		System.out.println("***Thong tin cac Dang vien thuoc chi bo mmt va co he so luong tu 4.32 tro len:");
		for (DangVien dv : ds) {
			if(dv.layChiBo().layTenChiBo().equals("mmt") && dv.layHeSo() >= 4.32) {
				System.out.println("*Thong tin-------:");
				dv.in();
			}
		}
	}
}
