package xe_dco;

import java.util.ArrayList;
import java.util.Scanner;

public class Xe {
	private String so;
	private String ten;
	private long gia;
	private char tthai;
	private DCo dco;
	
	public Xe() {
		so = new String();
		ten = new String();
		gia = 0;
		tthai = 'C';
		dco = new DCo();
	}
	
	public Xe(Xe o) {
		so = new String(o.so);
		ten = new String(o.ten);
		gia = o.gia;
		tthai = o.tthai;
		dco = new DCo(o.dco);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so xe: ");
		so = sc.nextLine();
		System.out.print("Nhap ten xe: ");
		ten = sc.nextLine();
		System.out.print("Nhap gia xe: ");
		gia = sc.nextLong();
		System.out.print("Nhap trang thai (C/K): ");
		tthai = sc.next().charAt(0);
		System.out.println("Nhap dong co xe:");
		dco.nhap();
	}
	
	public void in() {
		System.out.println("So xe: " + so);
		System.out.println("Loai xe: " + ten);
		System.out.println("Gia xe: " + gia);
		System.out.println("Trang thai: " + tthai);
		System.out.println("Dong co xe:");
		dco.in();
	}
	
	public char getTthai() {
		return tthai;
	}
	
	public long getlePhiTruocBa() {
		return (long)(gia * 0.1);
	}
	
	public String getSo() {
		return so;
	}
	
	public DCo getDco() {
		return dco;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so luong xe: ");
		int m = sc.nextInt();
		
		ArrayList<Xe> ds1 = new ArrayList<Xe>();
		
		for(int i = 0; i < m; i++) {
			Xe xe = new Xe();
			System.out.println("***Nhap thong tin cho xe so " + (i + 1) + " :");
			xe.nhap();
			ds1.add(xe);
		}
		
		for(int i = 0; i < m; i++) {
			System.out.println("***Thong tin cho xe so " + (i + 1) + " :");
			ds1.get(i).in();
			System.out.println("-> Le phi truoc ba: " + ds1.get(i).getlePhiTruocBa());
		}
		
		System.out.println("***Nhung xe bi thu hoi hoac co gia tri duoi 10.000.000:");
		for (Xe xe : ds1) {
			if(xe.getTthai() == 'K' &&  xe.getlePhiTruocBa() < 10000000) {
				System.out.println("- " + xe.getSo());
			}
		}
		
		long tong = 0;
		for (Xe xe : ds1) {
			String []ntn = xe.getDco().getNgay().split("-");
			if((Integer.valueOf(ntn[2]) == 2000 && Integer.valueOf(ntn[1]) < 10) || Integer.valueOf(ntn[2]) < 2000) {
				tong += xe.getlePhiTruocBa();
			}
		}
		System.out.println("***Tong le phi truoc ba cua cac loai dong co san xuat truoc 10/2000: " + tong);
		
		
	}
}
