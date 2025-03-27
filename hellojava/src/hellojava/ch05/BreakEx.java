package hellojava.ch05;

public class BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		int randNum = (int)(Math.random()*6+1);
		System.out.println(randNum);
		if (randNum==6) {
			break;
		}

		}
	}

}
