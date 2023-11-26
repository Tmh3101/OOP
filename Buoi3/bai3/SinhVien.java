package bai3;

import java.util.Scanner;

import bai2.Date;

public class SinhVien implements Comparable<SinhVien> {
    private String mssv, hoTen;
    private Date ngaySinh;
    private int soMonHocDangKy;
    private String[] tenMonHoc, diemMonHoc;

    public SinhVien() {
        mssv = "";
        hoTen = "";
        ngaySinh = new Date();
        soMonHocDangKy = 0;
        tenMonHoc = new String[60];
        diemMonHoc = new String[60];
    }

    public SinhVien(String maSinhVien, String hoTen, Date ngaySinh, int soMonHocDangKy) {
        this.mssv = maSinhVien;
        this.hoTen = hoTen;
        this.ngaySinh = new Date(ngaySinh);
        this.soMonHocDangKy = soMonHocDangKy;
        tenMonHoc = new String[60];
        diemMonHoc = new String[60];
    }
    
    public SinhVien(SinhVien sv) {
    	this.mssv = sv.mssv;
    	this.hoTen = sv.hoTen;
    	this.ngaySinh = sv.ngaySinh;
    	this.soMonHocDangKy = sv.soMonHocDangKy;
    	this.tenMonHoc = sv.tenMonHoc;
    	this.diemMonHoc = sv.diemMonHoc;
    }
    
    public void nhap() {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        mssv = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh.enterDate();
        System.out.print("Nhap so mon hoc da dang ky: ");
        soMonHocDangKy = sc.nextInt();
    }

    public void nhapDiem() {
    	Scanner sc = new Scanner(System.in);
    	tenMonHoc = new String[soMonHocDangKy];
    	diemMonHoc = new String[soMonHocDangKy];
        
        for (int i = 0; i < soMonHocDangKy; i++) {
        	System.out.println("Nhap mon hoc " + (i + 1) + " :");
        	System.out.print("Nhap ten mon hoc: ");
            tenMonHoc[i] = sc.nextLine();
            System.out.print("Nhap diem mon hoc: ");
            diemMonHoc[i] = sc.nextLine();   
        }
    }
    
    public void hienThi() {
    	System.out.println("MSSV: " + mssv);
    	System.out.println("Ho ten: " + hoTen);
    	System.out.println("Ngay sinh: " + ngaySinh);
    	System.out.println("So mon hoc da dang ki: " + soMonHocDangKy);
    	for (int i = 0; i < soMonHocDangKy; i++) {
            System.out.println("Mon hoc " + (i + 1) + " : " + tenMonHoc[i] + " - " + diemMonHoc[i]);
        }
    	System.out.println("DTB: " + tinhDiemTrungBinh());
    	System.out.println("Hoc luc: " + tinhHocLuc());
    }

    public String toString() {
        String str = " | MSSV : " + mssv + " | Ho ten : " + hoTen + " | Ngay sinh : " + ngaySinh + " | So mon hoc da dang ky: " + soMonHocDangKy;
        for (int i = 0; i < soMonHocDangKy; i++) {
            str += " | Mon hoc " + (i + 1) + " : " + tenMonHoc[i] + " - " + diemMonHoc[i];
        }
        str += " | DTB: " + tinhDiemTrungBinh() + " | Hoc luc: " + tinhHocLuc();
        return str;
    }

    public float tinhDiemTrungBinh() {
		float res = 0.0f;
		for (int i = 0 ; i < soMonHocDangKy; i++) {
			if(diemMonHoc[i].equals("A")) res += 4;
			else if(diemMonHoc[i].equals("B+")) res += 3.5f;
			else if(diemMonHoc[i].equals("B")) res += 3;
			else if(diemMonHoc[i].equals("C+")) res += 2.5;
			else if(diemMonHoc[i].equals("C")) res += 2;
			else if(diemMonHoc[i].equals("D+")) res += 1.5;
			else if(diemMonHoc[i].equals("D")) res += 1;
			else if(diemMonHoc[i].equals("F")) res += 0;
		}
		return res / soMonHocDangKy;
	}
    
    public String tinhHocLuc() {
    	if(tinhDiemTrungBinh() < 1) return "Kem";
    	if(tinhDiemTrungBinh() < 2) return "Yeu";
    	if(tinhDiemTrungBinh() < 2.5) return "Trung Binh";
    	if(tinhDiemTrungBinh() < 3.2) return "Kha";
    	if(tinhDiemTrungBinh() < 3.6) return "Gioi";
    	else return "Xuat sac";
    }

    public void dangKyMonHoc() {
    	Scanner sc = new Scanner(System.in);
        soMonHocDangKy++;
        System.out.print("Nhap ten mon hoc: ");
        tenMonHoc[soMonHocDangKy - 1] = sc.nextLine();
    }

    public void xoaMonHoc() {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten mon hoc can xoa: ");
        String str = sc.nextLine();
        for (int i = 0; i < soMonHocDangKy; i++) {
            if (str.equals(tenMonHoc[i])) {
                for (int j = i; j < soMonHocDangKy - 1; j++) {
                    tenMonHoc[j] = tenMonHoc[j + 1];
                }
                soMonHocDangKy--;
            }
        }
    }

    public String layTen() {
        return hoTen.trim().substring(0, hoTen.lastIndexOf(" "));
    }

    @Override
    public int compareTo(SinhVien o) {
        String tenThis = layTen();
        String tenOther = o.layTen();
        return tenThis.compareTo(tenOther);
    }
    
    public String getEmail() {
    	return "";
    }
}
