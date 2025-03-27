package hellojava.ch04;

// Outter로 전체 루프 탈출

public class BreakOutterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter:for (char u = 'A'; u <= 'Z'; u++) {
			for (char l = 'A'; l <= 'Z'; l++) {
				System.out.printf("%c - %c\n", u, l);
				if (u == 'G') {
					break Outter;
				}

			}
		}
	}

}
