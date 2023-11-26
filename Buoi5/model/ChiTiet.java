package model;

import java.util.Scanner;

public class ChiTiet {
	private HangHoa hhoa;
	private int sluong;
	private float dgia;
	
	public ChiTiet() {
		hhoa = new HangHoa();
		sluong = 0;
		dgia = 0;
	}
	
	public ChiTiet(HangHoa hhoa, int sluong, float dgia) {
		this.hhoa = new HangHoa(hhoa);
		this.sluong = sluong;
		this.dgia = dgia;
	}
	
	public ChiTiet(ChiTiet ct) {
		sluong = ct.sluong;
		dgia = ct.dgia;
		hhoa = new HangHoa(ct.hhoa);
	}
	
	
	public HangHoa getHhoa() {
		return hhoa;
	}

	public int getSluong() {
		return sluong;
	}

	public float getDgia() {
		return dgia;
	}

	public void nhap() {
		System.out.println("Nhap Thong Tin:");
		hhoa.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap So Luong: ");
		sluong = sc.nextInt();
		System.out.print("Nhap Don Gia: ");
		dgia = sc.nextFloat();
	}
	
	public void in() {
		hhoa.in();
		System.out.println("So Luong: " + sluong);
		System.out.println("Don Gia: " + dgia);
	}
	
	public float ttien() {
		return sluong * dgia;
	}
	
	public void thaythe(ChiTiet ct) {
		hhoa = new HangHoa(ct.hhoa);
		sluong = ct.sluong;
		dgia = ct.dgia;
	}
	
	
}
