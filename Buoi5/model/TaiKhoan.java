package model;

import java.io.Serializable;
import java.util.Objects;

public class TaiKhoan implements Serializable{
	private String ttkhoan, mkhau;
	
	public TaiKhoan() {
		ttkhoan = new String();
		mkhau = new String();
	}
	
	public TaiKhoan(String ttkhoan, String mkhau) {
		this.ttkhoan = new String(ttkhoan);
		this.mkhau = new String(mkhau);
	}
	
	public TaiKhoan(TaiKhoan tk) {
		ttkhoan = new String(tk.ttkhoan);
		mkhau = new String(tk.mkhau);
	}
	
	public String getTtkhoan() {
		return ttkhoan;
	}
	
	public boolean tenTaiKhoanGiongNhau(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaiKhoan other = (TaiKhoan) obj;
		return Objects.equals(ttkhoan, other.ttkhoan);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaiKhoan other = (TaiKhoan) obj;
		return Objects.equals(mkhau, other.mkhau) && Objects.equals(ttkhoan, other.ttkhoan);
	}


	
	
	
}
