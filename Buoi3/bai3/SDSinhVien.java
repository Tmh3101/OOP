package bai3;

import java.util.Arrays;
import java.util.Scanner;

public class SDSinhVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SinhVien a = new SinhVien();
		a.nhap();
		a.nhapDiem();
		System.out.println("Register subject");
		a.dangKyMonHoc();
		System.out.println("Thong tin sinh vien a: " + a);
		
		System.out.print("Enter number of student: ");
		int n = sc.nextInt();
		SinhVien []listSinhVien = new SinhVien[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Student " + (i + 1) + " :");
			listSinhVien[i] = new SinhVien();
			listSinhVien[i].nhap();
			listSinhVien[i].nhapDiem();
		}
		int maxIndex = 0;
		System.out.println("Sinh vien bi canh bao hoc vu: ");
		for(int i = 0; i < n; i++) {
			if(listSinhVien[i].tinhDiemTrungBinh() < 2) System.out.println(listSinhVien[i]);
			if(listSinhVien[i].tinhDiemTrungBinh() > listSinhVien[maxIndex].tinhDiemTrungBinh()) maxIndex = i;
		}
		System.out.println("Student has highest avg mark: " + listSinhVien[maxIndex]);
		
		Arrays.sort(listSinhVien);
		
		for(int i = 0; i < n; i++) {
			System.out.println(listSinhVien[i]);
		}
		
		sc.close();
	}
}
