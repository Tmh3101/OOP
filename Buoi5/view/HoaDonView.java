package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;

import controller.HoaDonListener;
import model.ChiTiet;
import model.HangHoa;
import model.HoaDon;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JProgressBar;
import javax.swing.JTree;
import javax.swing.JEditorPane;
import javax.swing.JToggleButton;

public class HoaDonView extends JFrame {
	private HoaDon hdm;
	private JPanel contentPane;
	private JTable table_chitiet;
	private JTextField textfield_mshoadon;
	private JTextField textfield_tieude;
	private JTextField textfield_tennhanvien;
	private JTextField textfield_nhapcccd;
	private JTextField textfield_nhaphoten;
	private JTextField textfield_nhapnamsinh;
	private JLabel label_nhaptilegiam;
	private JPanel panel_nhaptilegiam;
	private JTextField textfield_nhaptilegiam;
	private JLabel label_soloai;
	private JLabel label_tongtien;

	/**
	 * Create the frame.
	 */
	public HoaDonView() {

		hdm = new HoaDon();
		setTitle("Hóa đơn");
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Code\\Java\\JavaEclipse\\LTHDT_TH\\Buoi5\\image\\icon_bill.png"));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 100, 1055, 608);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		HoaDonListener action = new HoaDonListener(this);

		JPanel panel_header = new JPanel();
		panel_header.setPreferredSize(new Dimension(40, 100));
		contentPane.add(panel_header, BorderLayout.NORTH);
		panel_header.setLayout(new BorderLayout(0, 0));

		JLabel label_tthoadon = new JLabel("Thông tin hóa đơn");
		label_tthoadon.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_header.add(label_tthoadon, BorderLayout.NORTH);

		JPanel panel_nhaptthoadon = new JPanel();
		panel_header.add(panel_nhaptthoadon, BorderLayout.CENTER);
		panel_nhaptthoadon.setLayout(null);

		JLabel label_mshoadon = new JLabel("Mã số hóa đơn");
		label_mshoadon.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_mshoadon.setBounds(30, 15, 90, 20);
		panel_nhaptthoadon.add(label_mshoadon);

		textfield_mshoadon = new JTextField();
		textfield_mshoadon.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textfield_mshoadon.setBounds(130, 15, 200, 20);
		panel_nhaptthoadon.add(textfield_mshoadon);
		textfield_mshoadon.setColumns(10);

		JLabel label_tieude = new JLabel("Tiêu đề");
		label_tieude.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_tieude.setBounds(450, 15, 90, 20);
		panel_nhaptthoadon.add(label_tieude);

		textfield_tieude = new JTextField();
		textfield_tieude.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textfield_tieude.setColumns(10);
		textfield_tieude.setBounds(550, 15, 200, 20);
		panel_nhaptthoadon.add(textfield_tieude);

		JLabel label_tennhanvien = new JLabel("Tên nhân viên");
		label_tennhanvien.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_tennhanvien.setBounds(30, 50, 88, 13);
		panel_nhaptthoadon.add(label_tennhanvien);

		textfield_tennhanvien = new JTextField();
		textfield_tennhanvien.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textfield_tennhanvien.setColumns(10);
		textfield_tennhanvien.setBounds(130, 50, 200, 20);
		panel_nhaptthoadon.add(textfield_tennhanvien);

		
		JPanel panel_footer = new JPanel();
		panel_footer.setPreferredSize(new Dimension(40, 150));
		contentPane.add(panel_footer, BorderLayout.SOUTH);
		panel_footer.setLayout(new BorderLayout(0, 0));

		JLabel label_ttkhachhang = new JLabel("Thông tin khách hàng");
		label_ttkhachhang.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_footer.add(label_ttkhachhang, BorderLayout.NORTH);

		JPanel panel_nhapttkhachhang = new JPanel();
		panel_footer.add(panel_nhapttkhachhang, BorderLayout.CENTER);
		panel_nhapttkhachhang.setLayout(new GridLayout(1, 2));

		JPanel panel_chonloaikhachhang = new JPanel();
		panel_nhapttkhachhang.add(panel_chonloaikhachhang);
		panel_chonloaikhachhang.setLayout(new GridLayout(2, 1));

		JPanel panel_chonkhachhang = new JPanel();
		panel_chonloaikhachhang.add(panel_chonkhachhang);
		panel_chonkhachhang.setLayout(null);

		JRadioButton radio_khachhang = new JRadioButton("Khách hàng");
		radio_khachhang.setFont(new Font("Tahoma", Font.PLAIN, 12));
		radio_khachhang.setBounds(70, 20, 130, 20);
		radio_khachhang.addActionListener(action);
		panel_chonkhachhang.add(radio_khachhang);

		JRadioButton radio_khachhangvip = new JRadioButton("Khách hàng Vip");
		radio_khachhangvip.setFont(new Font("Tahoma", Font.PLAIN, 12));
		radio_khachhangvip.setBounds(250, 20, 130, 20);
		radio_khachhangvip.addActionListener(action);
		panel_chonkhachhang.add(radio_khachhangvip);

		ButtonGroup bg_loaikhachhang = new ButtonGroup();
		bg_loaikhachhang.add(radio_khachhang);
		bg_loaikhachhang.add(radio_khachhangvip);

		panel_nhaptilegiam = new JPanel();
		panel_chonloaikhachhang.add(panel_nhaptilegiam);
		panel_nhaptilegiam.setLayout(null);

		label_nhaptilegiam = new JLabel("Nhập tỉ lệ giảm:");
		label_nhaptilegiam.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_nhaptilegiam.setBounds(75, 10, 100, 20);
		panel_nhaptilegiam.add(label_nhaptilegiam);
		label_nhaptilegiam.setVisible(false);

		textfield_nhaptilegiam = new JTextField();
		textfield_nhaptilegiam.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textfield_nhaptilegiam.setBounds(190, 10, 150, 20);
		textfield_nhaptilegiam.setColumns(10);
		panel_nhaptilegiam.add(textfield_nhaptilegiam);
		textfield_nhaptilegiam.setVisible(false);

		JPanel panel_nhapttkh = new JPanel();
		panel_nhapttkhachhang.add(panel_nhapttkh);
		panel_nhapttkh.setLayout(null);

		JLabel label_nhapcccd = new JLabel("Nhập CCCD:");
		label_nhapcccd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_nhapcccd.setBounds(70, 15, 90, 20);
		panel_nhapttkh.add(label_nhapcccd);

		textfield_nhapcccd = new JTextField();
		textfield_nhapcccd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textfield_nhapcccd.setBounds(170, 15, 150, 20);
		panel_nhapttkh.add(textfield_nhapcccd);
		textfield_nhapcccd.setColumns(10);

		JLabel label_nhaphoten = new JLabel("Nhập họ tên:");
		label_nhaphoten.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_nhaphoten.setBounds(70, 50, 90, 20);
		panel_nhapttkh.add(label_nhaphoten);

		textfield_nhaphoten = new JTextField();
		textfield_nhaphoten.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textfield_nhaphoten.setColumns(10);
		textfield_nhaphoten.setBounds(170, 50, 150, 20);
		panel_nhapttkh.add(textfield_nhaphoten);

		JLabel label_nhapnamsinh = new JLabel("Nhập năm sinh:");
		label_nhapnamsinh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_nhapnamsinh.setBounds(70, 85, 90, 20);
		panel_nhapttkh.add(label_nhapnamsinh);

		textfield_nhapnamsinh = new JTextField();
		textfield_nhapnamsinh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textfield_nhapnamsinh.setColumns(10);
		textfield_nhapnamsinh.setBounds(170, 85, 150, 20);
		panel_nhapttkh.add(textfield_nhapnamsinh);

		JButton button_xuathoadon = new JButton("Xuất hóa đơn");
		button_xuathoadon.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_xuathoadon.setBounds(380, 85, 120, 20);
		panel_nhapttkh.add(button_xuathoadon);

		JPanel panel_chitiet = new JPanel();
		contentPane.add(panel_chitiet, BorderLayout.CENTER);
		panel_chitiet.setLayout(new BorderLayout(0, 0));

		table_chitiet = new JTable();
		table_chitiet.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table_chitiet.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Mã số", "Tên", "Nơi" + " sản xuất", "Số lượng", "Đơn giá", "Thành tiền"}));

		JScrollPane scrollPane = new JScrollPane(table_chitiet);
		panel_chitiet.add(scrollPane);

		JPanel panel_chucnang = new JPanel();
		panel_chucnang.setLayout(new GridLayout(1, 4, 15, 15));
		panel_chitiet.add(panel_chucnang, BorderLayout.SOUTH);

		JButton button_them = new JButton("Thêm");
		button_them.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_them.addActionListener(action);
		panel_chucnang.add(button_them);
		JButton button_sua = new JButton("Sửa");
		button_sua.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_sua.addActionListener(action);
		panel_chucnang.add(button_sua);
		JButton button_xoa = new JButton("Xóa");
		button_xoa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_xoa.addActionListener(action);
		panel_chucnang.add(button_xoa);

		label_soloai = new JLabel("Số loại: ");
		label_soloai.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_chucnang.add(label_soloai);

		label_tongtien = new JLabel("Tổng tiền: ");
		label_tongtien.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_chucnang.add(label_tongtien);
		setVisible(true);

	}

	public JTable getTable_chitiet() {
		return table_chitiet;
	}

	public HoaDon getHdm() {
		return hdm;
	}

	public void hienThiTiLeGiam() {
		label_nhaptilegiam.setVisible(true);
		textfield_nhaptilegiam.setVisible(true);
	}

	public void anTiLeGiam() {
		label_nhaptilegiam.setVisible(false);
		textfield_nhaptilegiam.setVisible(false);
	}

	public void themChiTietVaoHoaDon(ChiTiet ct) {
		hdm.themChiTiet(ct);
		DefaultTableModel dtm = (DefaultTableModel) table_chitiet.getModel();
		dtm.addRow(new Object[] { ct.getHhoa().getMso() + "", ct.getHhoa().getTen() + "", ct.getHhoa().getNsxuat() + "",
				ct.getSluong() + "", ct.getDgia() + "", ct.ttien() + ""});
		label_soloai.setText("Số loại: " + dtm.getRowCount());
		label_tongtien.setText("Tổng tiền: " + hdm.tong());
	}

	public ChiTiet layChiTietDuocChon() {
		if (table_chitiet.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(this, "Vui lòng chọn chi tiết");
			return null;
		}
		return hdm.getDsct().get(table_chitiet.getSelectedRow());
	}

	public void suaChiTietDuocChon(ChiTiet nct) {
		ChiTiet ct = layChiTietDuocChon();
		if (ct != null) {
			ct.thaythe(nct);
			int i = 0;
			DefaultTableModel dtm = (DefaultTableModel) table_chitiet.getModel();
			dtm.setValueAt(ct.getHhoa().getMso(), table_chitiet.getSelectedRow(), i++);
			dtm.setValueAt(ct.getHhoa().getTen(), table_chitiet.getSelectedRow(), i++);
			dtm.setValueAt(ct.getHhoa().getNsxuat(), table_chitiet.getSelectedRow(), i++);
			dtm.setValueAt(ct.getSluong(), table_chitiet.getSelectedRow(), i++);
			dtm.setValueAt(ct.getDgia(), table_chitiet.getSelectedRow(), i++);
			dtm.setValueAt(ct.ttien(), table_chitiet.getSelectedRow(), i++);
			
			label_soloai.setText("Số loại: " + dtm.getRowCount());
			label_tongtien.setText("Tổng tiền: " + hdm.tong());
		}
	}

	public void xoaChiTietDuocChon() {
		ChiTiet ct = layChiTietDuocChon();
		if (ct != null && JOptionPane.showConfirmDialog(this, "Xóa " + ct.getHhoa().getMso()) == JOptionPane.OK_OPTION) {
			hdm.xoaChiTiet(ct);
			DefaultTableModel dtm = (DefaultTableModel) table_chitiet.getModel();
			dtm.removeRow(table_chitiet.getSelectedRow());
			JOptionPane.showMessageDialog(this, "Xóa chi tiết thành công");
			label_soloai.setText("Số loại: " + dtm.getRowCount());
			label_tongtien.setText("Tổng tiền: " + hdm.tong());
		}
	}
}
