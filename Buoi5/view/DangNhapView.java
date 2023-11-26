package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.DangNhapListener;
import model.DSTaiKhoan;
import model.TaiKhoan;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;

public class DangNhapView extends JFrame {
	private DSTaiKhoan dstk;
	private JPanel contentPane;
	private JTextField textfield_tendangnhap;
	private JPasswordField passwordfield_matkhau;

	public DangNhapView() {
		dstk = new DSTaiKhoan();
		
		setTitle("Đăng nhập");
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Code\\Java\\JavaEclipse\\LTHDT_TH\\Buoi5\\image\\icon_bill.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(350, 200, 800, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		ActionListener action = new DangNhapListener(this);
		
		JLabel label_dangnhap = new JLabel("Đăng Nhập", JLabel.CENTER);
		label_dangnhap.setBackground(SystemColor.activeCaption);
		label_dangnhap.setOpaque(true);
		label_dangnhap.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		contentPane.add(label_dangnhap, BorderLayout.NORTH);
		
		JPanel panel_center = new JPanel();
		contentPane.add(panel_center, BorderLayout.CENTER);
		panel_center.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaptionBorder);
		panel_center.add(panel);
		panel.setLayout(null);
		
		JLabel label_tendangnhap = new JLabel("Tên Đăng Nhập");
		label_tendangnhap.setBounds(40, 20, 109, 38);
		label_tendangnhap.setFont(new Font("Tahoma", Font.ITALIC, 14));
		panel.add(label_tendangnhap);
		
		textfield_tendangnhap = new JTextField();
		textfield_tendangnhap.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textfield_tendangnhap.setBounds(172, 20, 235, 35);
		panel.add(textfield_tendangnhap);
		textfield_tendangnhap.setColumns(10);
		
		JLabel label_matkhau = new JLabel("Mật Khẩu");
		label_matkhau.setBounds(40, 65, 109, 38);
		label_matkhau.setFont(new Font("Tahoma", Font.ITALIC, 14));
		panel.add(label_matkhau);
		
		JButton button_dangnhap = new JButton("Đăng Nhập");
		button_dangnhap.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_dangnhap.setBounds(60, 130, 130, 30);
		button_dangnhap.addActionListener(action);
		panel.add(button_dangnhap);
		
		JButton button_dangki = new JButton("Đăng Kí");
		button_dangki.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_dangki.setBounds(250, 130, 130, 30);
		button_dangki.addActionListener(action);
		panel.add(button_dangki);
		
		passwordfield_matkhau = new JPasswordField();
		passwordfield_matkhau.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordfield_matkhau.setBounds(172, 65, 235, 35);
		panel.add(passwordfield_matkhau);
		
		JPanel panel_empty_north = new JPanel();
		panel_empty_north.setPreferredSize(new Dimension(0, 30));
		panel_empty_north.setBackground(SystemColor.controlDkShadow);
		panel_center.add(panel_empty_north, BorderLayout.NORTH);
		
		JPanel panel_empty_south = new JPanel();
		panel_empty_south.setPreferredSize(new Dimension(0, 80));
		panel_empty_south.setBackground(SystemColor.controlDkShadow);
		panel_center.add(panel_empty_south, BorderLayout.SOUTH);
		
		JPanel panel_empty_west = new JPanel();
		panel_empty_west.setPreferredSize(new Dimension(160, 0));
		panel_empty_west.setBackground(SystemColor.controlDkShadow);
		panel_center.add(panel_empty_west, BorderLayout.WEST);
		
		JPanel panel_empty_east = new JPanel();
		panel_empty_east.setPreferredSize(new Dimension(160, 0));
		panel_empty_east.setBackground(SystemColor.controlDkShadow);
		panel_center.add(panel_empty_east, BorderLayout.EAST);
		
		setVisible(true);
	}
	
	public void dangNhap() {
		String ttk = new String(textfield_tendangnhap.getText());
		String mk = new String(passwordfield_matkhau.getPassword());
		if(ttk.length() < 1) {
			JOptionPane.showMessageDialog(this, "Vui lòng nhập tên đăng nhập");
		} else if(mk.length() < 1) {
			JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu");
		} else {
			TaiKhoan tk = new TaiKhoan(ttk, mk);
			if(dstk.ktTenTaiKhoanDaTonTai(tk) && dstk.ktTaiKhoanDaTonTai(tk) == false) {
				JOptionPane.showMessageDialog(this, "Mật khẩu không đúng");
			} else if(dstk.ktTaiKhoanDaTonTai(tk) == false) {
				JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại");
			} else {
				dispose();
				new HoaDonView();
			}
		}
	}
}
