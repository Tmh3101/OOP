package bai2;

import java.util.Scanner;

public class Date {
	int day, month, year;
	
	private Scanner sc = new Scanner(System.in);

	public Date() {
		day = 1;
		month = 1;
		year = 1;
	}

	public Date(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}
	
	public Date(Date d) {
		day = d.day;
		month = d.month;
		year = d.year;
	}

	public void printDate() {
		System.out.println(day + "/" + month + "/" + year);
	}

	public boolean valid() {
		if (month < 1 || month > 12 || year < 1) return false;
		int dayOfMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (month == 2 && (year % 400 == 0 && (year % 4 == 0 && year % 100 != 0))) {
			dayOfMonth[1] = 29;
		}
		if (day >= 1 && day <= dayOfMonth[month - 1]) return true;
		return false;
	}
	
	public void enterDate() {
		do {
			System.out.print("Nhap ngay: ");
			day = sc.nextInt();
			System.out.print("Nhap thang: ");
			month = sc.nextInt();
			System.out.print("Nhap nam: ");
			year = sc.nextInt();
			if (!(valid())){
				System.out.println("Ngay khong hop le, hay nhap lai");
			}
		} while (!(valid()));
	}

	public Date nextDay() {
		Date d = new Date(day, month, year);
		d.day++;
		if (!(d.valid())) {
			d.day = 1;
			d.month++;
		}
		if (!(d.valid())) {
			d.month = 1;
			d.year++;
		}
		return d;
	}

	public Date addDate(int n) {
		Date d = new Date(day, month, year);
		for (int i = 0; i < n; i++) {
			d = d.nextDay();
		}
		return d;
	}
	
	public String toString() {
		return day + "/" + month + "/" + year;
	}

}
