package hellojava.ch04;

public class NewSwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java 12부터 스위치 기능 (break문 간소화?)
		char grade ='a';
		switch(grade) {
		case 'A','a'->{
			System.out.println('A');
		}
		case 'B','b'->{
			System.out.println('B');
		}
		}
	}

}
