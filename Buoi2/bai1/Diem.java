package bai1;

import java.io.Serializable;
import java.util.Scanner;

public class Diem implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int x, y;
	
	Scanner sc;
	
	public Diem() {
		x = 0;
		y = 0;
	}
	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Diem(Diem other) {
		this.x = other.x;
		this.y = other.y;
	}
		
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void nhapDiem() {
		sc = new Scanner(System.in);
		System.out.print("x : ");
		x = sc.nextInt();
		System.out.print("y : ");
		y = sc.nextInt();
	}
	
	public void hienThi() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	public String toString() {
		return "(" + x + " ; " + y + ")"; 
	}
	
	public void doiDiem(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	public float khoangCach() {
		return (float)Math.sqrt(x*x + y*y);
	}
	
	public float khoangCach(Diem o) {
		return (float)Math.sqrt(Math.pow((this.x - o.x), 2) + Math.pow((this.y - o.y), 2));	
	}
}
