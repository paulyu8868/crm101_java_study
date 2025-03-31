package Problems;
import java.util.*;

public class Problem07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = "=";
		System.out.println(s.repeat(40));
		System.out.println("\t[숫자맞추기게임 시작]\t");
		System.out.println(s.repeat(40));
		
		while(true) {
			int ans = (int)(Math.random()*100+1);
			// System.out.println(ans);
			while(true) {
				System.out.print(">>");
				int num = Integer.parseInt(sc.nextLine());
				if (ans>num) {
					System.out.println("더 높게");
				}else if(ans<num) {
					System.out.println("더 낮게");
				}else {
					System.out.println("맞았습니다.");
					break;
				}
			}
			System.out.println("게임을 종료하시겠습니까?(y/n)");
			if ("Y".equals(sc.nextLine()) || "y".equals(sc.nextLine())) {
				break;
			}
		}
		System.out.println(s.repeat(40));
		System.out.println("\t[숫자맞추기게임 종료]\t");
		System.out.println(s.repeat(40));

	}

}
