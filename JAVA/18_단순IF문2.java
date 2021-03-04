import java.util.Scanner;

public class Ex03_단순IF문2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		
		int num = sc.nextInt();
		if (num%3==0 && num%5==0 ) 
			System.out.println("3과 5의 배수입니다.");
		
	}

}
