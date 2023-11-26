package model;

import java.util.ArrayList;
import java.util.Scanner;

public class HoaDon {
	private String mso, tde, nvien;
	private ArrayList<ChiTiet> dsct;
	private KhachHang kh;
	private Date date;
	
	public HoaDon() {
		mso = new String();
		tde = new String();
		nvien = new String();
		dsct = new ArrayList<ChiTiet>();
		kh = new KhachHang();
		date = new Date();
	}
	
	public HoaDon(HoaDon hd) {
		mso = new String(hd.mso);
		tde = new String(hd.tde);
		nvien = new String(hd.nvien);
		dsct = new ArrayList<ChiTiet>();
		for (ChiTiet ct : hd.getDsct()) {
			dsct.add(ct);
		}
		kh = new KhachHang(hd.kh);
		date = new Date(hd.date);
	}
	
	public ArrayList<ChiTiet> getDsct() {
		return dsct;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Ma So Hoa Don: ");
		mso = sc.nextLine();
		System.out.print("Nhap Tieu De: ");
		tde = sc.nextLine();
		System.out.print("Nhap Ten Nhan Vien: ");
		nvien = sc.nextLine();
		System.out.print("Nhap So Loai Hang Hoa: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("* Nhap Cac Chi Tiet Cua Hoa Don: ");
		for(int i = 0; i < n; i++) {
			System.out.println("- Loai Hang Hoa " + (i + 1) + " :");
			ChiTiet ct = new ChiTiet();
			ct.nhap();
			dsct.add(ct);
		}
		
		System.out.println("* Nhap Thong Tin Khach Hang: ");
		System.out.print("Khach Hang(0) / Khach Hang Vip(1): ");
		int c = sc.nextInt();
		if(c == 1) kh = new KhachHangVip();
		kh.nhap();
		
		System.out.println("* Nhap Ngay Hoa Don: ");
		date.nhap();
	}
	
	public void in() {
		System.out.println("Ma So Hoa Don: " + mso);
		System.out.println("Tieu De: " + tde);
		System.out.println("Ten Nhan Vien: " + nvien);
		System.out.println("Chi Tiet Hoa Don: ");
		int i = 0;
		for (ChiTiet ct : dsct) {
			System.out.println("- Loai Hang Hoa " + (++i) + " :");
			ct.in();
		}
		System.out.println("Thong Tin Khach Hang: ");
		kh.in();
		System.out.println("Ngay Sinh: " + date);
	}
	
	public float tong() {
		float t = 0;	
		for (ChiTiet ct : dsct) {
			t += ct.ttien();
		}
		return t - (t * kh.layTlegiam());
	}
	
	public void themChiTiet(ChiTiet ct) {
		dsct.add(ct);
	}
	
	public void xoaChiTiet(ChiTiet ct) {
		dsct.remove(ct);
	}
	
	public boolean msoDaTonTai(ChiTiet oct) {
		for (ChiTiet ct : dsct) {
			if(ct.getHhoa().getMso().equals(oct.getHhoa().getMso())) return true;
		}
		return false;
	}
	
}
