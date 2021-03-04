import java.util.Scanner;

public class Ex08_삼항연산자실습 {

	public static void main(String[] args) {
		System.out.print("정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		// 홀수인지 짝수인지 판별
		// 조건식 ? 실행문1 : 실행문2
		System.out.println(num%2==0 ? num + "은(는) 짝수입니다." :
			num + "은(는) 홀수입니다.");
		
		
		
	}

}
