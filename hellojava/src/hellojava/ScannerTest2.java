package hellojava;

// 스캐너

import java.util.Scanner;

public class ScannerTest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("내용을 입력해주세요:");
		String input = scanner.nextLine();
		System.out.println("입력한 내용:"+input);
		
		int x = Integer.parseInt(input); // 입력값 int형으로 변환
		System.out.println(x+1);
		scanner.close(); // 메모리 헤제?
	}  
}
