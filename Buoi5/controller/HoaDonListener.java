package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ChiTietHangHoaView;
import view.HoaDonView;

public class HoaDonListener implements ActionListener{
	private HoaDonView hdv;
	
	public HoaDonListener(HoaDonView hdv) {
		this.hdv = hdv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String src = e.getActionCommand();
		if(src.equals("Khách hàng Vip")) hdv.hienThiTiLeGiam();
		else if(src.equals("Khách hàng")) hdv.anTiLeGiam();
		else if(src.equals("Thêm")) {
			new ChiTietHangHoaView(hdv, src);
		} else if(src.equals("Sửa")) {
			if(hdv.layChiTietDuocChon() != null) {
				ChiTietHangHoaView cthhv = new ChiTietHangHoaView(hdv, src);
				cthhv.nhanChiTietHangHoa(hdv.layChiTietDuocChon());
			}
		} else if(src.equals("Xóa")) {
			hdv.xoaChiTietDuocChon();
		} else if(src.equals("Xuất hóa đơn")) {
			
		}
	}
}
