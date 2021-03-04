import java.util.Scanner;

public class Ex01_복습 {
	public static void main(String[] args) {
		//오늘 날짜를 입력받아서
		// 날짜가 짝수라면 돈까스
		// 날짜가 홀수라면 중식을 출력
		System.out.print("오늘의 날짜를 입력해주세요 >>");
		Scanner sc = new Scanner(System.in);
		
		int date = sc.nextInt();
		System.out.println(date%2==0 ? "돈까스":"중식");
	}
}
