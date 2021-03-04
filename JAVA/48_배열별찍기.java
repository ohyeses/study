import java.util.Scanner;

public class Ex11_배열별찍기 {

	public static void main(String[] args) {
		int[] starArray = { 3, 4, 4, 2, 1 };

		for (int i = 0; i < starArray.length; i++) {

			System.out.print(starArray[i] + " " + ":");

			for (int j = 0; j < starArray[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		Scanner sc = new Scanner(System.in);
		int[] arr2 = new int[5];
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(i + 1 + "번째 별의 개수를 입력 >> ");
			arr2[i] = sc.nextInt();

		}

		for (int j = 0; j < arr2.length; j++) {
			System.out.print(j + 1 + "번째 별의 개수를 입력 >> ");
			for (int k = 0; k < arr2[j]; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
