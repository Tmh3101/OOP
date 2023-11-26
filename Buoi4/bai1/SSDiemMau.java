package bai1;

public class SSDiemMau {

	public static void main(String[] args) {
		
		DiemMau A = new DiemMau(5, 10, "Trang");
		System.out.println("Diem Mau A:");
		A.hienThi();
		
		DiemMau B = new DiemMau();
		B.nhap();
		B.doiDiem(10, 8);
		B.ganMau("Vang");
		System.out.println("Diem Mau B:");
		B.hienThi();
	}

}
