package bai2;

import java.io.File;
import java.util.Scanner;

import bai1.Diem;


public class SDDoanThang {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		Diem A = new Diem(2, 5);
		Diem B = new Diem(20, 35);  
		DoanThang AB = new DoanThang(A, B);
		System.out.println("AB: ");
		AB.print();
		AB.tinhTien(5, 3);
		System.out.println("AB sau khi tinh tien (5, 3): ");
		AB.print();
		DoanThang CD = new DoanThang();
		System.out.println("Nhap doan thang CD: ");
		CD.enter();
		System.out.println("Do dai doan thang CD: " + CD.doDai());
		System.out.println("Goc CD hop voi truc hoanh: " + CD.gocVoiTrucHoanh());

		DSDoanThang danhSach = new DSDoanThang();
		
		
		danhSach.themDoanThang(AB);
		danhSach.themDoanThang(CD);
		
		System.out.print("Nhap ten file: ");
	
		String str = sc.nextLine();
		
		File file = new File(str);

		danhSach.luuDanhSach(file);
		
		danhSach.hienThiDSDoanThang();
		
		sc.close();
	}
}
