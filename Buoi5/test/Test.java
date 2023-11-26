package test;

import javax.swing.UIManager;

import view.DangNhapView;
import view.HoaDonView;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			new DangNhapView();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}