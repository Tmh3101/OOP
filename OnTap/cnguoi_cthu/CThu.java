package cnguoi_cthu;

import java.util.ArrayList;
import java.util.Scanner;

public class CThu extends CNguoi {
	private int so;
	private String vtri;
	private long bthang;
	private String mua;
	private String clbo;

	public CThu() {
		super();
		so = 0;
		vtri = new String();
		bthang = 0;
		mua = new String();
		clbo = new String();
	}

	public CThu(CThu ct) {
		super(ct);
		so = ct.so;
		vtri = new String(ct.vtri);
		bthang = ct.bthang;
		mua = new String(ct.mua);
		clbo = new String(ct.clbo);
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap so ao: ");
		so = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap vi tri: ");
		vtri = sc.nextLine();
		System.out.print("Nhap so ban thang: ");
		bthang = sc.nextLong();
		sc.nextLine();
		System.out.print("Nhap mua giai: ");
		mua = sc.nextLine();
		System.out.print("Nhap cau lac bo: ");
		clbo = sc.nextLine();
	}

	public void in() {
		super.in();
		System.out.println("So ao: " + so);
		System.out.println("Vi tri: " + vtri);
		System.out.println("So ban thang: " + bthang);
		System.out.println("Mua giai: " + mua);
		System.out.println("Cau lac bo: " + clbo);
	}

	public long tinhLuong() {
		long luong = 7000000;

		if (vtri.equals("thu mon"))
			luong += 3000000;
		else if (vtri.equals("hau ve"))
			luong += 4000000;
		else if (vtri.equals("trung ve"))
			luong += 4500000;
		else if (vtri.equals("tien ve"))
			luong += 5000000;
		else if (vtri.equals("tien dao"))
			luong += 7000000;

		luong += bthang * 500000;

		return luong - (long) (0.1 * luong);
	}

	public String getClbo() {
		return clbo;
	}

	public String getMua() {
		return mua;
	}
	
	public long getBthang() {
		return bthang;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong cua danh sach:");
		int n = sc.nextInt();
		CNguoi[] ds = new CNguoi[n];

		for (int i = 0; i < n; i++) {
			int c = 0;
			do {
				System.out.println("1. Con nguoi");
				System.out.println("2. Cau thu");
				System.out.print("Nhap luu chon: ");
				c = sc.nextInt();
				if(c != 1 && c != 2) System.out.println("Loi! Nhap lai");
			} while(c != 1 && c != 2);
			
			if (c == 1) {
				ds[i] = new CNguoi();
				System.out.println("Nhap thong tin cua nguoi thu " + (i + 1));
			}
			else if (c == 2){
				ds[i] = new CThu();
				System.out.println("Nhap thong tin cua cau thu thu " + (i + 1));
			}
			ds[i].nhap();
		}
 
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + ":");
			ds[i].in();
		}

		System.out.println("Danh sach tien luong cua cac cau thu:");
		for (int i = 0; i < n; i++) {
			System.out.println("- " + ds[i].getHten() + ": " + ds[i].tinhLuong());
		}

		//lay danh sach cac cau lac bo
		ArrayList<String> dsClb = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			if (dsClb.contains(ds[i].getClbo())) dsClb.add(ds[i].getClbo());
		}

		//thuc hien hien thi
		for (String clb : dsClb) {
			//hien thi clb
			System.out.println("**Cau lac bo: " + clb);
			
			//lay danh sach mua giai trong tung cau lac bo
			ArrayList<String> dsMua = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
					if (ds[i].getClbo().equals(clb) && dsMua.contains(ds[i].getMua()))
						dsMua.add(ds[i].getMua());
			}
			
			for (String mua : dsMua) {
				//hien thi mua giai
				System.out.println("- Mua giai: " + mua);
				long bthang18_24 = 0;
				long bthang25_28 = 0;
				long bthangtren28 = 0;
				//tinh so ban thang cua 3 cap do tuoi cua cac cau thu
				for (int i = 0; i < n; i++) {
					if (ds[i].getClbo().equals(clb) && ds[i].getMua().equals(mua)) {
						if(ds[i].getTuoi() >= 18 && ds[i].getTuoi() <= 24) bthang18_24 += ds[i].getBthang();
						else if(ds[i].getTuoi() >= 25 && ds[i].getTuoi() <= 28) bthang25_28 += ds[i].getBthang();
						else if(ds[i].getTuoi() > 8) bthangtren28 += ds[i].getBthang();
					}
				}
				//hien thi cac ban thang
				System.out.println("+ Tuoi 18 -> 24: " + bthang18_24);
				System.out.println("+ Tuoi 25 -> 28: " + bthang25_28);
				System.out.println("+ Tuoi tren 28: " + bthangtren28);
			}
		}

	}
}
