package bai8;

import java.util.Scanner;

public class Bai_8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		IntegerList iL = new IntegerList();
		
		iL.enterList();
		iL.printList();
		System.out.println("so 2: " + iL.countX(2));
		iL.sortUp();
		iL.printList();
		
		sc.close();	
	}

}
