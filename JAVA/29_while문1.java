import java.util.Scanner;

public class Ex01_while문1 {

	public static void main(String[] args) {
		//키보드로부터 정수를 입력받아 
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		//10이하일때만 계속 입력
		while(num<=10) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
		}
		
		//10초과면 종료되었습니다 출력
		System.out.println("종료되었습니다.");
	}

}
