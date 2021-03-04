import java.util.Scanner;

public class Ex04_for문3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//키보드로부터 단수 입력
		System.out.print("단수 입력 : ");
		int num = sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(num+"*"+ i+"="+ num*i );
		}
	}

}
