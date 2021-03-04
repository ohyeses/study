import java.util.Scanner;

public class Ex05_입출력 {
	public static void main(String[] args) {
		// 데이터타입 변수명 = new 데이터타입();
		Scanner sc = new Scanner(System.in);
		
		//~의 안에 .을
		System.out.print("정수 입력 : ");
		int number = sc.nextInt();
		
		// 출력문을
		// 입력한 정수는 20입니다.
		System.out.println("입력한 정수는 "+ number + "입니다.");
	}

}
