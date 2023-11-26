package bai2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class DSDoanThang {
	private ArrayList<DoanThang> ds;

	public DSDoanThang() {
		ds = new ArrayList<DoanThang>();
	}

	public DSDoanThang(ArrayList<DoanThang> ds) {
		this.ds = ds;
	}

	// them mot doan thang vao danh sach
	public void themDoanThang(DoanThang d) {
		ds.add(d);
	}
	
	//hien thi tat ca doan thang
	public void hienThiDSDoanThang() {
		System.out.println("---------Cac Doan Thang:");
		int i = 1;
		for (DoanThang d : ds) {
			System.out.println("Doan thang " + (i++) + " : " + d);
		}
	}

	// ghi vao file
	public void luuDanhSach(File file) {
		try {
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			for (DoanThang d : ds) {
				oos.writeObject(d);
			}
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// doc file
	public void layDuLieu(File file) {
		try {
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(is);
			while(is.available() > 0) {
				DoanThang d = (DoanThang)ois.readObject();
				themDoanThang(d);
			}
			ois.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
