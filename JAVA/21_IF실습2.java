import java.util.Scanner;

public class Ex06_IF�ǽ�2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();

		if (score >= 90 && score <= 100) {
			System.out.println("A�����Դϴ�.");
		} else if (score >= 80) {
			System.out.println("B�����Դϴ�.");
		} else if (score >= 70) {
			System.out.println("C�����Դϴ�.");
		} else {
			System.out.println("D�����Դϴ�.");
		}
	}

}
