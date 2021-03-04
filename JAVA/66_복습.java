import java.util.Scanner;

public class Ex01_복습 {

	public static void main(String[] args) {
		//num1 num2 선언.
		//char 형 operator 라는 변수 선언
		// - + * / 네가지만.
		// Cal이라는 ㅁㅔ소드를 통해서 3개 매개변수를 넘겨준다.
		// Scanner 사용 -> 정수, 연산자 입력
		// .charAt(index);
		//  next관련 함수에서는 char형으로 입력을 받아주는 함수를 찾지 못함.
		// next를 통해 받은 String에서 charAt을 통해 char값을 입력받았다.
		Scanner sc = new Scanner(System.in);
		System.out.println("─────계산기────");
		
		
		System.out.print("정수입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력 : ");
		char op = sc.next().charAt(0); //charAt을 사용해서 첫번째것만 뽑아온다.
		
		
		System.out.println(cal(num1, num2, op));
	}

	public static int cal(int num1, int num2, char op) {
		int result = 0;
		switch (op) { 
			case '+' :
				result = num1 + num2;
				break;
			case '-' :
				result = num1 - num2;
				break;
			case '*' :
				result = num1 * num2;
				break;
			case '/' :
				result = (int)(num1 / num2);
				break;
			default : 
				break;
		}
		return result;
	}

}
