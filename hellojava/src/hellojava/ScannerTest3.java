package hellojava;

// 스캐너

import java.util.Scanner;

public class ScannerTest3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("X값입력:");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("Y값입력:");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		
		scanner.close();
	}  
}
