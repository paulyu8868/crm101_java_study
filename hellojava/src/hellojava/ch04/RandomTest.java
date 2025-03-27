package hellojava.ch04;

// Math.random()
// 0~1사이 난수 생성

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = Math.random();
		System.out.println("난수 생성:"+d);
		
		// 주사위 구현
		double dice=Math.random()*6; // 0~6 범위의 난수 생성
		dice+=1; // 1<=dice<7
		int diceVal=(int)dice;
		System.out.println(diceVal);
		
		int[] res= {0,0,0,0,0,0};
		for (int i=0;i<10000;i++) {
			double randVal=Math.random()*6+1;
			int diceValue=(int)randVal;
			res[diceValue-1]+=1;
		}
		for (int i=0;i<6;i++) {
			System.out.print(res[i]+"\t");
		}
	}

}
