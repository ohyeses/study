
public class Ex01_복습 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		int num3 = 1;
		 
		//sum 이라는 메소드 만듦
		//정수형 변수
		
		int result = sum(num1, num2);
		System.out.println("두 수 의 합은 : " + result + "입니다.");
		
		int result2 = sum(num1, num2, num3);
		System.out.println("세 수의 합은 : " + result2 + "입니다.");
	}

	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public static int sum(int num1, int num2) {

		return num1 + num2;
	}

}
