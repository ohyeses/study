import java.util.Scanner;

public class Ex05_for문4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 키보드로부터 정수 입력받아 약수 구하기
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for (int i = 1; i <= num / 2; i++) { //제일큰 약수는 num의/2
			// num을 1로 나눴을 때 나머지가 0이라면 1은 num의 약수
			// num % ??? ==0 -> ???는 num의 약수
			if (num % i == 0) {
				System.out.print(i + " ");
			}

		}
		System.out.println(num);

	}
}
