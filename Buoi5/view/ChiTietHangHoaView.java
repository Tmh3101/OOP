package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ChiTietHangHoaListener;
import model.ChiTiet;
import model.HangHoa;
import model.HoaDon;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JSeparator;

public class ChiTietHangHoaView extends JDialog {
	private String chucNangThucHien;
	private HoaDonView hdv;
	private final JPanel contentPanel = new JPanel();
	private JTextField textfield_maso;
	private JTextField textfield_soluong;
	private JTextField textfield_ten;
	private JTextField textfield_dongia;
	private JTextField textfield_noisx;

	/**
	 * Create the dialog.
	 */
	public ChiTietHangHoaView(HoaDonView hdv, String chucNangThucHien) {
		this.chucNangThucHien = new String(chucNangThucHien);
		this.hdv = hdv;
		setTitle("Chi tiết hàng hóa");
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Code\\Java\\JavaEclipse\\LTHDT_TH\\Buoi5\\image\\icon_bill.png"));
		setBounds(550, 200, 450, 250);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		contentPanel.setLayout(null);

		ActionListener action = new ChiTietHangHoaListener(this);

		{
			JLabel label_maso = new JLabel("Mã số:");
			label_maso.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_maso.setBounds(30, 10, 80, 20);
			contentPanel.add(label_maso);
		}

		textfield_maso = new JTextField();
		textfield_maso.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textfield_maso.setBounds(30, 30, 150, 20);
		contentPanel.add(textfield_maso);
		textfield_maso.setColumns(10);

		JLabel label_soluong = new JLabel("Số lượng:");
		label_soluong.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_soluong.setBounds(250, 10, 80, 20);
		contentPanel.add(label_soluong);

		textfield_soluong = new JTextField();
		textfield_soluong.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textfield_soluong.setColumns(10);
		textfield_soluong.setBounds(250, 30, 150, 20);
		contentPanel.add(textfield_soluong);

		JLabel label_ten = new JLabel("Tên:");
		label_ten.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_ten.setBounds(30, 60, 80, 20);
		contentPanel.add(label_ten);

		textfield_ten = new JTextField();
		textfield_ten.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textfield_ten.setColumns(10);
		textfield_ten.setBounds(30, 80, 150, 20);
		contentPanel.add(textfield_ten);

		JLabel label_dongia = new JLabel("Đơn giá:");
		label_dongia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_dongia.setBounds(250, 60, 80, 20);
		contentPanel.add(label_dongia);

		textfield_dongia = new JTextField();
		textfield_dongia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textfield_dongia.setColumns(10);
		textfield_dongia.setBounds(250, 80, 150, 20);
		contentPanel.add(textfield_dongia);

		JLabel label_noisx = new JLabel("Nơi SX:");
		label_noisx.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_noisx.setBounds(30, 110, 80, 20);
		contentPanel.add(label_noisx);

		textfield_noisx = new JTextField();
		textfield_noisx.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textfield_noisx.setColumns(10);
		textfield_noisx.setBounds(30, 130, 150, 20);
		contentPanel.add(textfield_noisx);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 230, 436, 2);
		contentPanel.add(separator);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton button_ok = new JButton("OK");
				button_ok.addActionListener(action);
				buttonPane.add(button_ok);
				getRootPane().setDefaultButton(button_ok);
			}
			{
				JButton button_huy = new JButton("Hủy");
				button_huy.addActionListener(action);
				buttonPane.add(button_huy);
			}
		}

		setVisible(true);
	}

	public boolean thongTinHopLe() {
		if (textfield_maso.getText().length() < 1)
			return false;
		if (textfield_ten.getText().length() < 1)
			return false;
		if (textfield_noisx.getText().length() < 1)
			return false;
		if (textfield_soluong.getText().length() < 1)
			return false;
		try {
			Integer.parseInt(textfield_soluong.getText());
		} catch (Exception e) {
			return false;
		}
		if (textfield_dongia.getText().length() < 1)
			return false;
		try {
			Float.parseFloat(textfield_dongia.getText());
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean thucHienChucNang() {
		if (thongTinHopLe() == false) {
			JOptionPane.showMessageDialog(this, "Thông tin không hợp lệ");
			return false;
		} else {
			HangHoa hh = new HangHoa(textfield_maso.getText(), textfield_ten.getText(), textfield_noisx.getText());
			ChiTiet ct = new ChiTiet(hh, Integer.parseInt(textfield_soluong.getText()),
					Float.parseFloat(textfield_dongia.getText()));
			if (chucNangThucHien.equals("Thêm")) {
				hdv.themChiTietVaoHoaDon(ct);
				JOptionPane.showMessageDialog(this, "Thêm chi tiết thành công");
			} else {
				hdv.suaChiTietDuocChon(ct);
				JOptionPane.showMessageDialog(this, "Sửa chi tiết thành công");
			}
			return true;
		}
	}

	public void nhanChiTietHangHoa(ChiTiet ct) {
		textfield_maso.setText(ct.getHhoa().getMso());
		textfield_ten.setText(ct.getHhoa().getTen());
		textfield_noisx.setText(ct.getHhoa().getNsxuat());
		textfield_soluong.setText(ct.getSluong() + "");
		textfield_dongia.setText(ct.getDgia() + "");
	}
}
