import java.util.Random;
import java.util.Scanner;

public class Ex07_PlusGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		// nextInt(랜덤숫자개수)+시작값
		int num1;
		int num2;


		while (true) {
			num1 = rd.nextInt(9 + 1);
			num2 = rd.nextInt(9 + 1);
			
			System.out.println("===Plus Game===");
			System.out.printf("%d+%d=", num1, num2);			
			int result = sc.nextInt();
			
			if (result == num1 + num2) {
				System.out.println("Success");
				break;
			} else {

				System.out.println("Fail");
			}

		}

	}
}
