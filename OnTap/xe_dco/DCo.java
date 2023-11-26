package xe_dco;

import java.util.Scanner;

public class DCo {
	private String ten;
	private float dtich;
	private String ngay;
	
	public DCo() {
		ten = new String();
		dtich = 0.0f;
		ngay = new String();
	}
	
	public DCo(DCo o) {
		ten = new String(o.ten);
		dtich = o.dtich;
		ngay = new String(o.ngay);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten dong co: ");
		ten = sc.nextLine();
		System.out.print("Nhap dung tich dong co: ");
		dtich = sc.nextFloat();
		sc.nextLine();
		System.out.print("Nhap ngay: ");
		ngay = sc.nextLine();
	}
	
	public void in() {
		System.out.println("Ten dong co: " + ten);
		System.out.println("Dung tich dong co: " + dtich);
		System.out.println("Ngay: " + ngay);
	}
	
	public String getNgay() {
		return ngay;
	}
	
	
	public static void main(String[] args) {
		DCo d1 = new DCo();
		System.out.println("***Nhap thong tin cho dong co d1:");
		d1.nhap();
		System.out.println("***Thong tin cua dong co d1 la: ");
		d1.in();
		DCo d2 = new DCo(d1);
		System.out.println("***Thong tin cua dong co d2 la: ");
		d2.in();
	}
	
}