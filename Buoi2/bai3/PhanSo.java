package bai3;

import java.util.Scanner;

public class PhanSo {
	int tu, mau;
	public PhanSo() {}
	public PhanSo(int tu, int mau) {
		this.tu = tu;
		this.mau = mau;
	}
	Scanner sc = new Scanner(System.in);
	public void nhapPhanSo() {
		 do {
			 System.out.print("nhap tu so: ");
			 this.tu = sc.nextInt();
			 System.out.print("nhap mau so: ");
			 this.mau = sc.nextInt();
			 if (this.mau == 0) System.out.println("mau so khong the bang 0, hay nhap lai");
		 } while (this.mau == 0);
	}
	
	public void hienThiPhanSo() {
		if (mau == 1) System.out.println(tu);
		else if (tu == 0) System.out.println(0);
		else System.out.println(tu + "/" + mau);
	}
	
	public void nghichDao() {
		int tmp = tu;
		tu = mau;
		mau = tmp;
	}
	
	public PhanSo giaTriNghichDao() {
		PhanSo ps = new PhanSo(mau, tu);
		return ps;
	}
	
	public float giaTriThuc() {
		return (float)tu / mau;
	}
	
	public boolean lonHon(PhanSo a) {
		return this.giaTriThuc() - a.giaTriThuc() > 0;
	}
	
	public PhanSo congPhanSo(PhanSo a) {
		int n = this.tu * a.mau + a.tu * this.mau;
		int m = this.mau * a.mau;
		PhanSo result = new PhanSo(n, m);
		n = Math.abs(n);
		m = Math.abs(m);
		while (m != 0) {
			int tmp = n % m;
			n = m;
			m = tmp;
		}
		result.tu /= n;
		result.mau /= n;
		return result;
	}
	
	public PhanSo congPhanSo(int a) {
		int n = this.tu + a * this.mau;
		int m = this.mau;
		PhanSo result = new PhanSo(n, m);
		n = Math.abs(n);
		m = Math.abs(m);
		while (m != 0) {
			int tmp = n % m;
			n = m;
			m = tmp;
		}
		result.tu /= n;
		result.mau /= n;
		return result;
	}
	
	public PhanSo truPhanSo(PhanSo a) {
		int n = this.tu * a.mau - a.tu * this.mau;
		int m = this.mau * a.mau;
		PhanSo result = new PhanSo(n, m);
		n = Math.abs(n);
		m = Math.abs(m);
		while (m != 0) {
			int tmp = n % m;
			n = m;
			m = tmp;
		}
		result.tu /= n;
		result.mau /= n;
		return result;
	}
	
	public PhanSo truPhanSo(int a) {
		int n = this.tu - a * this.mau;
		int m = this.mau;
		PhanSo result = new PhanSo(n, m);
		n = Math.abs(n);
		m = Math.abs(m);
		while (m != 0) {
			int tmp = n % m;
			n = m;
			m = tmp;
		}
		result.tu /= n;
		result.mau /= n;
		return result;
	}
	
	public PhanSo nhanPhanSo(PhanSo a) {
		int n = this.tu * a.tu;
		int m = this.mau * a.mau;
		PhanSo result = new PhanSo(n, m);
		n = Math.abs(n);
		m = Math.abs(m);
		while (m != 0) {
			int tmp = n % m;
			n = m;
			m = tmp;
		}
		result.tu /= n;
		result.mau /= n;
		return result;
	}
	
	public PhanSo nhanPhanSo(int a) {
		int n = this.tu * a;
		int m = this.mau;
		PhanSo result = new PhanSo(n, m);
		n = Math.abs(n);
		m = Math.abs(m);
		while (m != 0) {
			int tmp = n % m;
			n = m;
			m = tmp;
		}
		result.tu /= n;
		result.mau /= n;
		return result;
	}
	
	public PhanSo chiaPhanSo(PhanSo a) {
		int n = this.tu * a.mau;
		int m = this.mau * a.tu;
		PhanSo result = new PhanSo(n, m);
		n = Math.abs(n);
		m = Math.abs(m);
		while (m != 0) {
			int tmp = n % m;
			n = m;
			m = tmp;
		}
		result.tu /= n;
		result.mau /= n;
		return result;
	}
	
	public PhanSo chiaPhanSo(int a) {
		int n = this.tu;
		int m = this.mau * a;
		PhanSo result = new PhanSo(n, m);
		n = Math.abs(n);
		m = Math.abs(m);
		while (m != 0) {
			int tmp = n % m;
			n = m;
			m = tmp;
		}
		result.tu /= n;
		result.mau /= n;
		return result;
	}
	
	@Override
	public String toString() {
		if (mau == 1) return tu + "";
		else if (tu == 0) return 0 + "";
		else return + tu + "/" + mau;
	}
}
