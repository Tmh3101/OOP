package bai2;

import java.io.Serializable;

import bai1.Diem;

public class DoanThang implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Diem d1, d2;
	
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	public DoanThang(Diem d1, Diem d2) {
		this.d1 = new Diem(d1);
		this.d2 = new Diem(d2);
	}
	public DoanThang(int d1x, int d1y, int d2x, int d2y) {
		d1.setX(d1x);
		d1.setY(d1y);
		d2.setX(d2x);
		d2.setY(d1y);
	}
	
	public void enter() {
		System.out.println("Nhap diem 1:");
		d1.nhapDiem();
		System.out.println("Nhap diem 2:");
		d2.nhapDiem();
	}
	
	public void print() {
		System.out.println("Diem 1:");
		d1.hienThi();
		System.out.println("Diem 2:");
		d2.hienThi();
	}
	
	public String toString() {
		return "[" + d1 + " ; " + d2 + "]";
	}
	
	public void tinhTien(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	public float doDai() {
		return d1.khoangCach(d2);
	}
	
	public float gocVoiTrucHoanh() {
		if(d1.getY() > d2.getY()) {
			Diem tmp = new Diem(d1.getX(), d2.getY());
			return (float)Math.toDegrees(Math.atan(tmp.khoangCach(d1) / tmp.khoangCach(d2)));
		}
		if (d1.getY() < d2.getY()) {
			Diem tmp = new Diem(d2.getX(), d1.getY());
			return (float)Math.toDegrees(Math.atan(tmp.khoangCach(d2) / tmp.khoangCach(d1)));
		}
		else return 0.0f;
	}
}
