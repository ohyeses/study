import java.util.Scanner;

public class Ex06_산술연산자예쩨 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1-6 산술 연산자 예제
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println("두 수의 더하기 : "+ (num1+num2));
		System.out.println("두 수의 빼기 : "+ (num1-num2));
		System.out.println("두 수의 곱하기 : "+ num1*num2);
		System.out.println("두 수의 나누기(몫) : "+ num1/num2);
	}

}
