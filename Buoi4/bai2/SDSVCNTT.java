package bai2;

import java.util.ArrayList;
import java.util.Scanner;

import bai3.SinhVien;

public class SDSVCNTT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so sinh vien: ");
		int n = sc.nextInt();
		
		ArrayList<SinhVien> ds = new ArrayList<SinhVien>();

		SinhVien sv;
		for(int i = 0; i < n; i++) {
			System.out.println("*** Nhap sinh vien " + (i + 1) + ":");
			System.out.print("Muon them Sinh Vien(1) / Sinh Vien CNTT(2): ");
			int choice = sc.nextInt();
			if(choice == 1) sv = new SinhVien();
			else sv = new SinhVienCNTT();
			sv.nhap();
			sv.nhapDiem();
			ds.add(sv);
		}
		
		sc.nextLine();
		System.out.print("Nhap email sinh vien can tim: ");
		String email = sc.nextLine();
		
		for(int i = 0; i < ds.size(); i++) {
			if(ds.get(i).getEmail().equals(email)) {
				ds.get(i).hienThi();
			}
		}
	}
}
