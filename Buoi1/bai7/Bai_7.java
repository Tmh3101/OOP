package bai7;

import java.util.Scanner;

public class Bai_7 {
	
	static String firstName(String fullName) {
		return fullName.substring(fullName.lastIndexOf(" ") + 1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fullName = sc.nextLine();
		System.out.println("first name : " + firstName(fullName));
		
		sc.close();
	}
}
