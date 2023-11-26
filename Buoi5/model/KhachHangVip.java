package model;

import java.util.Scanner;

public class KhachHangVip extends KhachHang{
	private float tlegiam;
	
	public KhachHangVip() {
		super();
		tlegiam = 0;
	}
	
	public KhachHangVip(KhachHangVip khv) {
		super(khv);
		tlegiam = khv.tlegiam;
	}
	
	public float layTlegiam() {
		return tlegiam;
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Ti Le Giam: ");
		tlegiam = sc.nextFloat();
	}
	
	public void in() {
		super.in();
		System.out.println("Ti Le Giam: " + tlegiam);
	}
}
