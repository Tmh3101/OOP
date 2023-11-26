package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.DangKiView;
import view.DangNhapView;

public class DangNhapListener implements ActionListener{
	private DangNhapView dnv;
	
	public DangNhapListener(DangNhapView dnv) {
		this.dnv = dnv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("Đăng Kí")) new DangKiView();
		else if(str.equals("Đăng Nhập")) {
			dnv.dangNhap();
		}
	}
	
	
}
