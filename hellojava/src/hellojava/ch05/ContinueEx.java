package hellojava.ch05;

public class ContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);

		}
		
		for (int j=1;j<=10;j+=2) {
			System.out.println(j);
		}
	}

}
