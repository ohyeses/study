import java.util.Scanner;

public class Ex06_IF실습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();

		if (score >= 90 && score <= 100) {
			System.out.println("A학점입니다.");
		} else if (score >= 80) {
			System.out.println("B학점입니다.");
		} else if (score >= 70) {
			System.out.println("C학점입니다.");
		} else {
			System.out.println("D학점입니다.");
		}
	}

}
