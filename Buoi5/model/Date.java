package model;

import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;

	public Date() {
		ngay = 1;
		thang = 1;
		nam = 1;
	}

	public Date(int d, int m, int y) {
		ngay = d;
		thang = m;
		nam = y;
	}
	
	public Date(Date d) {
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}

	public void in() {
		System.out.println(ngay + "/" + thang + "/" + nam);
	}

	public boolean hopLe() {
		if (thang < 1 || thang > 12 || nam < 1) return false;
		int dayOfMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (thang == 2 && (nam % 400 == 0 && (nam % 4 == 0 && nam % 100 != 0))) {
			dayOfMonth[1] = 29;
		}
		if (ngay >= 1 && ngay <= dayOfMonth[thang - 1]) return true;
		return false;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap ngay: ");
			ngay = sc.nextInt();
			System.out.print("Nhap thang: ");
			thang = sc.nextInt();
			System.out.print("Nhap nam: ");
			nam = sc.nextInt();
			if (!(hopLe())){
				System.out.println("Ngay khong hop le, hay nhap lai");
			}
		} while (!(hopLe()));
	}

	public Date ngayHomSau() {
		Date d = new Date(ngay, thang, nam);
		d.ngay++;
		if (!(d.hopLe())) {
			d.ngay = 1;
			d.thang++;
		}
		if (!(d.hopLe())) {
			d.thang = 1;
			d.nam++;
		}
		return d;
	}

	public Date congNgay(int n) {
		Date d = new Date(ngay, thang, nam);
		for (int i = 0; i < n; i++) {
			d = d.ngayHomSau();
		}
		return d;
	}
	
	public String toString() {
		return ngay + "/" + thang + "/" + nam;
	}

}
