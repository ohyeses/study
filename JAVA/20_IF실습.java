import java.util.Scanner;

public class Ex05_IF�ǽ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("����� ��ǰ ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		int price = 10000;
		float discount = 0.1f;
		if (num <= 11) {
			System.out.println("������ " + num * price + "�� �Դϴ�.");
		} else {
			System.out.println("������ " + (int) (num * price * (1-discount)) + "�� �Դϴ�.");
			//System.out.println(10000*num-(10000*num*0.1));
		}
	}

}
