
public class Ex02_for문 {

	public static void main(String[] args) {
		// for (초기화 구문; 조건식; 반복 후 작업){
		// 실행문장
		//}
		
		for(int i=1; i<=10; i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		//1. for문을 사용하여 21에서 57까지 출력
		for (int j=21; j<=57; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
		
		//2. for문을 사용하여 96에서 53까지
		System.out.println();
		for (int a=96; a>=53; a--) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		//3. for문을 사용하여 21에서 57까지 중 홀수만 출력
		for (int x=21; x<=57; x+=2) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

}
