import java.util.Scanner;

public class Ex04_for��3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Ű����κ��� �ܼ� �Է�
		System.out.print("�ܼ� �Է� : ");
		int num = sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(num+"*"+ i+"="+ num*i );
		}
	}

}
