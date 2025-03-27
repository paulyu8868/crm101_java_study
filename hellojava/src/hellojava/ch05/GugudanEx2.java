package hellojava.ch05;

public class GugudanEx2 {
	public static void main(String[] args) {
		for (int i=0;i<=9;i++) {
			for (int j=2;j<=9;j++) {
				//System.out.print(j+" x "+i+" = "+(i*j)+"\t");
				if (i==0) {
					System.out.printf("***%d 단***\t",j);
				}else {
				System.out.printf("%d x %d = %d\t",j,i,(i*j));
				}
			}
			System.out.println();
		}
	}

}
