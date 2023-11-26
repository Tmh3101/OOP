package benhnhan;

import java.util.Scanner;

public class BNCovid extends BNhan{
	private String ngay;
	private char loai;
	private String odich;
	private String noi;
	
	public BNCovid() {
		super();
		ngay = new String();
		loai = 'a';
		odich = new String();
		noi = new String();
	}
	
	public BNCovid(BNCovid o) {
		super(o);
		ngay = new String(o.ngay);
		loai = o.loai;
		odich = new String(o.odich);
		noi = new String(o.noi);
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ngay cach ly: ");
		ngay = sc.nextLine();
		System.out.print("Nhap loai nhiem: ");
		loai = sc.next().charAt(0);
		System.out.print("Nhap o dich: ");
		odich = sc.nextLine();
		System.out.print("Nhap noi cach ly: ");
		noi = sc.nextLine();
	}
	
	public void in() {
		super.in();
		System.out.println("Ngay cach ly: " + ngay);
		System.out.println("Loai nhiem: " + loai);
		System.out.println("O dich: " + odich);
		System.out.println("Noi cach ly: " + noi);
	}
	
	
	
	public static void main(String[] args) {
		
	}
}