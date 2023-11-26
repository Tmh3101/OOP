package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.DangKiView;

public class DangKiListener implements ActionListener{
	private DangKiView dkw;
	
	public DangKiListener(DangKiView dkw) {
		this.dkw = dkw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("Hủy")) dkw.dispose();
		else if(str.equals("Đăng Kí")) {
			dkw.dangKi();
		}
	}
	
}
