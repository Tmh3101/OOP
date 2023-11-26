package bai2;

import java.util.Scanner;

import bai3.SinhVien;

public class SinhVienCNTT extends SinhVien{
	private String taikhoan, matkhau, email;
	
	public SinhVienCNTT() {
		super();
		taikhoan = new String();
		matkhau = new String();
		email = new String();
	}
	
	public SinhVienCNTT(String mssv, String hoTen, Date ngaySinh, int soMonHocDangKy) {
		super(mssv, hoTen, ngaySinh, soMonHocDangKy);
		taikhoan = new String();
		matkhau = new String();
		email = new String();
	}
	
	public SinhVienCNTT(SinhVienCNTT sv) {
		super(sv);
		taikhoan = new String(sv.taikhoan);
		matkhau = new String(sv.matkhau);
		email = new String(sv.email);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tai khoan: ");
		taikhoan = sc.nextLine();
		System.out.print("Nhap mat khau: ");
		matkhau = sc.nextLine();
		System.out.print("Nhap email: ");
		email = sc.nextLine();
		super.nhap();
	}
	
	public void hienThi() {
		System.out.println("Tai khoan: " + taikhoan);
		System.out.println("Email: " + email);
		super.hienThi();
	}
	
	public String toString() {
		return "Tai khoan: " + taikhoan + " | Email: " + email + super.toString();
	}
	
	public void doiMatKhau(String newpass) {
		matkhau = newpass;
	}
	
	public String getEmail() {
		return email;
	}
}
