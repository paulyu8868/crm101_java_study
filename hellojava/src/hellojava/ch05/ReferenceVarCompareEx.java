package hellojava.ch05;
// 참조 타입 변수 비교

public class ReferenceVarCompareEx {
	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
		arr1=new int[] {}; // 배열 객체 생성
		arr2=new int[] {}; // 배열 객체 생성
		arr3=arr2; // 주소값 할당
		
		System.out.println(arr1==arr2);
		System.out.println(arr2==arr3);
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
	}
}
