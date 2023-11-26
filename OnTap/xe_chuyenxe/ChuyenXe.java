package xe_chuyenxe;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuyenXe {
	private Xe xe;
	private int mso;
	private String tenlx;
	private String nden;
	private float dthu;

	public ChuyenXe() {
		xe = new Xe();
		mso = 0;
		tenlx = new String();
		nden = new String();
		dthu = 0.0f;
	}

	public ChuyenXe(ChuyenXe o) {
		xe = new Xe(o.xe);
		mso = o.mso;
		tenlx = new String(o.tenlx);
		nden = new String(o.nden);
		dthu = o.dthu;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		xe.nhap();
		System.out.print("Nhap ma so chuyen xe: ");
		mso = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap ten nguoi lai xe: ");
		tenlx = sc.nextLine();
		System.out.print("Nhap noi den: ");
		nden = sc.nextLine();
		System.out.print("Nhap doanh thu: ");
		dthu = sc.nextFloat();
	}

	public void in() {
		xe.in();
		System.out.println("Ma so chuyen xe: " + mso);
		System.out.println("Ten nguoi lai xe: " + tenlx);
		System.out.println("Noi den: " + nden);
		System.out.println("Doanh thu: " + dthu);
	}

	public Xe getXe() {
		return xe;
	}

	public float getDthu() {
		return dthu;
	}

	public int getMso() {
		return mso;
	}
	
	public float getLoiNhuan() {
		return (float)(dthu * 0.3);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so chuyen xe:");
		int m = sc.nextInt();
		ChuyenXe[] ds1 = new ChuyenXe[m];

		for (int i = 0; i < m; i++) {
			System.out.println("* Nhap chuyen xe so " + (i + 1));
			ds1[i] = new ChuyenXe();
			ds1[i].nhap();
		}

		System.out.println("Danh sach cac chuyen xe:");
		for (int i = 0; i < m; i++) {
			System.out.println("* Chuyen xe so " + (i + 1));
			ds1[i].in();
		}

		System.out.println("Cac chuyen xe bi huy hoac co doanh thu duoi 100.000: ");
		for (int i = 0; i < m; i++) {
			if (ds1[i].getXe().getTthai() == 'K' || ds1[i].getDthu() < 100000) {
				System.out.println("- " + ds1[i].getMso());
			}
		}

		System.out.println("***Thong ke tong loi nhuan:");
		
		ArrayList<String> dsLoai = new ArrayList<String>();
		for (int i = 0; i < m; i++) {
			if (!dsLoai.contains(ds1[i].getXe().getLoai()))
				dsLoai.add(ds1[i].getXe().getLoai());
		}

		for (String l : dsLoai) {
			System.out.println("- Loai " + l + ":");
			
			ArrayList<String> dsThangNam = new ArrayList<String>();
			for (int i = 0; i < m; i++) {
					if (ds1[i].getXe().getLoai().equals(l) && dsThangNam.contains(ds1[i].getXe().getThangNam()))
						dsThangNam.add(ds1[i].getXe().getThangNam());
			}

			for (String tn : dsThangNam) {
				float tongLoiNhuan = 0.0f;
				for (int i = 0; i < m; i++) {
					if (ds1[i].getXe().getThangNam().equals(tn) && ds1[i].getXe().getLoai().equals(l))
						tongLoiNhuan += ds1[i].getLoiNhuan();
				}
				System.out.println("+ " + tn + " : " + tongLoiNhuan);
			}
		}

	}

}
