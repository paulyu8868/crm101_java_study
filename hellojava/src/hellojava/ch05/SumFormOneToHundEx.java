package hellojava.ch05;

public class SumFormOneToHundEx {
	public static void main(String[] args) {
		int sum,sum2,i;
		i=1;
		sum=0;
		sum2=0;
		while (i<=100) {
			sum+=i;
			i++;
		}
		for (int j=1;j<=100;j++) {
			sum2+=j;
		}
		System.out.println(sum+" "+sum2);
	}
}
