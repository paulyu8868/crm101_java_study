package hellojava.ch05;

import java.util.*;

public class KeyControlEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run=true;
		int speed = 0;
		
		while(run) {
			System.out.println("------------------");
			System.out.println("1.증속 | 2.감속 | 3.중지");
			System.out.println("------------------");
			System.out.println("선택: ");
			String menu=sc.next();
			
			if (menu.equals("1")) {
				speed++;
				System.out.printf("현재속도: %d\n",speed);
			}else if(menu.equals("2")){
				speed--;
				System.out.printf("현재속도: %d\n",speed);
			}else if(menu.equals("3")) {
				System.out.printf("현재속도: %d",speed);
				System.out.println("프로그램 종료.");
				break;
				// run=false;
			}
		}
	}

}
