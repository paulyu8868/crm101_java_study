package hellojava;

// 스캐너

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("내용을 입력해주세요:");
		String input = scanner.nextLine();
		System.out.println("입력한 내용:"+input);
		
		scanner.close(); // 메모리 헤제?
	}  
}
