import java.util.Scanner;

public class Ex05_입력과출력 {

	public static void main(String[] args) {
		//1.마우스로 import
		//2. Ctrl + Space이용(자동완성)
		//3. Ctrl + Shift + o(전체 임포트)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>> ");
		sc.nextInt();
		int number = sc.nextInt();
		System.out.println("입력한 숫자는 : "+ number);
		
	}

}
