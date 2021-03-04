import java.util.Scanner;

public class Ex06_절대값 {

	public static void main(String[] args) {
		// 키보드로부터 숫자 정수 하나 입력
		// num 이라는 변수에 저장
		// -5라는 값이 있으면 5라는 값으로 출력
		// getAbsoluteValue(num)
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int num = sc.nextInt(); 
		System.out.println(getAbsoluteValue(num));
		System.out.println(getAbsoluteValue(6));
		System.out.println(Math.abs(-7));

	}									//Alt + shift + r
	public static int getAbsoluteValue(int num) {	
		if (num < 0) {
			return num  = num * -1;
		}else {
			return num;
		}
	}
	
	
}
