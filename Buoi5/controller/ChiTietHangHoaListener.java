package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ChiTietHangHoaView;
import view.HoaDonView;

public class ChiTietHangHoaListener implements ActionListener{
	private ChiTietHangHoaView cthhv;
	
	public ChiTietHangHoaListener(ChiTietHangHoaView cthhv) {
		this.cthhv = cthhv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Hủy")) cthhv.dispose();
		else if(src.equals("OK")) {
			if(cthhv.thucHienChucNang()) cthhv.dispose();
		}
	}

}
