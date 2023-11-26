package benhnhan;

import java.util.Scanner;

public class BNhan {
	private String hten;
	private boolean gtinh;
	private int nsinh;
	private float cnang;
	
	public BNhan() {
		hten = new String();
		gtinh = true;
		nsinh = 0;
		cnang = 0;
	}
	
	public BNhan(BNhan o) {
		hten = new String(o.hten);
		gtinh = o.gtinh;
		nsinh = o.nsinh;
		cnang = o.cnang;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten benh nhan: ");
		hten = sc.nextLine();
		System.out.print("Nhap gioi tinh benh nhan(True - Nam, False - Nu): ");
		gtinh = sc.nextBoolean();
		System.out.print("Nhap nam sinh cua benh nhan: ");
		nsinh = sc.nextInt();
		System.out.print("Nhap can nang cua benh nhan: ");
		cnang = sc.nextFloat();
	}
	
	public void in() {
		System.out.println("Ho ten benh nhan: " + hten);
		System.out.println("Gioi tinh: " + ((gtinh) ? "Nam" : "Nu"));
		System.out.println("Nam sinh benh nhan: " + nsinh);
		System.out.println("Can nang benh nhan: " + cnang);
	}
	
	public static void main(String[] args) {
		BNhan bn1 = new BNhan();
		System.out.println("***Nhap thong tin benh nhan 1");
		bn1.nhap();
		System.out.println("***Thong tin benh nhan 1");
		bn1.in();
		
		BNhan bn2 = new BNhan(bn1);
		System.out.println("***Thong tin benh nhan 2");
		bn2.in();
	}
	
}
