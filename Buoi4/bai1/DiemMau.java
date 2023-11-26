package bai1;

import java.util.Scanner;

public class DiemMau extends Diem{
	private String mau;
	
	public DiemMau() {
		super();
		mau = "";
	}
	
	public DiemMau(int x, int y, String mau) {
		super(x, y);
		this.mau = mau;
	}
	
	public DiemMau(DiemMau dm) {
		super(dm.getX(), dm.getY());
		this.mau = new String(dm.mau);
	}
	
	public void ganMau(String mau) {
		this.mau = mau;
	}
	
	public void nhap() {
		System.out.println("-->Nhap Toa Do: ");
		super.nhapDiem();
		Scanner sc = new Scanner(System.in);
		System.out.print("-->Nhap Mau: ");
		mau = sc.nextLine();
	}
	
	public void hienThi() {
		System.out.print("Toa Do: ");
		super.hienThi();
		System.out.println("Mau: " + mau);
	}
	
	public String toString() {
		return "Toa do: " +  super.toString() + ", Mau: " + mau;
	}
}
