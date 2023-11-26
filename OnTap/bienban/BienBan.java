package bienban;

import java.util.ArrayList;
import java.util.Scanner;

public class BienBan {
	private String mabb, ngay;
	private int solan;
	private String bienso;
	private NguoiVp nguoivp;
	
	public BienBan() {
		mabb = new String();
		ngay = new String();
		solan = 0;
		bienso = new String();
		nguoivp = new NguoiVp();
	}
	
	public BienBan(BienBan o) {
		mabb = new String(o.mabb);
		ngay = new String(o.ngay);
		solan = o.solan;
		bienso = new String(o.bienso);
		nguoivp = new NguoiVp(o.nguoivp);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma bien ban: ");
		mabb = sc.nextLine();
		System.out.print("Nhap ngay lap bien ban: ");
		ngay = sc.nextLine();
		System.out.print("Nhap so lan vi pham: ");
		solan = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap bien so: ");
		bienso = sc.nextLine();
		System.out.println("Nhap thong tin nguoi vi pham");
		nguoivp.nhap();
	}
	
	public void in() {
		System.out.println("Ma bien ban: " + mabb);
		System.out.println("Ngay lap bien ban: " + ngay);
		System.out.println("So lan vi pham: " + solan);
		System.out.println("Bien so: " + bienso);
		System.out.println("- Thong tin nguoi vi pham");
		nguoivp.in();
	}
	
	public long tienPhat() {
		if(solan == 0) return 0;
		float tmp = 0;
		for(int i = 0; i < solan; i++) {
			tmp += Math.pow(1.2, i);
		}
		return (long)(300000 * tmp);
	}
	
	public NguoiVp layNguoiVP() {
		return nguoivp;
	}
	
	public int layNamLapBienBan() {
		return Integer.valueOf(ngay.substring(ngay.lastIndexOf('-') + 1).trim());
	}
	
	public int layMaTinh() {
		return Integer.valueOf(bienso.trim().substring(0, 1));
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("- Nhap so luong nguoi vi pham: ");
		int n = sc.nextInt();
		
		ArrayList<BienBan> dsBienBan = new ArrayList<BienBan>();
		
		for(int i = 0; i < n; i++) {
			BienBan bb = new BienBan();
			System.out.println("***Nhap thong tin bien ban thu " + (i + 1) + " :");
			bb.nhap();
			dsBienBan.add(bb);
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println("***Thong tin bien ban thu " + (i + 1) + " :");
			dsBienBan.get(i).in();
		}
		
		System.out.println("***May khua bi phat tien tren 1000000:");
		for (BienBan bb : dsBienBan) {
			if(2023 - bb.layNguoiVP().layNamSinh() > 16 && bb.tienPhat() > 1000000) {
				bb.in();
			}
		}
		
		float vdd2020 = 0, vdd2023 = 0;
		for (BienBan bb : dsBienBan) {
			if(bb.layMaTinh() != 65) continue;
			if(bb.layNamLapBienBan() == 2020) vdd2020 += 1;
			if(bb.layNamLapBienBan() == 2023) vdd2023 += 1;
		}
		
		float tile = (vdd2023 / vdd2020) - 1;
		if(tile < 0) System.out.println("***Ti le vuot den do giam: " + Math.abs(tile));
		else System.out.println("***Ti le vuot den do tang: " + tile);
		
	}
	
}
