import java.util.Scanner;

public class Ex07_IF실습3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("소프트웨어 설계 : ");
		int num1 = sc.nextInt();
		System.out.print("소프트웨어 개발 : ");
		int num2 = sc.nextInt();
		System.out.print("데이터베이스 구축 : ");
		int num3 = sc.nextInt();
		System.out.print("프로그래밍 언어 활용 : ");
		int num4 = sc.nextInt();
		System.out.print("정보시스템 구축 관리 : ");
		int num5 = sc.nextInt();

		int Scoresum = num1 + num2 + num3 + num4 + num5;

		if (num1 < 8 || num2 < 8 || num3 < 8 || num4 < 8 || num5 < 8) {
			System.out.println("불합격입니다.");
		} else {
			// 여기 코드가 왔다는건
			// 각 과목이 8개 이상 맞았다는 뜻

			if (Scoresum >= 60) {
				System.out.println("합격입니다");
			}
			else {
				System.out.println("불합격입니다");
			}

		}
	}
}
