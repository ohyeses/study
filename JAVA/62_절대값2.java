import java.util.Scanner;

public class Ex07_절대값2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 >> ");
		int num2 = sc.nextInt();
		
		System.out.println(getAbsoluteValue(num1,num2));
		System.out.println(getAbsoluteValue(10,1));
		
	}
	public static int getAbsoluteValue(int num1, int num2) {
		int result = 0;
		// 두 수 의 차를 구해서 num1-num2 의 값이 음수라면 양수로
		// num1 - num2 값이 양수라면 그대로
		// result에 담아서 result를 return
		
		if(num1-num2 < 0) {
			return (num1-num2) * -1;
		}else {
			return num1-num2;
		}
	}
}
