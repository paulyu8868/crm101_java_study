package hellojava.ch05;

import java.util.Scanner;

public class DoWhileEx {
	public static void main(String[] args) {
		System.out.println("do while ex");
		
		Scanner sc = new Scanner(System.in);
		String input;
		
		do {
			System.out.print(">");
			input = sc.nextLine();
		}while(!(input.equals('q'))); 
			System.out.println("program on");
		
	}

}
