package hellojava.ch03;

public class quiz {
	public static void main(String[] args) {
		//p110 5번
		int lenT=5;
		int lenB=10;
		int h=7;
		double area1,area2,area3,area4;
		
		area1=(lenT+lenB)*h/2.0;
		area2=(lenT+lenB)*h*1.0/2;
		area3=(double)(lenT+lenB)*h/2;
		area4=(double)((lenT+lenB)*h/2);
		
		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);
		System.out.println(area4);
	}
}
