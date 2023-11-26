package bai1;

import java.util.Scanner;

public class Gach {
	private String code;
	private String color;
	private int number;
	private int length;
	private int width;
	private long cost;
	
	public Gach() {
		code = "nan";
		color = "nan";
		number = 0;
		length = 0;
		width = 0;
		cost = 0;
	}
	public Gach(String code, String color, int number, int length, int width, long cost) {
		this.code = code;
		this.color = color;
		this.number = number;
		this.length = length;
		this.width = width;
		this.cost = cost;
	}
	
	public long getCost() {
		return cost;
	}
	
	public boolean valid() {
		if (code == "" || color == "" || number < 0 || length < 0 || width < 0 || cost < 0) return false;
		return true;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void enter() {
		do {
			System.out.print("Enter code: ");
			code = sc.nextLine();
			System.out.print("Enter color: ");
			color = sc.nextLine();
			System.out.print("Enter number of bricks: ");
			number = sc.nextInt();
			System.out.print("Enter length: ");
			length = sc.nextInt();
			System.out.print("Enter width: ");
			width = sc.nextInt();
			System.out.print("Enter cost: ");
			cost = sc.nextLong();
			if (!valid()) System.out.println("Information is invalid, please re-enter");
		} while(!valid());
	}
	
	
	public void print() {
		System.out.println("Code: " + code);
		System.out.println("Color: " + color);
		System.out.println("Number: " + number);
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Cost: " + cost);
	}
	
	public String toString() {
		return "Code: " + code + " | Color: " + color + " | Number: " + number + " | Length: " + length + " | Width: " + width + " | Cost: " + cost;
	}
	
	public float giaBanLe() {
		return (cost * 1.2f) / number;
	}
	
	public int acreage() {
		return length * width * number;
	}
	
	public int soLuongHopGach(int D, int N) {
		int res = 0;
		while ((res * (acreage() / width) < D) || (res * (acreage() / length) < N)) {
			res++;
		}
		return res;
	}
}
