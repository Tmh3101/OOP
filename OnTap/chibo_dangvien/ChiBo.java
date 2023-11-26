package chibo_dangvien;

import java.util.Scanner;

public class ChiBo {
	private String macb, tencb;
	private int slg;
	
	public ChiBo() {
		macb = new String();
		tencb = new String();
		slg = 0;
	}
	
	public ChiBo(String macb, String tencb, int slg) {
		this.macb = new String(macb);
		this.tencb = new String(tencb);
		this.slg = slg;
	}
	
	public ChiBo(ChiBo o) {
		macb = new String(o.macb);
		tencb = new String(o.tencb);
		slg = o.slg;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma chi bo: ");
		macb = sc.nextLine();
		System.out.print("Nhap ten chi bo: ");
		tencb = sc.nextLine();
		System.out.print("Nhap so luong dang vien: ");
		slg = sc.nextInt();
	}
	
	public void in() {
		System.out.println("Ma chi bo: " + macb);
		System.out.println("Ten chi bo: " + tencb);
		System.out.println("So luong dang vien: " + slg);
	}
	
	public static void main(String[] args) {
		ChiBo cb1 = new ChiBo();
		System.out.println("***Nhap thong tin chi bo cb1:");
		cb1.nhap();
		System.out.println("***Thong tin chi bo cb1:");
		cb1.in();
		
		ChiBo cb2 = new ChiBo(cb1);
		System.out.println("***Thong tin chi bo cb2:");
		cb2.in();
	}
	
	public String layTenChiBo() {
		return tencb;
	}
	
}
