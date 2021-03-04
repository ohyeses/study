import java.util.Scanner;

public class Ex09_삼항연산자실습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("두 수의 차 :");
		System.out.println(num1<num2? num2-num1 : num1-num2);
		
	}

}
