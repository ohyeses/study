import java.util.Scanner;

public class Ex03_for문2 {
	public static void main(String[] args) {
		// 1.1~100까지 3의 배수 출력

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// 2.1~100까지 3의 배수이면서 5의 배수 출력
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		// 3.한개의 자연수를 입력 받아 그 수의 배수를 차례로 10개 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int x = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.print(x * i + "\t");
		}
		
		System.out.println();
		//4. for문을 사용하여 구구단2단을 출력하세요

		for(int i=1; i<10; i++) {
			// System.out.println("2"+"*"+ i+"="+ 2*i );
			// 포매팅
			// \t \n
			System.out.printf("2*%d=2*%d\n",i,2*i);
		}

		
		
	}
}
