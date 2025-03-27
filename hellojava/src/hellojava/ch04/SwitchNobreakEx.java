package hellojava.ch04;

public class SwitchNobreakEx {
	public static void main(String[] args) {
		char grade ='B';
		// 스위치문에 break가 없다면?
		switch(grade) {
		case 'A':
			System.out.println('A');
		case 'B':
			System.out.println('B');
		case 'C':
			System.out.println('C');
		default:
			System.out.println('F');
		}
		
		switch(grade) {
		case 'A':
			System.out.println('A');
			break;
		case 'B':
			System.out.println('B');
			break;
		case 'C':
			System.out.println('C');
			break;
		default:
			System.out.println('F');
		}
	}

}
