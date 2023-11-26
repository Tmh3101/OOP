package bai1;

import java.util.Scanner;

public class SDDiem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Diem A = new Diem(3, 4);
		System.out.print("A: ");
		A.hienThi();
		
		Diem B = new Diem();
		System.out.println("nhap diem B: ");
		B.nhapDiem();
		System.out.print("B: ");
		B.hienThi();
		
		Diem C = new Diem(-B.getX(), -B.getY());
		System.out.print("C: ");
		C.hienThi();
		
		System.out.println("khoang cach tu diem B den tam O: " + B.khoangCach());
		System.out.println("khoang cach tu diem A den diem B: " + A.khoangCach(B));
		sc.close();
	}
}
