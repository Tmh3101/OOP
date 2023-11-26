package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class SDPhanSo {
	public static void main(String[] args) {
		PhanSo a = new PhanSo(3, 7);
		PhanSo b = new PhanSo(4, 9);
		
		System.out.print("Phan so a: ");
		a.hienThiPhanSo();
		System.out.print("Phan so b: ");
		b.hienThiPhanSo();
		
		Scanner sc = new Scanner(System.in);
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		System.out.println("nhap phan so x:");
		x.nhapPhanSo();
		System.out.println("nhap phan so y:");
		y.nhapPhanSo();
		
		System.out.print("Phan so x: ");
		x.hienThiPhanSo();
		System.out.print("Phan so y: ");
		y.hienThiPhanSo();
		
		System.out.println("Gia tri nghich dao cua x: " + x.giaTriNghichDao());
		System.out.println("x + y = " + x.congPhanSo(y));
		
		/*
		System.out.print("Nhap so phan so (n): ");
		int n = sc.nextInt();
		PhanSo[] arrPhanSo = new PhanSo[n];
		for (int i = 0; i < n; i++) {
			System.out.println("nhap phan so " + (i + 1));
			arrPhanSo[i] = new PhanSo();
			arrPhanSo[i].nhapPhanSo();
		}
		

		
		PhanSo sumOfArrPhanSo = arrPhanSo[0];
		for (int i = 1; i < n; i++) {
			sumOfArrPhanSo = sumOfArrPhanSo.congPhanSo(arrPhanSo[i]);
		}
		System.out.println("tong cua mang phan so: " + sumOfArrPhanSo);
		
		PhanSo max = arrPhanSo[0];
		for (int i = 1; i < n; i++) {
			if (arrPhanSo[i].lonHon(max)) max = arrPhanSo[i];
		}
		System.out.println("phan so lon nhat la: " + max);
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arrPhanSo[i].lonHon(arrPhanSo[j])) {
					PhanSo tmp = arrPhanSo[i];
					arrPhanSo[i] = arrPhanSo[j];
					arrPhanSo[j] = tmp;
				}
			}
		}
		
		System.out.println("mang phan so sau khi duoc sap xep:");
		for (int i = 0; i < n; i++) {
			arrPhanSo[i].hienThiPhanSo();
		}
		*/
		
		ArrayList<PhanSo> arrList = new ArrayList<PhanSo>();
		System.out.print("Nhap n : ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			PhanSo tamp = new PhanSo();
			System.out.println("Nhap phan so thu " + (i + 1) + " : ");
			tamp.nhapPhanSo();
			arrList.add(tamp);
		}
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arrList.get(i).lonHon(arrList.get(j))) {
					PhanSo tmp = arrList.get(i);
					arrList.set(i, arrList.get(j));
					arrList.set(j, tmp);
				}
			}
		}
		
		System.out.println("mang phan so sau khi duoc sap xep:");
		for (int i = 0; i < n; i++) {
			arrList.get(i).hienThiPhanSo();
		}
		

		sc.close();
	}
}
