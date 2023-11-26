package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class DSTaiKhoan {
	private ArrayList<TaiKhoan> dstk;

	public DSTaiKhoan() {
		dstk = new ArrayList<TaiKhoan>();
		try {

			File file = new File("E:\\Code\\Java\\JavaEclipse\\LTHDT_TH\\Buoi5\\model\\Data\\dstaikhoan.data");
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(is);
			while (is.available() > 0) {
				them((TaiKhoan)ois.readObject());
			}
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void them(TaiKhoan tk) {
		dstk.add(tk);
	}
	
	public boolean ktTenTaiKhoanDaTonTai(TaiKhoan otk) {
		for (TaiKhoan tk : dstk) {
			if(otk.tenTaiKhoanGiongNhau(tk)) return true;
		}
		return false;
	}
	
	public boolean ktTaiKhoanDaTonTai(TaiKhoan otk) {
		for (TaiKhoan tk : dstk) {
			if(otk.equals(tk)) return true;
		}
		return false;
	}
	
	public void themTaiKhoan(TaiKhoan otk) {
		them(otk);
		try {
			File file = new File("E:\\Code\\Java\\JavaEclipse\\LTHDT_TH\\Buoi5\\model\\Data\\dstaikhoan.data");
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			for (TaiKhoan tk : dstk) {
				oos.writeObject(tk);
			}
			oos.flush();
			oos.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
