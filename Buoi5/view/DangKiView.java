package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.DangKiListener;
import model.DSTaiKhoan;
import model.TaiKhoan;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class DangKiView extends JFrame {

	private DSTaiKhoan dstkmodel;
	private JPanel contentPane;
	private JTextField textfield_tentaikhoan;
	private JPasswordField passwordfield_nhapmk;
	private JPasswordField passwordfield_nhaplaimk;
	public DangKiView() {
		dstkmodel = new DSTaiKhoan();
		setTitle("Đăng kí");
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Code\\Java\\JavaEclipse\\LTHDT_TH\\Buoi5\\image\\icon_bill.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(375, 300, 700, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		ActionListener action = new DangKiListener(this);
		
		JLabel label_dangki = new JLabel("Đăng Kí", JLabel.CENTER);
		label_dangki.setBackground(SystemColor.activeCaption);
		label_dangki.setOpaque(true);
		label_dangki.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		contentPane.add(label_dangki, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlDkShadow);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_khungdangki = new JPanel();
		panel_khungdangki.setBackground(SystemColor.activeCaptionBorder);
		panel.add(panel_khungdangki);
		panel_khungdangki.setLayout(null);
		
		JLabel lblTnTiKhon = new JLabel("Tên Tài Khoản");
		lblTnTiKhon.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblTnTiKhon.setBounds(50, 25, 125, 25);
		panel_khungdangki.add(lblTnTiKhon);
		
		JLabel label_matkhau = new JLabel("Mật Khẩu");
		label_matkhau.setFont(new Font("Tahoma", Font.ITALIC, 14));
		label_matkhau.setBounds(50, 60, 125, 25);
		panel_khungdangki.add(label_matkhau);
		
		textfield_tentaikhoan = new JTextField();
		textfield_tentaikhoan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textfield_tentaikhoan.setBounds(200, 25, 175, 25);
		panel_khungdangki.add(textfield_tentaikhoan);
		textfield_tentaikhoan.setColumns(10);
		
		passwordfield_nhapmk = new JPasswordField();
		passwordfield_nhapmk.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordfield_nhapmk.setBounds(200, 60, 175, 25);
		panel_khungdangki.add(passwordfield_nhapmk);
		
		passwordfield_nhaplaimk = new JPasswordField();
		passwordfield_nhaplaimk.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordfield_nhaplaimk.setBounds(200, 95, 175, 25);
		panel_khungdangki.add(passwordfield_nhaplaimk);
		
		JLabel label_nhaplaimatkhau = new JLabel("Nhập Lại Mật Khẩu");
		label_nhaplaimatkhau.setFont(new Font("Tahoma", Font.ITALIC, 14));
		label_nhaplaimatkhau.setBounds(50, 95, 125, 25);
		panel_khungdangki.add(label_nhaplaimatkhau);
		
		JButton button_dangki = new JButton("Đăng Kí");
		button_dangki.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_dangki.setBounds(200, 130, 85, 25);
		button_dangki.addActionListener(action);
		panel_khungdangki.add(button_dangki);
		
		JButton button_huy = new JButton("Hủy");
		button_huy.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_huy.setBounds(290, 130, 85, 25);
		button_huy.addActionListener(action);
		panel_khungdangki.add(button_huy);
		
		JPanel panel_empty_north = new JPanel();
		panel_empty_north.setPreferredSize(new Dimension(0, 20));
		panel_empty_north.setBackground(SystemColor.controlDkShadow);
		panel.add(panel_empty_north, BorderLayout.NORTH);
		
		JPanel panel_empty_south = new JPanel();
		panel_empty_south.setPreferredSize(new Dimension(0, 60));
		panel_empty_south.setBackground(SystemColor.controlDkShadow);
		panel.add(panel_empty_south, BorderLayout.SOUTH);
		
		JPanel panel_empty_west = new JPanel();
		panel_empty_west.setPreferredSize(new Dimension(120, 0));
		panel_empty_west.setBackground(SystemColor.controlDkShadow);
		panel.add(panel_empty_west, BorderLayout.WEST);
		
		JPanel panel_empty_east = new JPanel();
		panel_empty_east.setPreferredSize(new Dimension(120, 0));
		panel_empty_east.setBackground(SystemColor.controlDkShadow);
		panel.add(panel_empty_east, BorderLayout.EAST);
		
		setVisible(true);
	}
	
	public void dangKi() {
		String mk1 = new String(passwordfield_nhapmk.getPassword());
		String mk2 = new String(passwordfield_nhaplaimk.getPassword());
		if(textfield_tentaikhoan.getText().length() < 1) {
			JOptionPane.showMessageDialog(this, "Vui lòng nhập tên tài khoản");
		} else if(mk1.equals(mk2) == false) {
			JOptionPane.showMessageDialog(this, "Mật khẩu không trùng khớp");
		} else if(mk1.length() < 8) {
			JOptionPane.showMessageDialog(this, "Mật khẩu phải có it nhất 8 kí tự");
		} else {
			String ttk = new String(textfield_tentaikhoan.getText());
			TaiKhoan tk = new TaiKhoan(ttk, mk1);
			if (dstkmodel.ktTenTaiKhoanDaTonTai(tk)) {
				JOptionPane.showMessageDialog(this, "Tên tài khoản đã tồn tại");
			} else {
				dstkmodel.themTaiKhoan(tk);
				JOptionPane.showMessageDialog(this, "Đăng kí thành công");
				dispose();
			}
		}
	}

}
